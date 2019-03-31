class Solution {
      List<HashSet<Character>> row = null;
      List<HashSet<Character>> col = null;
      List<HashSet<Character>> gd = null;
      boolean end = false;
     
     public  void solveSudoku(char[][] board) {
    	 
    	 row = new ArrayList<>();
    	 col = new ArrayList<>();
    	 gd = new ArrayList<>();
         
         for(int i = 0;i<9;i++){
            row.add(new HashSet<Character>());
            col.add(new HashSet<Character>());
            gd.add(new HashSet<Character>());         
         }

        for(int i=0;i<9;i++){ 
    		 for(int j=0;j<9;j++){
                 char ch = board[i][j];
                 if(ch == '.') continue;
                 
                 int gt = grid(i,j);
                 row.get(i).add(ch);
                 col.get(j).add(ch);
                 gd.get(gt).add(ch);
    		 }

    	 } 
    	 
    	 
    	 dfs(board,0,0);
        
     }


	private  void dfs(char[][] board, int r, int c) {
		 if(r==9){
			 end = true;
			 return;
		 }
		 
		 if(board[r][c]!='.'){
			 if(c+1==9)
				 dfs(board, r+1, 0);
			 else
				 dfs(board, r, c+1);
		 }else{
			 for(char i='1';i<='9';i++){
				 int gt = grid(r, c);
				 if(!row.get(r).contains(i)&&!col.get(c).contains(i)&&!gd.get(gt).contains(i)){
					 board[r][c] = i;
					 row.get(r).add(i);
					 col.get(c).add(i);
					 gd.get(gt).add(i);
					 if(c+1==9)
						 dfs(board, r+1, 0);
					 else
						 dfs(board, r, c+1);
					 
					 if(end) return;
					 
					 board[r][c] = '.';
					 row.get(r).remove(i);
					 col.get(c).remove(i); 
					 gd.get(gt).remove(i);
				 }
				 
			 }	 
		 }		 
	} 
	
	private  int grid(int r,int c) {
		int[][] g ={{0,1,2},
					{3,4,5},
					{6,7,8}};
		
		int i = aux(r);
		int j = aux(c);
		
		return g[i][j];
	
	}
	
	private  int aux(int s){
		if(s>=0&&s<=2) 
			return 0;
		else if(s>=3&&s<=5) 
			return 1;
		else 
			return 2;
	}

}