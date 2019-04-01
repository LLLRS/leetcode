class Solution {
     public  List<String> fullJustify(String[] w, int mw) {
    	 List<String> res  = new ArrayList<>();
    	 int len = w.length;
    	 int i=0;
    	 while(i<len){
    		 List<String> t  = new ArrayList<>(); 
    		 StringBuilder sb = new StringBuilder();
    		 int al = 0;
    		 while(i<len&&w[i].length()+t.size()+al<=mw){
    			 al += w[i].length();
    			 t.add(w[i]);  
       			 i++;
    		 }
    		 int[] arr = new int[t.size()];
    		 
    		 if(i==len){
    			 for(int j=0;j<t.size();j++)
    				 sb.append(t.get(j)).append(" ");
                 
    			 String tt = sb.toString().trim();
    			 res.add(tt+aux(mw-tt.length()));
    			 break;
    		 }
    		 
    		 if(t.size()==1){
    			 String tt = t.get(0);
    			 res.add(tt+aux(mw-tt.length()));
    			 continue;
    		 }
    		 int t1 = (mw-al)/(t.size()-1);
    		 int t2 = (mw-al)%(t.size()-1);

    		 Arrays.fill(arr, t1);
    		 for(int j=0;j<t2;j++)
    			 arr[j] += 1;
    		  
			 for(int j=0;j<t.size();j++)
				 sb.append(t.get(j)).append(aux(arr[j]));
			 
			 res.add(sb.toString().trim());
    	 }
    	  
    	 return res;         
     }
	private  String aux(int k) {
		StringBuilder t = new StringBuilder();
		for(int i=0;i<k;i++)
			t.append(" ");
		return t.toString();
	}
}

