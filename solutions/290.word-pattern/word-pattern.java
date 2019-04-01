class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] strs = str.split(" ");
        if(strs.length!=pattern.length()) return false;
        HashMap<Character,String> hm = new HashMap<>();
        
        for(int i = 0 ;i<pattern.length();i++)
            if(hm.containsKey(pattern.charAt(i))){
                if(!hm.get(pattern.charAt(i)).equals(strs[i]))
                    return false;                
            }else
                hm.put(pattern.charAt(i),strs[i]);
        
        HashMap<String,Character> hs = new HashMap<>();
        for(int i = 0 ;i<strs.length;i++)
            if(hs.containsKey(strs[i])){
                if(hs.get(strs[i])!=pattern.charAt(i))
                    return false;                
            }else
                hs.put(strs[i],pattern.charAt(i));        
                
        return true;
    }
}