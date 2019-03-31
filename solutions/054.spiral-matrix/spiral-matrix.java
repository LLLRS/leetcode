class Solution {
     public  List<Integer> spiralOrder(int[][] m) {
         List<Integer> res = new ArrayList<>();
         if(m.length == 0) return res;
         
         int sx = 0,sy = 0;
         int ex = m.length-1,ey = m[0].length-1;
                 
         while(true){
        	 for(int i=sy;i<=ey;i++) res.add(m[sx][i]);
        	 if(++sx>ex) break;
        	 
        	 for(int i=sx;i<=ex;i++) res.add(m[i][ey]);
        	 if(--ey<sy) break;
        	 
        	 for(int i=ey;i>=sy;i--) res.add(m[ex][i]);
        	 if(--ex<sx) break;
        	 
        	 for(int i=ex;i>=sx;i--) res.add(m[i][sy]);
       	     if(++sy>ey) break;
         }
         
         return res;  
     }
}