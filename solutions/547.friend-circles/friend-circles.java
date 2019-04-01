class Solution {
    
	private static boolean used[][] = null;
    public static int findCircleNum(int[][] m) {
        int res = 0;
        
        int n = m.length;
        used = new boolean[n][n];
        
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		if(m[i][j] != 0 && !used[i][j]){
        			res ++;
        			dfs(m,i,n);
        		}
        	}
        }
        
        
        return res;
    }
    
    
	private static void dfs(int[][] m, int x, int n) {
		
		if(m[x][x] == 0 || used[x][x]) return;
		
		used[x][x] = true;
		
		for(int k=0;k<n;k++){
			
			if(m[x][k] == 0) continue;
			
			used[x][k] = true;
			dfs(m,k,n);
		}
		
	}
	
}