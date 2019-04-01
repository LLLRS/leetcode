class Solution {
    public int nthUglyNumber(int n) {
        
        int[] res = new int[n];
        int i2=0,i3=0,i5=0;
        res[0] = 1;
        
        int idx=1;
        while(idx<n){
            int t1 = res[i2]*2;
            int t2 = res[i3]*3;
            int t3 = res[i5]*5;
            int min = Math.min(Math.min(t1,t2),t3);
            
            if(min==t1) i2++;
            if(min==t2) i3++;
            if(min==t3) i5++;
            
            res[idx++] = min;
        }
        
        
        return res[n-1];
    }
}