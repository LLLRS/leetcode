class Solution {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int res = nums[0];
        int max = nums[0],min = nums[0];
        

        for(int i=1;i<n;i++){
            if(nums[i] < 0){
                int t = max;
                max = min;
                min = t;
            }
            

            max = Math.max(nums[i],max * nums[i]);
            min = Math.min(nums[i],min * nums[i]);
            
            res = Math.max(max,res);
        }
        

        return res;
    }
}