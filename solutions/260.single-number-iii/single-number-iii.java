class Solution {
    public int[] singleNumber(int[] nums) {
        
        int diff = 0;
        for(int i=0;i<nums.length;i++)
            diff ^= nums[i];
        
        
        diff &= -diff;
        int[] res = {0,0};
        for(int i=0;i<nums.length;i++){
            if( (nums[i] & diff) == 0)
                res[0] ^= nums[i];
            else
                res[1] ^= nums[i];
        }
        
        return res;
    }
}