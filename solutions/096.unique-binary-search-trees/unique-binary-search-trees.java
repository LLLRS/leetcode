class Solution {
    public int numTrees(int n) {
        if(n==1) return 1;
        
        int[] res = new int[n+1];
        
        res[1] = 1;
        res[2] = 2;
        
        for(int i=3;i<n+1;i++){
            int m = 0;
            for (int j = 1; j < i-1; j++) {
                m += (res[j] * res[i-1-j]);
            }
            
            res[i] = 2*res[i-1] + m;
        }
        
        return res[n];
    }
}