class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(n<=0||k<=0||k>n) return res;
        
        combineAux(n,k,1,new ArrayList<Integer>());
        return res;
        
    }
    private void combineAux(int n,int k,int sta,List<Integer> t){
        
        if(t.size()==k){
            res.add(new ArrayList(t));
            return;
        }
        
        for(int i = sta;i<=n-(k-t.size())+1;i++){
            t.add(i);
            combineAux(n,k,i+1,t);
            t.remove(t.size()-1);
        }
    }
}