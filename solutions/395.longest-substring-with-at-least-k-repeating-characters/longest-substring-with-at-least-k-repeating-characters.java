class Solution {
    public int longestSubstring(String s, int k) {

        int n = s.length();
        if(n==0 || n < k) return 0;
        int res = 0;

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        boolean flag = true;
        for(char ch : hm.keySet()){
            int t = hm.get(ch);
            if(hm.get(ch) < k){
               flag = false;
               break;
            }
        }
        if(flag) return s.length();

        int st = 0,cur = 0;
        while(cur < n){
            char ch = s.charAt(cur);
            if(hm.get(ch) < k){
                res = Math.max(res,longestSubstring(s.substring(st,cur),k));
                st = cur + 1;
            }

            cur++;
        }
        res = Math.max(res,longestSubstring(s.substring(st),k));
        return res;
    }
}