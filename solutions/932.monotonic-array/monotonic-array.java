class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        if(n == 1)
            return true;

        int i = 1;
        while(i < n && nums[i] == nums[0])
            i++;

        if(i >= n) return true;
                
        boolean flag = false;
        if(nums[i] > nums[0])
            flag = true;
        
        if(flag){
            for(int j = i;j<n;j++)
                if(nums[j] < nums[j-1])
                    return false;
        }else{
            for(int j = i;j<n;j++)
                if(nums[j] > nums[j-1])
                    return false;
        }
        
        
        return true;
    }
}