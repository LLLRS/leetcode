class Solution {
    public int wiggleMaxLength(int[] nums) {
         int n = nums.length;
         if(n<=1) return n;
          
          
          int res = 1;
          int st = 0;
          for(int i=1;i<n;i++){
        	  
        	  if((st==0||st==1)&&nums[i]>nums[i-1]){
        		 st =  -1;
        		 res ++; 

        	  } else if((st==0||st==-1)&&nums[i]<nums[i-1]){
        		 st =  1;
        		 res ++; 
        	  }         	  
          }
          return res; 
      }
}