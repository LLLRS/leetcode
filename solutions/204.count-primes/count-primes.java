class Solution {
    public int countPrimes(int n) {
        
        //筛出法
        int res = 0;
        
        boolean[] t = new boolean[n];
        
        for(int i=2;i<n;i++){
            if(!t[i]){
                res++;
                for(int j=2;i*j<n;j++)
                    t[i*j] = true;
            }
        }
        
        return res;
    }

}