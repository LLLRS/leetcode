class Solution {
     public  int minDistance(String w1, String w2) {
         //求最长公共子序列
         int len1 = w1.length();
         int len2 = w2.length();
         if(len1==0&&len2==0) return 0;
         if(len1==0) return len2;
         if(len2==0) return len1;
         
         int[][] memo = new int[len1][len2];
         memo[0][0] = w1.charAt(0) == w2.charAt(0) ? 1 : 0;
         for(int i=1;i<len2;i++)
        	 memo[0][i] = w1.charAt(0) == w2.charAt(i) ? 1 : memo[0][i-1];
         
         for(int i=1;i<len1;i++){
        	 memo[i][0] = w1.charAt(i) == w2.charAt(0) ? 1 : memo[i-1][0];
        	 for(int j=1;j<len2;j++){
        		 if(w1.charAt(i) == w2.charAt(j))
        			 memo[i][j] = 1 + memo[i-1][j-1];
        		 else
        			 memo[i][j] = Math.max(memo[i-1][j],memo[i][j-1]);
        	 }
         }
              
         return len1 + len2 - 2 * memo[len1-1][len2-1];         
     }
}