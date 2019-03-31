class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = g.length-1;
        int si = s.length-1;
        int res = 0;
        
        while(gi>=0&&si>=0){
            if(s[si]>=g[gi]){
                res++;
                si--;
                gi--;
            }else
                gi--;
            
        }
        
        return res;
    }
}