class Solution {
    
     List<String> res = new ArrayList<>();    
     public List<String> generateParenthesis(int n) {
    	 if(n==0) return res;
    	 
    	 String st = "(";
    	 generateAux(0,0,"",n);
    	 return res;
     }
    	     
     public  void generateAux(int l,int r,String st,int max) {
    	 if(st.length()==2*max){
    		 res.add(st);
    		 return;
    	 }
    	 

    	 if(l<max)
    		 generateAux(l+1,r,st+"(",max);
    	 if(r<l)    		 
    		 generateAux(l,r+1,st+")",max);

    	 
     }
}