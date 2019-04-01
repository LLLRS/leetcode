class Solution {
    public int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        
        int l = 0, r = nums.length-1;
        while (l < r-1) {  
            int mid = l + (r-l)/2;
            if (nums[mid] > nums[r]) 
                l = mid; 
            else 
                r = mid; 
        }
        if (nums[l] > nums[r]) 
            return nums[r]; 
            
        return nums[l];
    }
}