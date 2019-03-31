class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
		
		char[] ss = s.toCharArray();
		char[] tt = t.toCharArray();
		
		int count = t.length();
		String res = "";
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0;i<t.length();i++)
			if(hm.containsKey(tt[i]))
				hm.put(tt[i], hm.get(tt[i])+1);
			else
				hm.put(tt[i], 1);				

		int l=0,r=0;
		
		while(r<s.length()){
			if(hm.containsKey(ss[r])){
                if(hm.get(ss[r])>0)
                    count--;
                hm.put(ss[r], hm.get(ss[r])-1);
            }
            
         while(l<=r&&count==0){
				if(res.isEmpty()||res.length()>(r-l+1))
					res = s.substring(l,r+1);
				
				if(hm.containsKey(ss[l])){
					hm.put(ss[l], hm.get(ss[l])+1);
					if(hm.get(ss[l])>0)
						count++;
				}
				l++;							
			}   
                
            
            r++;
		}
        
       return res;
    }
}