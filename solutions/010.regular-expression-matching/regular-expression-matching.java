public class Solution {
    public boolean isMatch(String st, String pt) {
        if(st==null || pt == null) 
            return false;
        int m = st.length();
        int n = pt.length();
        char[] s = st.toCharArray();
        char[] p = pt.toCharArray();
        
        boolean[][] dp = new boolean[m+1][n+1]; //dp[i][j]的含义是s[0-i] 与 s[0-j]是否匹配
        dp[0][0] = true; ////初始化第0行,除了[0][0]全为false
        
        //初始化第0列，只有X*能匹配空串，如果有*，它的真值一定和p[0][j-2]的相同（略过它之前的符号）
        for (int j = 1; j <= n; j++)
            dp[0][j] = j > 1 && '*' == p[j - 1] && dp[0][j - 2];
        
        for(int i = 1;i <= m;i++){
            for(int j = 1;j <= n;j++){
                if(p[j-1] == '*')
                    dp[i][j] = dp[i][j - 2] || (s[i - 1] == p[j - 2] || p[j - 2] == '.') 
                                    && dp[i - 1][j];
                else
                    dp[i][j] = (s[i - 1] == p[j - 1] || p[j - 1] == '.') && dp[i - 1][j - 1];
            }
        }
            
        return dp[m][n];
    }

}