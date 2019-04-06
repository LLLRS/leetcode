class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        
        int t = 1;
        while(t < n)
           t = t*2 + 1; 

        return t - n;
    }
}