class Solution {
    public int longestValidParentheses(String s) {
        
        int max = 0;
        int n = s.length();
        int[] dp = new int[n];
        for(int i=1;i<n;i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i-1) == '(')
                    dp[i] = 2 + (i>=2 ? dp[i-2] : 0);
                else if(i - dp[i-1] > 0 && s.charAt(i-dp[i-1] - 1) == '(')
                    dp[i] = 2 + dp[i-1] + (i-dp[i-1] - 2 >=0 ? dp[i-dp[i-1] - 2] : 0);
            }
            
            if( dp[i] > max) max = dp[i];
            
        }
        
        return max;
        
    }
}