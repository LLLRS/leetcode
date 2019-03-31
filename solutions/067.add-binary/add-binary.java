class Solution {
    public String addBinary(String a, String b) {
        
        int lenA = a.length();
        int lenB = b.length();
        if(lenA>lenB)  return addBinary(b, a); 
        int t = 0;
        String res = "";
        for(int i=lenA-1,j=lenB-1;i>=0;i--,j--){
            t = t + (a.charAt(i)-'0') + (b.charAt(j)-'0');
            res = (t%2) + res;
            t = t/2;            
        }

        for(int i = lenB-lenA-1;i>=0;i--){
            t = t +  (b.charAt(i)-'0');
            res = (t%2) + res;
            t = t/2;  
        }
        if(t==1) res = 1 + res;
        return res;
    }
    
}