class Solution {
    public int firstUniqChar(String s) {
        
        int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        
        for(int i=0;i<n;i++){
            char t = s.charAt(i);
            if(hs.contains(t)) continue;
            
            boolean flag = true;
            for(int j=0;j<n;j++){
                if( i==j) continue;
                if( s.charAt(j) == t){
                    hs.add(t);
                    flag = false;
                    break;
                }
            }
            
            if(flag) return i;
        }
        
        return -1;
    }
}