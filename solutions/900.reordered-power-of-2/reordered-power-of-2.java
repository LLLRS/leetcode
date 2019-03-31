class Solution {
    public boolean reorderedPowerOf2(int n) {
        
        int[] t = count(n);
        for(int i = 0;i < 31;i++){
            if(Arrays.equals(t,count(1 << i)))
                return true;
        }
        
        return false;
    }
    
    private int[] count(int n){
        
        int[] nums = new int[10];
        while(n > 0){
            nums[n % 10] ++;
            n = n / 10;
        }
        
        return nums;
    }
}