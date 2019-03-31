class Solution {
    public String reverseString(String s) {
        if(s.length()<2) return s;
    	
       
        return new StringBuilder(s).reverse().toString();
    }
        
}