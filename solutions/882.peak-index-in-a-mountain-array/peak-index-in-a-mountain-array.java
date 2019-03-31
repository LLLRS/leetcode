class Solution {
    public int peakIndexInMountainArray(int[] nums) {
                
        int n = nums.length;
        if(n == 1) return 0;
        
        return findPeakElement(nums,0,n-1);
    }
    
    public int findPeakElement(int[] nums,int l,int r) {

        if(l > r) return -1;
        int m = l + (r - l) /2;
        
        if( m==0 || m== nums.length-1 )
            return -1;
        
        if(nums[m+1] < nums[m] &&  nums[m-1] < nums[m])
            return m;

        int res =  findPeakElement(nums,l,m-1);
        
        if(res != -1) return res;
        
        return findPeakElement(nums,m+1,r);
    }
}