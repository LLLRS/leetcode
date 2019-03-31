class Solution {
      
     boolean[] col = null;
     boolean[] dia1 = null;
     boolean[] dia2 = null; 
     int  res = 0;
     
     public  int totalNQueens(int n) {
    	 if(n<=1) return 1;
    	 if(n<=3) return 0;
    	 
         col = new boolean[n];
         dia1 = new boolean[2*n-1];
         dia2 = new boolean[2*n-1];
         
         dfs(n, 0);
         return res;         
     }
     
     public void dfs(int n,int row) {
    	 if(row==n){
    		 res++;
    		 return;
    	 }
         
    	 for(int i=0;i<n;i++){
    		 if(!col[i]&&!dia1[row-i+n-1]&&!dia2[row+i]){
    			 col[i] = true;
    			 dia1[row-i+n-1] = true;
    			 dia2[row+i] = true;
    			 dfs(n, row+1);  
    			 col[i] = false;
    			 dia1[row-i+n-1] = false;
    			 dia2[row+i] = false;
    		 }
    			 
    	 }
         
     } 
}