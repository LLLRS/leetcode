class Solution {
    public int getSum(int a, int b) {
        
        int sum = 0;
        int du = 0;
        
       do{
            sum = a ^ b;
            du = (a & b) << 1;
            a = sum;
            b = du;
        } while(b != 0);
        
        return sum;
    }
}