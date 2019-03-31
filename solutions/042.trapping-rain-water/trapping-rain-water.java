class Solution {
    
     public  int trap(int[] h) {
    	 int res = 0;
    	 int len = h.length;
    	 if(h.length<3) return res;
    	 
    	 int l = 0,r = 0;
    	 while(r<len&&l<=r&&h[l]==0)    		 
    		 l = ++r;
 
    	 Stack<Integer> s = new Stack<>();
    	 while(r<len){
    		 r++;
    		 if(r==len) break;

    		 if(h[r]>=h[l]){
    			 res += h[l] * (r-l-1);
    			 while(!s.isEmpty()){

	    			res -= s.pop();
    			 }
    			 l = r;  
    			 continue;
    		 }    		 
    		 s.push(h[r]);
    	 }
    	 
    	 int t = 0;
    	 while(!s.isEmpty()){
    		 
    		 int tem = s.size();
    		 int[] m = new int[tem+1];
    		 
    		 for(int i=0;i<tem;i++)
    			 m[i] = s.pop(); 
    		 
    		 m[tem] = h[l]; 
		 
    		 t = trap(m);
    	 }

    	 return res + t;
         
     }
}