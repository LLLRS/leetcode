/*
* 定义状态dp[i] [j]是S [ 0…j—1 ]中的T〔0…i—1〕的不同子序列的数目
*
*一般情况1：t[i-1]！＝S[j—1] 则 dp[i] [j]＝dp[i] [j- 1 ]
*一般情况2：t[i- 1 ]＝s[j-1 ] 则 dp[i] [j]＝dp[i] [j- 1 ] +dp[i－1 ] [j- 1 ]
*/

class Solution {
    int numDistinct(String s, String t) {
        
        int m = t.length(), n = s.length();
        int[] dp = new int[n+1];
        
        for (int j = 0; j <= n; j++) 
            dp[j] = 1;
        
        for (int i = 1; i <= m; i++){
            int[] tem = new int[n+1];
            for (int j = 1; j <= n; j++)
                tem[j] = tem[j - 1] + (t.charAt(i-1) == s.charAt(j-1) ? dp[j - 1] : 0);
            
            
            dp = tem;
        }
        return dp[n];
    }
}