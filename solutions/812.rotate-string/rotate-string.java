class Solution {
    public boolean rotateString(String s1, String s2) {
        
        int m = s1.length();
        int n = s2.length();
        
        if(m != n)
            return false;
        if(m == 0)
            return true;
        
        int c = s1.charAt(0);
        int i = s2.indexOf(c);
        
        
        while( i> 0){
            String t = s2.substring(i) + s2.substring(0,i);
            if(t.equals(s1))
                return true;
            
            i =  s2.indexOf(c,i+1);
        }
        
        return false;
    }
}