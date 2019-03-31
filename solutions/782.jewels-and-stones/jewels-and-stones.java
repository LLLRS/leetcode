class Solution {
    public int numJewelsInStones(String J, String S) {

        HashMap<Character,Integer> hm = new HashMap<>();
        
        for(char c : S.toCharArray())
            hm.put(c,hm.getOrDefault(c,0)+1);
        
        int res = 0;
        for(char c : J.toCharArray())
            res += hm.getOrDefault(c,0);


        
        return res;
    }
}