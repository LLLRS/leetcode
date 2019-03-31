class Solution {
    
    int[] res = {-1,-1};
    public int[] searchRange(int[] nums, int tar) {
        int n = nums.length;
        if(n==0)  return res;
        
        binarySearch(nums,tar,0,n-1); 
        
        return res;
    }
    
    private void binarySearch(int[] nums,int tar,int l,int r){

        if(r<l) return;
        
        int m = l + (r-l)/2;
        if(nums[m]==tar){
            int lt = m, rt = m;
            while(lt>=0&&tar==nums[lt])  
                lt--;
            while(rt<=nums.length-1&&tar==nums[rt])
                rt++;
            
            res[0] = lt+1;
            res[1] = rt-1;            
        }else if(nums[m]<tar)             
            binarySearch(nums,tar,m+1,r);
        else 
            binarySearch(nums,tar,l,m-1); 

    }
}