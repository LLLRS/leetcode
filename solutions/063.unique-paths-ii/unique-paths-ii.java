class Solution {
    public int uniquePathsWithObstacles(int[][] ob) {
        
        int m = ob.length;
        int n = ob[0].length; 
        if(ob[0][0]==1||ob[m-1][n-1]==1) return 0;
        
        int[] dp = new int[n];
        int p = 0;
        for(;p<n;p++){
            if(ob[0][p]==1) break;
            dp[p] =  1;
        }
        for(int i=p ;i<n;i++)
            dp[i] = 0;
        
        
        int k = 1;
        for(;k<m;k++){
            if(ob[k][0]==1) break;
            dp[0] =  1;
        }
        
            

        for(int i=1;i<m;i++){
            if(i>=k) dp[0] = 0;
            for(int j=1;j<n;j++)
                if(ob[i][j]==1)
                    dp[j] = 0;
                else
                    dp[j] = dp[j] + dp[j-1];
        }
        return dp[n-1];
    }
}