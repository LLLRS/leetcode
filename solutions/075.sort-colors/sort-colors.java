class Solution {
    public void sortColors(int[] nums) {
    
        int[] count = new int[4];
        int n = nums.length;
        
        for(int i=0;i<n;i++)
            count[nums[i] + 1] ++;
        
        for(int i=1;i<4;i++)
            count[i] = count[i] + count[i-1];
        
        int[] aux = new int[n];
        for(int i=0;i<n;i++)
            aux[count[nums[i]]++] = nums[i];
        
        for(int i=0;i<n;i++)
            nums[i] = aux[i];
    	
    }
    
    public static void swap(int[] nums,int num1,int num2){
    	int temp = nums[num1];
    	nums[num1] = nums[num2];
    	nums[num2] = temp;
    	
    }
}