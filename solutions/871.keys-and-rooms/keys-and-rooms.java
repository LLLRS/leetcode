class Solution {
	public static boolean[] visited = null; 
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
    	int n = rooms.size();
    	if(n==1)
    		return true;
        visited = new boolean[n];
        visited[0] = true;
        
        dfs(rooms,0);
        
    	for(boolean flag : visited)
    		if(!flag) 
    			return false;
    	
    	return true;
    }
	private static void dfs(List<List<Integer>> rooms, int s) {
				
		List<Integer> t = rooms.get(s);
		if(t.size() != 0){
			for(int st : t){
				if(visited[st]) continue;
				
				visited[st] = true;
				dfs(rooms,st);
			}
		}
		
	}
}