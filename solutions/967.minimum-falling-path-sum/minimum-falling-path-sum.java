class Solution {
        
    public int minFallingPathSum(int[][] nums) {
        
        int n = nums.length;
        int[][] ts = new int[n][n];
        for(int i=0;i<n;i++)
            ts[0][i] = nums[0][i];
        
        for(int i=1;i<n;i++){

            for(int j=0;j<n;j++){
                int t1 = j-1>=0 ? ts[i-1][j-1] : Integer.MAX_VALUE;
                int t2 = j+1<n  ? ts[i-1][j+1] : Integer.MAX_VALUE;
                
                ts[i][j] = Math.min(ts[i-1][j],Math.min(t1,t2)) + nums[i][j];
            }

        }
        
        int res = ts[n-1][0];
        for(int i=1;i<n;i++)
            res = Math.min(res,ts[n-1][i]);
                
        return res;
    }
    
}