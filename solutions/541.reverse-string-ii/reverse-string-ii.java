class Solution {
    public String reverseStr(String s, int k) {
        
        int len = s.length();
        int div = len/(2*k);
        
        StringBuilder res = new StringBuilder();
        for(int i=0;i<div;i++){
            String t = new StringBuilder(s.substring(2*k*i,2*k*i+k)).reverse().toString();
            res.append(t);
            res.append(s.substring(2*k*i+k,2*k*i+2*k));
        }
        
        if(len%(2*k)>=k){
            String t = new StringBuilder(s.substring(2*k*div,2*k*div+k)).reverse().toString();
            res.append(t);
            res.append(s.substring(2*k*div+k,len));
        }else{
            String t = new StringBuilder(s.substring(2*k*div,len)).reverse().toString();
            res.append(t);
        }
                 
        return res.toString();
    }
}