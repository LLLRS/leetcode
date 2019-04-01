//在[]i，j]猜中任意一个数花费最小

class Solution {
    private int[][] memo = null;
    public int getMoneyAmount(int n) {
        
        memo = new int[n+1][n+1];
        for(int[] s : memo)
            Arrays.fill(s,-1);
        
        return dfs(1,n);
    }
    
    private int dfs(int l,int r){
        if(l >= r)
            return 0;
        
        if(memo[l][r] == -1){
            int t = Integer.MAX_VALUE;
            
            for(int i=l;i<=r;i++)
                t = Math.min(t,i + Math.max(dfs(l,i-1),dfs(i+1,r)) );
            
            memo[l][r] = t;
        }
        
        return memo[l][r];
    }
}