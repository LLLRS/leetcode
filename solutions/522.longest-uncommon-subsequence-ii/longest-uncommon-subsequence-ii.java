class Solution {
    public int findLUSlength(String[] strs) {
        
        int n = strs.length;
        HashMap<String,Integer> hs = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            if(hs.containsKey(strs[i]))
                hs.remove(strs[i]);
            else
                hs.put(strs[i],i);            
        }
        
        
        HashSet<String> hm = new HashSet<>();
        
        for(String t : hs.keySet()){
            int k = hs.get(t);
            boolean flag = true;
            for(int i=0;i<strs.length;i++){
               if( i!= k && isSubsequence(strs[i],t) )
                   flag = false;

            }
            
            if(flag)
                hm.add(t);
        }

        
        
        int res = -1;
        for(String t : hm)
            res = Math.max(res,t.length());
        
        return res;
        
    }
    
    private boolean isSubsequence(String a, String b) {
	    int i = 0, j = 0;
	    while(i < a.length() && j < b.length()) {
	        if(a.charAt(i) == b.charAt(j)) j++;
	        i++;
	    }
	    return j == b.length();
	}
}