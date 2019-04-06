class Solution {
    List<Integer> list = null;
    public List<Integer> lexicalOrder(int n) {
        list = new ArrayList<>();
        for(int i=1;i<10;i++)
            dfs(i,n);
        return list;
    }

    private void dfs(int cur,int n){
        if(cur > n) return;

        list.add(cur);
        for(int i=0;i<=9;i++){
            if(cur*10 + i > n) return;
            dfs(cur*10 + i,n);
        }
    }
}