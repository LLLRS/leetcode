class Solution {
    
     boolean[] col = null;
     boolean[] dia1 = null;
     boolean[] dia2 = null; 
     List<List<String>> res = new ArrayList<>();
     
     public  List<List<String>> solveNQueens(int n) {
         col = new boolean[n];
         dia1 = new boolean[2*n-1];
         dia2 = new boolean[2*n-1];
         
         dfs(n, 0, new ArrayList<>());
         return res;         
     }
     
     public  void dfs(int n,int row,List<Integer> st) {
    	 if(row==n){
    		 res.add(aux(n, st));
    		 return;
    	 }
         
    	 for(int i=0;i<n;i++){
    		 if(!col[i]&&!dia1[row-i+n-1]&&!dia2[row+i]){
    			 col[i] = true;
    			 dia1[row-i+n-1] = true;
    			 dia2[row+i] = true;
    			 st.add(i);
    			 dfs(n, row+1, st);
    			 st.remove(st.size()-1);
    			 col[i] = false;
    			 dia1[row-i+n-1] = false;
    			 dia2[row+i] = false;
    		 }
    			 
    	 }
         
     }
     
     public List<String> aux(int n,List<Integer> st) {
    	 char[] t = new char[n];
    	 
    	 List<String> temp = new ArrayList<>();
    	 for(int i=0;i<n;i++) t[i] = '.';    	     	 
    	 for(int i=0;i<n;i++){
    		 int k = st.get(i);
    		 t[k] = 'Q';
    		 temp.add(String.valueOf(t));
    		 t[k] = '.'; 
    	 }
         
         return temp;         
     }
}