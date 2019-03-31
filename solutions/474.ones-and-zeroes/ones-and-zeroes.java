class Solution {
     public  int findMaxForm(String[] s, int m, int n) {
         int len  =  s.length;
         if(m<0||n<0||len==0) return  0;
         
         List<int []>  mn = countS(s);
         int[][]  res = new int[m+1][n+1];
         
         for(int k=0;k<len;k++){
             int mt = mn.get(k)[0];
             int nt = mn.get(k)[1];
             
             for(int i=m;i>=mt;i--)
                 for(int j=n;j>=nt;j--)
                    res[i][j] = Math.max(res[i][j], 1+res[i-mt][j-nt]);         

        }
         return res[m][n];
     }
          
     //统计每个字符串中 0和1的个数
     private  List<int[]> countS(String[] s){
         List<int[]>  mn = new ArrayList<>();
         
         for(int i=0;i<s.length;i++){
             int m = 0;
             for(int j=0;j<s[i].length();j++)
                 if(s[i].charAt(j)=='0')
                	 m++;
              int[] t = {m,s[i].length()-m};
              mn.add(t);
         }
         
         return mn;
     }
}