class Solution {
    public double largestTriangleArea(int[][] points) {
        if(points == null || points.length < 3)
            return 0;
        int n = points.length;
        double res = 0;

        for (int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                for(int k=j+1;k<n;k++)
                    res = Math.max(res,getArea(points,i,j,k));

        return res;
    }

    private double getArea(int[][] points,int i,int j,int k) {
        
        return 0.5 * Math.abs(points[i][0] * points[j][1] + points[j][0] * points[k][1] +
                             points[k][0] * points[i][1]- points[j][0] * points[i][1] -
                             points[k][0] * points[j][1] - points[i][0] * points[k][1]);
    }
}