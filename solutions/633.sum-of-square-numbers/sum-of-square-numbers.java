public class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            
            int b = c - (int)(a * a);
            if (bs(0,b,b))
                return true;
        }
        return false;
    }
    
    private boolean bs(long l,long r,int b){
        if(l > r) 
            return false;
        
        long m = l + (r - l)/2;

        if(m * m == b )
            return true;
        else if(m * m > b)
            return bs(l, m-1,b);
        else
            return bs(m+1,r,b);
            
    }
    
}

