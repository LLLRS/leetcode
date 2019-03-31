class Solution {
    public int maxSubArray(int[] nums) {
               
        int n = nums.length;
        int[] dp = new int[n];

        dp[0] = nums[0];
        for(int i=1;i<n;i++){
            int t = dp[i-1] + nums[i];
            dp[i] = t > nums[i] ? t : nums[i];
        }

        int max = dp[0];
        for(int i=1;i<n;i++){
            if(max < dp[i])
                max = dp[i];
        }

        return max;
    }
}