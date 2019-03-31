class Solution {
     public int strStr(String h, String n) {
    	 if(n==null||n.length()==0) return 0;
    	 
    	 return strAux(h,n,0);
     }

	private int strAux(String h, String n, int st) {
		
	   	 st = h.indexOf(n.charAt(0),st);
	   	 if(st == -1) return -1;
		
	   	 int i = 0;
	   	 for(;i<n.length()&&i+st<h.length();i++)
	   		 if(h.charAt(i+st)!=n.charAt(i))
	   			 break;
	   	 
	   	 if(i==n.length()) return st;
	   	 
	   	 if(i<n.length()&&st+n.length()<h.length())
	   		 return strAux(h,n,st+1);
	   				 
		 return -1;
	}
}