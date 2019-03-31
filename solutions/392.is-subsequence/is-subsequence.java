class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.equals(""))  return true;
        
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        
        int si = 0,ti = 0;
        while(si<ss.length&&ti<tt.length){
            
            if(ss[si]==tt[ti]){
                si++;
                ti++;
            }else
                ti++;
        }
        
        if(ti==tt.length&&si<ss.length)
            return false;
        
        return true;
        
    }    
    
}