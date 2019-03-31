class Solution {
     public boolean isNumber(String s) {

        	 s = s.trim();
        	 int len = s.length();
             if(len==0) return false;
             if(s.startsWith("+")||s.startsWith("-"))
            	 s = s.substring(1, len);
             
             char[] ch = s.toCharArray();
             boolean fd = false,fe = false;
             for(int i=0;i<ch.length;i++){
            	 if(ch[i]=='e'){
                    if(ch.length==1) return false;
                    if(fe)  return false;
                     fe = true;
                     
            		 if(i>0&&Character.isDigit(ch[i-1])){
            			if(i<ch.length-2&&(ch[i+1]=='+'||ch[i+1]=='-')){
                            i++;

                            continue;
                         }	 
                         
                         if(!(i<ch.length-1&&Character.isDigit(ch[i+1])))
            			    return false;   
                     } else
                        return false;
                        
            	 }else if(ch[i]=='.'){
                    if(ch.length==1) return false;               
                    if(fd||fe)  return false;
                    fd = true;
                     
            		if(i==0||Character.isDigit(ch[i-1])){                     
                        if(i!=0&&i<ch.length-2&&ch[i+1]=='e'&&!fe){
                            i++;
                            if(i<ch.length-2&&(ch[i+1]=='+'||ch[i+1]=='-')) i++;
                            
                            fe = true;
                            continue;
                        }
                              
                        if(!(i==ch.length-1||Character.isDigit(ch[i+1])))
                        	return false;         
                    }else
                    	return false;
            		 
            	 }else if(!Character.isDigit(ch[i])) 

                     
            		 return false;
             }
             
             return true;
         }
}