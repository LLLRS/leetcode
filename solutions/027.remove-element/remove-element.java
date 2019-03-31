class Solution {
    public int removeElement(int[] nums, int val) {
        
        int r = nums.length;
        int i = 0;
        
        while(i<r){
            if(nums[i]!=val)
                i++;
            else
                swap(nums,i,--r);
        }
        
        return r;
    }
    
    public void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    
}