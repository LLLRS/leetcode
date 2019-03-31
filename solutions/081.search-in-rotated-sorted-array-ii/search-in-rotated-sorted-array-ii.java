class Solution {
 
    public boolean search(int[] nums, int tar) {
        int n = nums.length;
        if(n==0)  return false;
        
        return binarySearch(nums,tar,0,n-1);     
    }
    
    private boolean binarySearch(int[] nums,int tar,int l,int r){
        if(r<l) return false;
        
        int m = l + (r-l)/2;
        if(nums[m]==tar)  
            return true;
        else if(nums[m]<tar){            
            boolean t = binarySearch(nums,tar,m+1,r);
            return t  ? t: binarySearch(nums,tar,l,m-1) ;
        }else {
             boolean t =  binarySearch(nums,tar,l,m-1); 
            return  t  ? t : binarySearch(nums,tar,m+1,r);
        }
    }
}