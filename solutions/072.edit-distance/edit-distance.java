class Solution {
     public  int minDistance(String w1, String w2) {

         int r = w1.length();
         int c = w2.length();

         int[] res = new int[c+1];         
         for(int i=0;i<=c;i++)
        	 res[i] = i;
         
         
         for(int i=1;i<=r;i++){
             int[] temp = new int[c+1];
        	 temp[0] = i;
        	 for(int j=1;j<=c;j++){
        		 if(w1.charAt(i-1)==w2.charAt(j-1))
        			 temp[j] = res[j-1];
        		 else
        			 temp[j] = Math.min(temp[j-1],Math.min(res[j-1], res[j])) + 1;
        		 
        	 }
             
             res = temp;
         }
        	 	               
         return res[c];         
     }
}