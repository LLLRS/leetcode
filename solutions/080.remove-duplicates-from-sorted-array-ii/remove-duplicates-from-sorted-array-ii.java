class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1,count = 0;
		if(nums.length==0) return 0;
        
		for(int i =1;i<nums.length;i++){
			if(nums[i]==nums[i-1]){
				count++;
				if(count<2)
					nums[k++] = nums[i];
			}else{
				count = 0;
				nums[k++] = nums[i];
			}
		}
        return k;
    }
}