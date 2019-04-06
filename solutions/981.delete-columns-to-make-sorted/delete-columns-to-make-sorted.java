class Solution {
    public int minDeletionSize(String[] nums) {
        int res = 0;
        
        int n = nums.length;
        int len = nums[0].length();
        
        for(int i=0;i<len;i++){
            for(int j=1;j<n;j++){
                if(nums[j].charAt(i) < nums[j-1].charAt(i)){
                    res++;
                    break;
                }
            }
        }
        
        
        return res;
    }
}