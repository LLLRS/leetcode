class Solution {
    public int hammingDistance(int x, int y) {
        
        return numOfOne( x^y );
    }
    
    private int numOfOne(int n){
        int res = 0;
        while(n > 0){
            res++;
            n = (n-1) & n;
        }
        
        return res;
    }
}