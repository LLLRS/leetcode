class Solution {
    public static  List<Integer> eventualSafeNodes(int[][] graph) {

        List<Integer> res = new ArrayList<>();
        if(graph == null || graph.length == 0)  return res;

        int[] memo = new int[graph.length]; //0 未访问 1 不安全 2 安全

        for(int i=0;i<graph.length;i++){
            if(dfs(graph,i,memo)) continue;
            
            res.add(i);
        }

        return res;
    }

	//返回true代表从from出发形成了环
    private static  boolean dfs(int[][] graph, int from, int[] memo){

        if(memo[from] > 0)
            return memo[from] == 1;

        memo[from] = 1;
        for(int s : graph[from]) {
            if(memo[from]==2)
				break;
				
            if ( memo[s]==1 || dfs(graph, s, memo))
                return true;

        }

        memo[from] = 2;
        return false;
    }
}