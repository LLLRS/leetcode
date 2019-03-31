class Solution {
    public String removeKdigits(String s, int k) {
        
        if(k >= s.length()) 
            return "0";
        
        Stack<Character> st = new Stack<>();
        int i = 0;
        
        while(i<s.length()){
        	while(k > 0 && !st.isEmpty() && st.peek() > s.charAt(i)){
        		st.pop();
        		k--;
        	}
        	
        	st.push(s.charAt(i));
            i++;
        }
        
        while( k >0 ){
        	st.pop();
        	k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        	sb.append(st.pop());
        
        
        sb.reverse();
        while(sb.length()>1&&sb.charAt(0) == '0')
        	sb.deleteCharAt(0);
        
        
        return sb.toString();
    }
}