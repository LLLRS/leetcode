class Solution {
    public int[] plusOne(int[] ds) {
        
        int n = ds.length;
        for(int i=n-1;i>=0;i--){
            ds[i] = ds[i] + 1;
            if(ds[i]<10)
                return ds;
            
            ds[i] = 0;
        }
        
        int[] nd = new int[n+1];
        nd[0] = 1;
        
        return nd;
    }
}