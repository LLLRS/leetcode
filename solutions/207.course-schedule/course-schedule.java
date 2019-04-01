class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[] memo = new int[numCourses]; //0 未访问 1 不可以上 2 可以上

        HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
        for(int[] t : prerequisites) {
            ArrayList<Integer> s =  hm.getOrDefault(t[0], new ArrayList<>());
            s.add(t[1]);
            hm.put(t[0],s);           
        }
        
        for(int i=0;i<numCourses;i++){
            if(dfs(hm,i,memo))
                return false;
        }

        return true;
    }

    //返回true代表 不能完成
    private static  boolean dfs(HashMap<Integer,ArrayList<Integer>> hm, int from, int[] memo){

        if(!hm.containsKey(from)){
            memo[from] = 2;
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
        return false;
    }
}