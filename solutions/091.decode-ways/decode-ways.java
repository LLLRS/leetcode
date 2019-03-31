class Solution {
    public int numDecodings(String s) {
       
        int n = s.length();        
        if(n==0) return 0;
        
        int[] res = new int[n+1];
        res[0] = 1;
        res[1] = s.charAt(0)=='0'? 0:1;
        for(int i=2;i<=n;i++){
            
            int t1 = Integer.valueOf(s.substring(i-1,i)); 
            int t2 = Integer.valueOf(s.substring(i-2,i));

            if(t1>=1)  
              res[i] = res[i-1];
            if(t2>=10&&t2<=26)  
              res[i] += res[i-2];

        }
        
        return res[n];
    }
}