class Solution {
    
    public  int change(int amount, int[] coins) {
               
        if(amount==0) return 1;
        
    	int len = coins.length;
    	if(len==0) return 0;
    	
    	
    	int[] dp = new int[amount+1];
    	dp[0] = 1;
    	
        for(int i=0;i<len;i++){
        	for(int j=1;j<=amount;j++){
        		if(coins[i]<=j)
        			dp[j] = dp[j] + dp[j-coins[i]];	
        	}
        }
                    
        return dp[amount];
    }
    
}