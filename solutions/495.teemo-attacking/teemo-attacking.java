class Solution {
    public int findPoisonedDuration(int[] nums, int dur) {
                
        int res = dur;
        int n = nums.length;
        if(n == 0) return 0;
        
        for(int i=n-1;i>0;i--){
            if(nums[i] - nums[i-1] >= dur)
                res += dur;
            else
                res += nums[i] - nums[i-1];
        }
        
        return res;
    }
}