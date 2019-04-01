class Solution {
    public boolean wordBreak(String s, List<String> dic) {
        if(dic.size()==0) return false;
        int n = s.length();
        
        // res[i] 代表 s.substring(0,i) 是否在dic中可以找到
        boolean[] res = new boolean[n+1];
        res[0] = true;
        
        for(int i=1;i<=n;i++)
            for(int j=0;j<=i;j++)
                if(res[j]&&dic.contains(s.substring(j,i))){
                    res[i] = true;
                    break;
                }
          
        return res[n];        
    }
}