class Solution {
    public String reverseVowels(String s) {
     	if(s.isEmpty()) return s;
		
		char[] arr = {'A','E','I','O','U','a','e','i','o','u'};;
        char[] nums = s.toCharArray();
        
        int l = 0,r = s.length()-1;       
        while(l<=r){
        	while(l<=r&&Arrays.binarySearch(arr, nums[l])>=0&&Arrays.binarySearch(arr, nums[r])>=0)
        			swap(nums,l++,r--);
        	while(l<=r&&Arrays.binarySearch(arr, nums[l])<0)
        		l++;
        	if(l<=r&&Arrays.binarySearch(arr, nums[r])<0)
        		r--;
        }
        
        return String.valueOf(nums);
    }
	
    public void swap(char[] nums,int num1,int num2){
    	char temp = nums[num1];
    	nums[num1] = nums[num2];
    	nums[num2] = temp;
    	
    }
}