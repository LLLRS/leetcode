class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null) return 0;
        s = s.trim();
        if(s.length()==0) return 0;
        int blank = -1;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                blank = i;
        }
        
        if(blank==-1) return s.length();
        
        return s.length() - blank - 1;
    }
}