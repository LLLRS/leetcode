class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] Morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                          ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                          "...","-","..-","...-",".--","-..-","-.--","--.."} ;
        
        HashSet<String> hs = new HashSet<>();
        for(String t : words){
            StringBuilder sb = new StringBuilder();
            for(char c : t.toCharArray()){
                sb.append(Morse[c - 'a']);
            }
            hs.add(sb.toString());
        }
        
        return hs.size();
        
    }
}