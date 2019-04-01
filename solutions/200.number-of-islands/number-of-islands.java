class Solution {
    
     boolean[][] used = null;
     int m,n;
     int[][] ct= {{-1,0},{0,1},{1,0},{0,-1}};
     
	 public int numIslands(char[][] grid) {
		 int res = 0;
		  m = grid.length;
         if(m==0) return 0;
		  n = grid[0].length;
		  
		  used = new boolean[m][n];
		  for(int i=0;i<m;i++)
			  for(int j=0;j<n;j++)
				  used[i][j] = false;
		  
		  for(int i=0;i<m;i++)
			  for(int j=0;j<n;j++)
				  if(grid[i][j]=='1'&&!used[i][j]){  
					  res++;
					  dfs(grid, i, j);
				  }
					 
		  return res;  
	 }
	 
	 public void dfs(char[][] grid,int sx,int sy) {

		  used[sx][sy] = true;
		  for(int i=0;i<4;i++){
			  int x = sx+ct[i][0];  //计算新坐标
			  int y = sy+ct[i][1];
			  
			  if(inArea(x,y)&&!used[x][y]&&grid[x][y]=='1')
				  dfs(grid, x, y);
		  }
		  
		  return ;  
	 }	
	 
	 public  boolean inArea(int sx,int sy){
		 
		 return sx>=0&&sx<m&&sy>=0&&sy<n;
	 }	
}