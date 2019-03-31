class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        if(len <= 1) return true;
        int r = len -1;
        
        for(int i=len-2;i>=0;i--){
            
            if(r-i>nums[i]) continue;
            if(i<=nums[0]) return true;
            
            r = i;
            
        }
        
        return false;
        
    }
}