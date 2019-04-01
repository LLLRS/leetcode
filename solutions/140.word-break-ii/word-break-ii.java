class Solution {
        
     List<String> res = new ArrayList<>();
     public  List<String> wordBreak(String s, List<String> dic) {
       
        int n = s.length();
        
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        
        for(int i=1;i<=n;i++)
            for(int j=0;j<=i;j++)
                if(dp[j]&&dic.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
         
        if(!dp[n]) return res;      
         
    	 wordBreakAux(s,dic,0,new StringBuilder());
    	 return res;
     }

	private  void wordBreakAux(String s, List<String> dic, int idx, StringBuilder st) {
		
		if(idx>=s.length()){
			res.add(st.toString().trim());
			return;
		}
		
		for(int i = idx+1;i<=s.length();i++){
			String t = s.substring(idx,i);
			if(dic.contains(t)){
				int len = st.length();
				wordBreakAux(s,dic,i,st.append(t+" "));
				st.setLength(len);
			}
		}	
	}
}