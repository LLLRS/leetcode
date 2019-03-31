//把每个数都尽可能放在其正确的位置上  5 --> nums[4].

public class Solution {
    public int firstMissingPositive(int[] nums) {
        
        if(nums==null||nums.length==0) return 1;
        int n = nums.length;
        
        for(int i=1;i<n;i++)
            while(nums[i]>0&&nums[i]<=n&&nums[nums[i] - 1] != nums[i])
                swap(nums,i,nums[i] - 1);
        
        for(int i=0;i<n;i++)
            if(nums[i]!=i+1)
                return i+1;
        
        return n+1;
                
    }
    
    
    private void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}