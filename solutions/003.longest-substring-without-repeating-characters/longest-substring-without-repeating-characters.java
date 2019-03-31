class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int l =0,r = 0;
        int res = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        
        while(r<s.length()){
            char ch = s.charAt(r);
            if(hm.containsKey(ch))
                l =  Math.max(l,hm.get(ch) + 1);
            hm.put(ch,r);
            
            res = Math.max(res,r-l+1);
            r++;
        }
        
        return res;
    }
}