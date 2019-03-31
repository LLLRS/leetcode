class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        int len = nums.length;
        if(len<2) return false;
        
        for(int i=1;i<len;i++){
            long sum = nums[i];
            for(int j=i-1;j>=0;j--){
                sum += nums[j];               
                if(sum==k||(k!=0&&sum%k==0))
                    return true;

            }  
        }
        
        return false;
    }
}