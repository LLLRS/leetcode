class Solution {

    public static int preimageSizeFZF(int k) {

        
        boolean res = false;
        long l = 0, r =  5L * (k + 1);
        
        while(l <= r){
            long m = l + (r-l)/2;
            long t = trailingZeroes(m);
            
            if( t == k) {
                res = true;
                break;
            }else if( t > k)
                r = m - 1;
            else
                l = m + 1;

        }

        return res ? 5 : 0;
    }

    public static long trailingZeroes(long n) {
        if(n == 0)
            return 0;

        return n/5 + trailingZeroes(n/5);
    }
}