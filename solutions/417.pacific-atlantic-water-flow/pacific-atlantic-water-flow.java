class Solution {
      
     boolean[][] toPac = null;
     boolean[][] toAtl = null;
     boolean[][] usedPac = null;
     boolean[][] usedAtl = null;
     int m,n;
     int[][] ct= {{-1,0},{0,1},{1,0},{0,-1}};
     
     
	 public  List<int[]> pacificAtlantic(int[][] board) {
		 
		 List<int[]> res = new ArrayList<>();
		  m = board.length;
		  if(m==0) return res;
		  n = board[0].length;
		  
		  toPac = new boolean[m][n];
		  toAtl = new boolean[m][n];
		  usedPac = new boolean[m][n];
		  usedAtl = new boolean[m][n];


		  for(int i=0;i<m;i++){
			  for(int j=0;j<n;j++){
				  toPacific(board, i, j); 
				  if(!toPac[i][j]) continue;
				  
				  toAtlantic(board, i, j);
				  if(toPac[i][j]&&toAtl[i][j]){  
					  int [] temp = {i,j};
					  res.add(temp);
				  }
			  }
		  }
		  return res;
	 }
	 

	 public  void toPacific(int[][] board,int sx,int sy) {
		 
		 usedPac[sx][sy] = true;
		  if(sx==0||sy==0){
			   toPac[sx][sy] = true;
			   return;
		  } 
		
		  if(toPac[sx][sy]) return;
		  
		  for(int i=0;i<4;i++){
			  int x = sx+ct[i][0];  //计算新坐标
			  int y = sy+ct[i][1];
			  
			  if(inArea(x,y)&&board[sx][sy]>=board[x][y]&&!usedPac[x][y])
				  toPacific(board, x, y);
			  
			  if(inArea(x,y)&&board[sx][sy]>=board[x][y]&&toPac[x][y]){
				  toPac[sx][sy] = true;
				  return;
			  }
		}
        usedPac[sx][sy] = false;
         

	 }
		  
	 
	 public  void toAtlantic(int[][] board,int sx,int sy) {
		 usedAtl[sx][sy] = true;
		  if(sx==m-1||sy==n-1){
			   toAtl[sx][sy] = true;
			   return;
		  } 
		  
		  if(toAtl[sx][sy]) return;
		  
		  for(int i=0;i<4;i++){
			  int x = sx+ct[i][0];  //计算新坐标
			  int y = sy+ct[i][1];
			  
			  if(inArea(x,y)&&board[sx][sy]>=board[x][y]&&!usedAtl[x][y]){
				  toAtlantic(board, x, y);
			  
			  }
				  
			  
			  if(inArea(x,y)&&board[sx][sy]>=board[x][y]&&toAtl[x][y]){
				  toAtl[sx][sy] = true;
				  return;
			  }
		}
         usedAtl[sx][sy] = false;
	}
	 
	 public  boolean inArea(int sx,int sy){
		  
		 return sx>=0&&sx<m&&sy>=0&&sy<n;
	 }
}