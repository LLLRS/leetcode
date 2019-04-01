class Solution {
    
    public int integerBreak(int n) {
        int[] res = new int[n+1];
        Arrays.fill(res,0);
        
        for(int i=2;i<=n;i++)
            for(int j=1;j<i;j++)
                res[i] = max3(res[i],j*(i-j), j*res[i-j]);
        
        return res[n];
    }

    
    private int max3(int a,int b,int c){
        return Math.max(a,Math.max(b,c));
    }
}