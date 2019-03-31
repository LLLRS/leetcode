class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        int len = s.length();
        List<String> res = new ArrayList<>();
        HashMap<String,Integer> hs = new HashMap<>();
        
        
        for(int i=0;i+10<=len;i++){
            String st = s.substring(i,i+10);
            hs.put(st,hs.getOrDefault(st, 0)+1);
        }
        
        for(String ss : hs.keySet()){
            if(hs.get(ss)>1)
                res.add(ss);
        }
        
        return res;
        
    }
}