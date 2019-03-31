class Solution {
     public static int[][] generateMatrix(int n) {
    	 
    	 int[][] m = new int[n][n];
    	 int len = n*n;
    	 int k = 1;
    	 int l = 0,r = n-1;
    	 int u = 0,d = n-1;
    	 
    	 while(k<=len){
    		 for(int i=l;i<=r&&k<=len;i++)
    			 m[u][i] = k++;
    		 
    		 for(int i=++u;i<=d&&k<=len;i++)
    			 m[i][r] = k++;
    		 
    		 for(int i=--r;i>=l&&k<=len;i--)
    			 m[d][i] = k++;
    		 
    		 for(int i=--d;i>=u&&k<=len;i--)
    			 m[i][l] = k++;
    		 l++;
    	 }
         
    	 return m;
     }
}