class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        
        
        for(int i=0;i<len;i++){
            
            int t = (nums[i] >0? nums[i] : -nums[i]) - 1;         
            nums[t] = nums[t] <0? nums[t] : -nums[t];
        }
            
        
         for(int i=0;i<len;i++)
             if(nums[i]>0)
                 res.add(i+1);
        
        return res;
    }
}