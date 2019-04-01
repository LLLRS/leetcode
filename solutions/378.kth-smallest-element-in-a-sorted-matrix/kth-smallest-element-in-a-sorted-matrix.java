class Solution {
    public static int kthSmallest(int[][] matrix, int k) {

        int n = matrix.length;

        int l = matrix[0][0],r = matrix[n-1][n-1] + 1;
        while(l < r){
            int m = l +(r - l)/2;
            int cnt = 0,j = n-1;
            for(int i=0;i<n;i++){
                while(j>=0 && matrix[i][j] > m)  j--;
                cnt += (j+1);
            }

            if(cnt < k) l = m+1;
            else r = m;

        }

        return l;
    }

}