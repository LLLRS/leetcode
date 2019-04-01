class Solution {
    public char findTheDifference(String s, String t) {
        
        char res = t.charAt(0);
        
        for(int i=0;i<s.length();i++)
            res ^= s.charAt(i) ^ t.charAt(i + 1);
        
        return res;
    }
}