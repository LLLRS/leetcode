class Solution {
    int[][] memo = null;
    public boolean canPartition(int[] nums) {
        
        int n = nums.length;
        if(n==0) return false;
        int sum = 0;
        for(int i=0;i<n;i++)
            sum += nums[i];
        
        if(sum%2!=0) return false;
        int c = sum/2;
        memo = new int[n][c+1];
                
        return tryAux(nums,n-1,c);
     }
    
    private boolean tryAux(int[] nums,int st,int c){
        
        if(st<0||c<0)
            return false;       
        if(c==0)
            return true;
        
        if(memo[st][c]!=0)
            return memo[st][c]>0;
        
        boolean t = tryAux(nums,st-1,c)||tryAux(nums,st-1,c-nums[st]);

        memo[st][c] =  t ? 1 : -1;
        return t;
        
    }
}