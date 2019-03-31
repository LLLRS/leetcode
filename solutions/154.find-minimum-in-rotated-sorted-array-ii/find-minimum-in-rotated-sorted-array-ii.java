class Solution {
    public int findMin(int[] nums) {

        return  findMinAux(nums,0,nums.length-1);
    }
    
    private int  findMinAux(int[] nums,int l,int r){
        if(l>r) return Integer.MAX_VALUE;
        
        if(r-l==1) return nums[l] > nums[r] ? nums[r] : nums[l];
        
        int mid = l + (r-l)/2;
        if(mid==0||nums[mid]<nums[mid-1]) return nums[mid];
        
    
        return Math.min(findMinAux(nums,l,mid-1),findMinAux(nums,mid+1,r));
    }
}