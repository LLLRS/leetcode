class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int maxLen = 0;
        int n = nums.length;
        int l = 0;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                maxLen = Math.max(maxLen,i-l);
                l = i + 1;
            }
        }

        maxLen = Math.max(maxLen,n-l);
        return maxLen;
    }
}