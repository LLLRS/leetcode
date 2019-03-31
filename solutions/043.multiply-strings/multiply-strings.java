class Solution {
    public String multiply(String num1, String num2) {
        
        if(num1==null||num2==null) return "";
        if(num1.equals("")||num2.equals("")) return "";
        if(num1.equals("0")||num2.equals("0")) return "0";
        
        int len1 = num1.length();
        int len2 = num2.length();
        if(len1==0||len2==0)  return  "0";
        if(len1>len2)  //确num1是较短那个短
            return multiply(num2,num1);
        
        int[] res = new int[len1 + len2 - 1];
        
        for(int i=0;i<len1;i++){
            int t1 = num1.charAt(i) - '0';
            for(int j=0;j<len2;j++){
                int t2 = num2.charAt(j) - '0';
                res[i+j] = res[i+j] + t1 * t2;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int du = 0;
        for(int i=res.length-1;i>=0;i--){
            res[i] = res[i] + du;
            
            du = res[i] / 10;
            res[i] = res[i] % 10;
        }
        
        if(du!=0) sb.append(du);
        for(int i=0;i<res.length;i++)
            sb.append(res[i]);
        
        
        return sb.toString();
    }
}