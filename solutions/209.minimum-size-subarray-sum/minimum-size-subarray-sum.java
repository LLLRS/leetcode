class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        		
		int l = 0,r = -1;
		int count = nums.length + 1;
		int sum = 0;
		
        while(l<nums.length){
            
            if(r+1<nums.length&&sum<s)
                sum = sum + nums[++r];
            else 
                sum = sum - nums[l++];
            
            count = sum>=s ?Math.min(count, r-l+1):count ;            
        }
        if(count == nums.length + 1)
            return 0;
        return count;
    }
}