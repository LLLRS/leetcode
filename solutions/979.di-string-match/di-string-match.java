class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] res = new int[n+1];

        char[] ch = s.toCharArray();
        int l = 0,r = n;
        
        int t = 0;
        for(int i=0;i<n;i++){
            if(ch[i] == 'I')
                res[t++] = l++;
            else
                res[t++] = r--;

        }

        res[n] = l;
        return res;
    }
}