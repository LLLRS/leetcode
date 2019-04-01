class Solution {
    public boolean searchMatrix(int[][] m, int ta) {
        int row = m.length;
        if(row==0) return false;
        int col = m[0].length;        
        if(col==0) return false;
        int c = col -1,r = 0;
        
        while(c>=0&&r<=row-1){
            if(ta==m[r][c])  return true;
            else if(ta>m[r][c]) r++;
            else c--;
            
        }   
        return false;
    }
    

}