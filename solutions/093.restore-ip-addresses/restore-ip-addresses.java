class Solution {
    List<String> res = new ArrayList<>();
    
    public List<String> restoreIpAddresses(String s) {
        res.clear();
        if(s.length()>12||s.length()<4) return res;
        
        restoreIpAddressesAux(s,"",0);
        return res;
    }
    
    private  void restoreIpAddressesAux(String s,String st,int start){
        if(st.length()==s.length()+4){       	
        	if(s.length()!=start) return;
       	
            res.add(st.substring(0,st.length()-1));
            return;
        }
                     
        for(int i=start;i<s.length()&&i<=start+3;i++){
    
            String str = s.substring(start,i+1);
           
            if(!isvalid(str)) continue;	
            restoreIpAddressesAux(s,st+str+".",i+1);

        }
    }
    
    private  boolean isvalid(String s) {  
        if (s.charAt(0) == '0')  
            return s.equals("0"); // 不允许前缀0  
        int digit = Integer.valueOf(s);  
        return digit >= 0 && digit <= 255;  
    } 
}