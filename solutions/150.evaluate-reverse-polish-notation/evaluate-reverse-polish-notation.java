class Solution {
    public int evalRPN(String[] tokens) {
        java.util.Stack<Integer> st = new  java.util.Stack<>();

        for(int i=0;i<tokens.length;i++){
            String s = tokens[i];
            if(s.equals("*")){
              int t1 = st.pop();
              int t2 = st.pop();
              st.push(t1*t2);
            }else if(s.equals("/")){
              int t1 = st.pop();
              int t2 = st.pop();
              st.push(t2/t1);
            }else if(s.equals("+")){
              int t1 = st.pop();
              int t2 = st.pop();
              st.push(t2+t1);
            }else if(s.equals("-")){
              int t1 = st.pop();
              int t2 = st.pop();
              st.push(t2-t1);
            }else{
                st.push(Integer.valueOf(s));
            }
        }
        return st.pop();
    }
}