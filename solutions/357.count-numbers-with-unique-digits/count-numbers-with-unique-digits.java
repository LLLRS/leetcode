class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        
        if(n>10) return countNumbersWithUniqueDigits(10);

        
        int[] res = new int[n+1];
        res[0] = 1;
        int cnt = 0;
        for(int i=1;i<=n;i++){
            res[i] = (10-i+1) * res[i-1] + cnt;
            cnt += res[i-1];          
        }
        
        
        return res[n];
        
    }
}