class Solution {

    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        
        int[] res = new int[n];
        
//      res[i] 表示从[0,i]的最大珠宝数
        res[0] = nums[0];
        
        for(int i=1;i<n;i++)
            res[i] = Math.max(res[i-1],nums[i]+(i-2>=0?res[i-2]:0));
            
        return res[n-1];        
    }

}