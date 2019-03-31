class Solution {
    public boolean detectCapitalUse(String w) {
        int n = w.length();
        
        if(n==1) return true;
        
        boolean f1 = Character.isUpperCase(w.charAt(0));
        boolean f2 = Character.isUpperCase(w.charAt(1));
        if( !f1 && f2)
            return false;
        
        for(int i=2;i<n;i++){
            if( f1 && f2){
                if(!Character.isUpperCase(w.charAt(i)))
                    return false;                
            }else {
                if(Character.isUpperCase(w.charAt(i)))
                    return false;
            }
        }
        
        return true;
    }
}