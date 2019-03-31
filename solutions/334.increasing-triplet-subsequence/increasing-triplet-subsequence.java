class Solution {
    public boolean increasingTriplet(int[] nums) {

        int n = nums.length;
        if(n<3) return false;
        
        int[] memo = new int[n];
        Arrays.fill(memo,1);
        
        int cnt = 0;
        int t = nums[0];
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i] > nums[j]){
                    memo[i] = Math.max(memo[i],1+memo[j]);
                    if(memo[i] == 3)
                        return true;
                }
            }
        }

        return false;
    }
}