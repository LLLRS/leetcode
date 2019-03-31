class Solution {
    public void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1) return;
        int len = nums.length;
        
        int l = len-1;
        while(l>0&&nums[l-1]>=nums[l]) l--;
        
        if(l==0){
            reverse(nums,0);
            return;
        }
        
        int r = l;
        while(r<len&&nums[r]>nums[l-1]) r++;
        
        swap(nums,l-1,r-1);
        reverse(nums,l);

        return;
    }
    
    private void reverse(int[] nums,int k){
        if(nums==null || nums.length<=k)
            return;

        int len = nums.length;
        for(int i=0;i<(len-k)/2;i++){
            int m = k+i;
            int n = len-1-i;
            if(m<=n){
                swap(nums,m,n);
            }
        }
    }

    private void swap(int[] cs,int i,int j){
        int temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
}