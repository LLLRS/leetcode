class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> res = new ArrayList<>(); 
        
        Arrays.sort(nums); //n*log(n)    
        
        for(int i=0;i+2<nums.length;i++){
        	  	
        	if(i>0&&nums[i] ==nums[i-1]) continue;
            
        	int l = i+1,r=nums.length-1;
        	
        	while(l<r){
            	if(nums[l]+nums[r]>-nums[i]) r--;
            	else if(nums[l]+nums[r]<-nums[i]) l++;
            	else{
                    res.add(Arrays.asList(nums[i], nums[l++], nums[r--]));

                    while (l < r && nums[l] == nums[l - 1]) l++;  
                    while (l < r && nums[r] == nums[r + 1]) r--;  

            	}
        	}
        }
        return res;
    }
}