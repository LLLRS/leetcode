class Solution {
    private int res = 0;
    private boolean[] used = null;
    public int countArrangement(int n) {      
        if(n == 0)
            return 0;
        
        used = new boolean[n+1];
        dfs(n,1);
        
        return res;
    }
    
    private void dfs(int n,int s){
        
        if(s >= n+1){
            res++;
            return;
        }
        
        for(int i=1;i<=n;i++){
            if(!used[i] && (i%s == 0 || s%i == 0)) {
                used[i] = true;
                dfs(n,s+1);
                used[i] = false;
            }
        }
    }
}