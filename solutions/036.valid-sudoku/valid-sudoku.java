class Solution {

      List<HashSet<Character>> row = null;
      List<HashSet<Character>> col = null;
      List<HashSet<Character>> gd = null;
      boolean end = false;
     
     public  boolean isValidSudoku(char[][] board) {
    	 
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
                 
                 if(row.get(i).contains(ch))  return false;
                 if(col.get(j).contains(ch))  return false;
                 int gt = grid(i,j);
                 if(gd.get(gt).contains(ch))  return false;
                 
                 row.get(i).add(ch);
                 col.get(j).add(ch);
                 gd.get(gt).add(ch);
    		 }

    	 } 

       return true; 
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