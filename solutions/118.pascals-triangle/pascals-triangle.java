class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> res = new ArrayList<>();
        if(n==0) return res;
        
        List<Integer> t = new ArrayList<>();
        t.add(1);
        res.add(new ArrayList(t)); 
        if(n==1) return res;
        t.add(1);
        res.add(new ArrayList(t));
        if(n==2) return res;
        
        for(int i=2;i<n;i++){
            t.clear();
            t.add(1);
            List<Integer> tt = res.get(i-1);
            for(int j=1;j<i;j++)
                t.add(tt.get(j)+tt.get(j-1));
            
            t.add(1);
            res.add(new ArrayList(t)); 
        }
        
        return res;
    }
}