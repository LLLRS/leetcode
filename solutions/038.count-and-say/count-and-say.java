class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        
        String pre = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        
        char ch = pre.charAt(0);
        int cnt = 1;
        
        for(int i=1;i<pre.length();i++){
            char t = pre.charAt(i);
            if(t == ch)
                cnt ++ ;
            else{
                sb.append(cnt).append(ch);
                ch = t;
                cnt = 1;
            }
        }
        
        sb.append(cnt).append(ch);
        
        return sb.toString();
    }
}