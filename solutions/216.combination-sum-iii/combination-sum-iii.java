class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    boolean[] used =null;
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        if(n<=0||k<=0) return res;
        int sum = 0;
        for(int i=9;i>9-k;i--)
            sum +=i;
        
        if(sum<n) return res;

        used = new boolean[9];
        for(int i=0;i<used.length;i++)
            used[i] = false;
        
        combinationSumAux(k,n,new ArrayList<Integer>(),1);
        return res;
        
    }
    
    private void combinationSumAux(int k,int n,List<Integer> st,int sta){
        if(n==0&&st.size()==k){
            res.add(new ArrayList<Integer>(st));
            return;
        }
        
        
        if(n<=0) return;
        
        for(int i=sta;i<=9&&n>0;i++){
            if(used[i-1]) continue;
                       
            used[i-1] = true;
            st.add(i);
            combinationSumAux(k,n-i,st,i);
            st.remove(st.size()-1);
            used[i-1] = false;
        
        }
    }
}