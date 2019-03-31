class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        int len = strs.length;
        if(len==0)  return res;
        if(len==1)  return strs[0];
        
        res = aux(strs[0],strs[1]);
        
        for(int i=2;i<len;i++){
            if(res.length()==0) break;
            
            res = aux(res,strs[i]);
        }
        
            
        return res;
    }
    
    private String aux(String s1,String s2){
        
        int i = 0;
        while(i<s1.length()&&i<s2.length()&&s1.charAt(i)==s2.charAt(i)){
            i++;
        }
        
        return s1.substring(0,i);
    }
}