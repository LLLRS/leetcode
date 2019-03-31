class Solution {
    public String addStrings(String s1, String s2) {
        
        
        StringBuilder sb = new StringBuilder();
        int du = 0;
        int a = s1.length()-1,b = s2.length()-1;
        
        while(a>=0 || b>=0|| du !=0){
            
            int sum = du;
            if(a >= 0)
                sum += s1.charAt(a--) - '0';

            
            if(b >= 0)
                sum += s2.charAt(b--) - '0';
 
            
            du = sum / 10;
            sb.append(sum % 10);
        }
        
        return sb.reverse().toString();
        
    }
}