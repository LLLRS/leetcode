class Solution {
    public boolean isValid(String s) {
        java.util.Stack<Character> st = new  java.util.Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
           
            if(ch=='{'||ch=='['||ch=='(')
                st.push(ch);
            else{
                if(st.empty()) return false;
                char t = st.pop();
                
                if(t=='{'&&ch!='}')
                    return false;
                if(t=='['&&ch!=']')
                    return false;
                if(t=='('&&ch!=')')
                    return false;
                
            }
        }   
        if(st.empty()) return true;
        
        return false;
    }
}