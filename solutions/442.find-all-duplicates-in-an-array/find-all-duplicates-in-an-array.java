class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> res = new ArrayList<>();        
        int len = nums.length;
     
        for(int i=0;i<len;i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx]<0)
                res.add(Math.abs(nums[i]));
            
            nums[idx] = -nums[idx];
        }
        
        return res;
    }
}