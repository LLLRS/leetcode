class Solution {
    public int calculate(String s) {

        char[] ch = s.toCharArray();

        char sign = '+';
        Stack<Integer> st = new Stack<>();

        int num = 0;
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                num = num * 10 + ch[i] - '0';
            }

            if(!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length-1 ){
                if(sign == '+')
                    st.push(num);
                else if(sign == '-')
                    st.push(-num);
                else if(sign == '*')
                    st.push(st.pop() * num);
                else if(sign == '/')
                    st.push(st.pop() / num);

                sign = ch[i];
                num = 0;
            }

        }

        int res = 0;
        while(!st.empty())
            res += st.pop();

        return res;
    }
}