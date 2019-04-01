class Solution {
    public boolean isPerfectSquare(int n) {
        if( n == 1)
            return true;
        long l = 1,h = n/2;
        long nt = (long) n;
        
        return isPerfectSquare(nt,l,h);
    }
    
    private boolean isPerfectSquare(long n,long l,long r){
        if( l > r)
            return  false;
        
        long m = l +(r-l)/2;
        long t = m * m;
        if(t == n)
            return true;
        else if(t > n)
            return isPerfectSquare(n,l,m-1);
        else
            return isPerfectSquare(n,m+1,r);
    }
}