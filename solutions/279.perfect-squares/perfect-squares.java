class Solution {
    int[] count = null;
    
    public int numSquares(int n) {
        count = new int[n+1];
        Arrays.fill(count,Integer.MAX_VALUE);
        
        return numSquaresAux(n,1);
    }
    
    private int numSquaresAux(int n,int cnt){
        int t = (int)Math.sqrt(n);
        int res = Integer.MAX_VALUE;
        if(count[n] != Integer.MAX_VALUE)
            return count[n];
        
        for(int i=t;t>=1;t--){
            int tt = n-t*t;
            if(tt==0) 
                return cnt;

            res = Math.min(res,numSquaresAux(tt,cnt)+1);
        }
        count[n] = res;
        return res;   
    }

}