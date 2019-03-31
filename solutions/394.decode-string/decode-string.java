class Solution {
    public String decodeString(String s) {
        
        String res = "";
        Stack<Integer> count = new Stack<>();
        Stack<String>  strings = new Stack<>();

        int idx = 0;
        while (idx < s.length()){
            if(Character.isDigit(s.charAt(idx))){
                int cnt = 0;
                while(Character.isDigit(s.charAt(idx)))
                    cnt = cnt * 10 + s.charAt(idx++) - '0';

                count.push(cnt);
            }else if(s.charAt(idx) == '['){
                idx++;
                strings.push(res);
                res = "";
            }else if(s.charAt(idx) == ']'){
                idx ++;
                StringBuilder sb = new StringBuilder(strings.pop());
                int repeatTimes = count.pop();
                for(int i=0;i<repeatTimes;i++)
                    sb.append(res);

                res = sb.toString();
            }else
                res += s.charAt(idx++);
        }


        return res;
    }
}