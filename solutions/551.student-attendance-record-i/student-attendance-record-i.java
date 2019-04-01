class Solution {
    public boolean checkRecord(String s) {
        
        int len = s.length();
        
        int late = 0;
        boolean absent = false;
        
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(ch=='A'){
                if(absent) return false;
                
                late = 0;
                absent = true;
            }else if(ch=='L'){
                
                if(late==2)
                    return false;
                
                late++;
            }else   
                late = 0;

        }
         
        return true;
        
    }
}