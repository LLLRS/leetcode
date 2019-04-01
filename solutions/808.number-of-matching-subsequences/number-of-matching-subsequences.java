class Solution {
    public int numMatchingSubseq(String s, String[] w) {
        
        if(s.length()==0||w.length==0) return 0;
        
        HashMap<Character,TreeSet<Integer>> res = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (!res.containsKey(s.charAt(i))) {
                res.put(s.charAt(i), new TreeSet<Integer>());
            }
            res.get(s.charAt(i)).add(i);
        }

        int cnt = 0;
        for(String t : w ){
            int pre = -1;
            boolean flag = true;
            for(char ch : t.toCharArray()){
                if(!res.containsKey(ch)){
                    flag = false;
                    break;
                }
                Integer cur = res.get(ch).ceiling(pre);
                if(cur==null){
                    flag = false;
                    break;
                }
                pre = cur +1;
            }
            if(flag) cnt++;
        }
            
        return cnt;
    }
}