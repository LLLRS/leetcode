class Solution {
    
    public int combinationSum4(int[] nums, int ta) {
        int n = nums.length;
        if(n==0) return 0;
        
        int[] res = new int[ta+1];
        res[0] = 1;
        
        for(int i=1;i<=ta;i++){
            for(int j=0;j<n;j++){
                if(i>=nums[j])
                    res[i] += res[i-nums[j]];
            }
        }
        
        return res[ta];
    }
    
}