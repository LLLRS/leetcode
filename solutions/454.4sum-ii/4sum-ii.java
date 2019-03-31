class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res = 0;
        
        for(int i=0;i<C.length;i++)
            for(int j=0;j<D.length;j++){
                int s = C[i] + D[j];
                if(hm.containsKey(s))
                    hm.put(s,hm.get(s)+1);
                else
                    hm.put(s,1);
            }
        
        for(int i=0;i<C.length;i++)
            for(int j=0;j<D.length;j++){
                int s = A[i] + B[j];
                if(hm.containsKey(-s))
                   res = res + hm.get(-s);
            }
        
       return res;
    }
}