class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> res = new ArrayList<>();
            
        res.add(1);
        if(n==0) return res;
        res.add(1);
        if(n==1) return res;
        
        for(int i=2;i<=n;i++){
            List<Integer> t = new ArrayList<>();
            t.add(1);
            for(int j=1;j<i;j++)
                t.add(res.get(j)+res.get(j-1));
            
            t.add(1);
            
            res = t;

        }
        
        return res;
    }
}