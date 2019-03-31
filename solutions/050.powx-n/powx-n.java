//pow(x,n) = pow(x,n/2)*pow(x,n-n/2)

class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        
        
        if(n==Integer.MIN_VALUE) return (1/x)*myPow(x,n+1);
        
        if(n<0){
            x = 1/x;
            n = -n;
        }
        
        double t = myPow(x,n/2);
        
        return  n%2 == 0 ? t*t : x*t*t;
    }
}