class Solution {
    public List<Integer> grayCode(int n) {
         List<Integer> res = new ArrayList<>();
         if(n==0){
        	 res.add(0);
        	 return res; 
         }
         
         res = grayCode(n-1);
         int p = 1<<(n-1);
         int[] t = new int[p];
         for(int i = 0;i<p;i++)
        	 t[p-1-i] = p+res.get(i);

         
         for(int i = 0;i<p;i++)
        	 res.add(t[i]);
         
         return res;
    }
}