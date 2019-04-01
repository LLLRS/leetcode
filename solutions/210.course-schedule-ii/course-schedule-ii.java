class Solution {
    private int[] res = null;
    private int idx = 0;
        private static final int[] NO_FILES = {};
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        int[] memo = new int[numCourses]; //0 未访问 1 不可以上 2 可以上
        res = new int[numCourses];
        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        for(int[] t : prerequisites) {
            ArrayList<Integer> s =  hm.getOrDefault(t[0], new ArrayList<>());
            s.add(t[1]);
            hm.put(t[0],s);

        }
        for(int i=0;i<numCourses;i++){
            if(dfs(hm,i,memo))
                return  NO_FILES;
        }

        return res;
    }

    //返回true代表 不能完成
    private boolean dfs(HashMap<Integer,ArrayList<Integer>> hm, int from, int[] memo){

        if(memo[from] == 0 && !hm.containsKey(from)){
            memo[from] = 2;
            res[idx++] = from; 
            return false;
        }

        if(memo[from] > 0)
            return memo[from] == 1;

        memo[from] = 1;
        for(int s : hm.get(from)) {
            if (memo[s] == 1 || dfs(hm, s, memo))
                return true;
        }
        memo[from] = 2;
        
        res[idx++] = from;
        return false;
    }
}