class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.isEmpty()&&t.isEmpty())
            return true;
        if(s.length()!=t.length())  
            return false;
        
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        
        String  s1 = String.valueOf(ss);
        String  t1 = String.valueOf(tt);
        
        if(s1.equals(t1))
            return true;
        return false;
    }
}