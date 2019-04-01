class Solution {
    public String removeDuplicateLetters(String s) {

            if(s.length()<=1) return s;
        
            int[] count = new int[26];
            boolean[] used = new boolean[26];

            for(char ch : s.toCharArray())
                count[ch-'a'] ++;
        
            Stack<Character> st = new Stack<>();
            
            for(char ch : s.toCharArray()){
                
                int idx = ch-'a';
                count[idx] --;
                if(used[idx] ) continue;
                
                while(!st.empty()&&ch < st.peek()&&count[st.peek()-'a'] > 0)
                    used[st.pop()-'a'] = false;
                
                st.push(ch);
                used[idx] = true;
            }
        

            StringBuilder sb = new StringBuilder();
            while(!st.empty()){
                sb.insert(0,st.pop());
            }
            
            return sb.toString();

        }
        
}