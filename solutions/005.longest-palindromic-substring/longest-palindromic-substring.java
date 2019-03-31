class Solution {
    public  String longestPalindrome(String s) {
        
        if(s==null||s.length()==0) return "";
        
	    int n = s.length();
        boolean[][] pal = new boolean[n][n];
        //pal[i][j] 表示s[i...j]是否为回文串
        int maxLen = 0;
        int l = 0,r = 0;
        
        for(int i=0;i<n;i++){
            int j = i;
            while(j>=0){
                if(s.charAt(i)==s.charAt(j)&&(i-j<2||pal[j+1][i-1])){
                    pal[j][i] = true;
                    if (maxLen < i-j+1){
                        maxLen = i-j+1;
                        r = i;
                        l = j;
                    }
                }
                j--;
                
            }
        }
    	
        return s.substring(l,r+1);
    }
}