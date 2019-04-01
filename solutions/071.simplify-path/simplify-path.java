class Solution {
    public String simplifyPath(String path) {
        
        String[] s = path.split("/+"); 
        String res = "/";
        
        java.util.Stack<String> st = new java.util.Stack<>();
        for(int i =1;i<s.length;i++){
            String t = s[i];
            if(t.equals("..")){
            	if(st.empty())
            		 continue;           	
            	st.pop();
            }else if(t.equals("."))
                continue;
            else 
                st.push(t);
        }
        while(!st.empty()){
            res = "/" +st.pop() + res;
        }
        if(res.length()>1) res = res.substring(0,res.length()-1);
        return res;
    }
}