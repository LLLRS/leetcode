class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        int len = 0;

        for(int num : nums){
            int t = Arrays.binarySearch(memo,0,len,num);   //在数组内，索引；否则返回 (-(插入点) - 1)
            if(t < 0 )
                t = -(t + 1);

            memo[t] = num;
            if(t == len) len ++;
        }

        return len;
    }
}