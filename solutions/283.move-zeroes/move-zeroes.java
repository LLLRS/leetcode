class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        //将所有不是零的元素存入字符序列
        for(int i=0;i<nums.length;i++)
        	if(nums[i]!=0)
        		if(i!=k){
        			nums[k++] = nums[i];
        			nums[i] = 0;
        		}else
                    k++;
    }
}