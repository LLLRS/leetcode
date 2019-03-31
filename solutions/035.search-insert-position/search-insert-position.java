class Solution {
     public int searchInsert(int[] nums, int tar) {
    	 if(tar<nums[0]) 
             return 0;
    	 else if(tar>nums[nums.length-1]) 
             return nums.length;
    	 else   	
    		 return searAux(nums,0,nums.length-1, tar);
     }

	private int searAux(int[] nums, int l, int r, int tar) {
		
		int mid = l + (r-l)/2;
		
		if(nums[mid]==tar)  return mid;
		else if(nums[mid]>tar){
			if(tar>nums[mid-1])
				return mid;
			return searAux(nums,l,mid-1, tar);
			
		}else{
			if(tar<nums[mid+1])
				return mid + 1;
			return searAux(nums,mid+1,r, tar);
		}
	}
}