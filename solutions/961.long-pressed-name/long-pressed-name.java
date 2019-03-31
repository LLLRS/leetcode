class Solution {
    public boolean isLongPressedName(String t, String s) {
        
        int i=0,j=0;
        while( i<s.length() && j<t.length() ){
            
            if(s.charAt(i) == t.charAt(j)) j++;
            i++;
        }
        
        return j == t.length();
        
    }
}