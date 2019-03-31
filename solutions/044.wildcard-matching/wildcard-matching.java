class Solution {
    public boolean isMatch(String s, String p) {
	
        boolean[] dp = new boolean[s.length()+1];   
        char[] sStr = s.toCharArray();
        char[] pStr = p.toCharArray();
        dp[0] = true;   
        
        for (int j=1; j<=pStr.length; j++) {
            char pChr = pStr[j-1];
            if (pChr == '*') {

                for (int i=1; i<=sStr.length; i++) {
                    dp[i] = dp[i] || dp[i-1];
                }
            } else {

                for (int i=sStr.length; i>=1; i--) {
                    if (sStr[i-1] == pChr || pChr == '?') {
                        dp[i] = dp[i-1];
                    } else {
                        dp[i] = false;
                    }
                }
                
                dp[0] = false;
            }
        }
        return dp[sStr.length];
    }
}