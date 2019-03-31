class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> hm = new HashMap<>();
        
        for(int i = 0 ;i<s.length();i++)
            if(hm.containsKey(s.charAt(i))){
                if(hm.get(s.charAt(i))!=t.charAt(i))
                    return false;                
            }else
                hm.put(s.charAt(i),t.charAt(i));
        
        hm.clear();
        for(int i = 0 ;i<t.length();i++)
            if(hm.containsKey(t.charAt(i))){
                if(hm.get(t.charAt(i))!=s.charAt(i))
                    return false;                
            }else
                hm.put(t.charAt(i),s.charAt(i));                
                                
        return true;
    }
}