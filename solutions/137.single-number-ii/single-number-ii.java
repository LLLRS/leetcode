class Solution {
    public int singleNumber(int[] A) {
        
        int one = 0; //出现了一次
        int two = 0;   //出现了两次
        int three = 0;   //出现了三次
            
        for(int i=0;i<A.length;i++ ){
            int t = A[i];
            
            two |= one&t;
            one ^= t;
            three = one&two;
            two &= ~three;
            one &= ~three;
        }   
        
            
        return one;
    }
}