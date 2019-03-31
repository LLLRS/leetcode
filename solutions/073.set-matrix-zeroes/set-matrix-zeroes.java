class Solution {
    public void setZeroes(int[][] m) {
        
        int row = m.length;
        int col = m[0].length;
        
        if(row<=0||col<=0) return;
        
        boolean flag_row = false,flag_col = false;
        for(int i=0;i<row;i++){
            if(m[i][0]!=0) continue;
            
            flag_col = true;
            break;
        }
        
         for(int i=0;i<col;i++){
            if(m[0][i]!=0) continue;
            
            flag_row = true;
            break;
        }
        
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++)
                if(m[i][j]==0){
                    m[0][j] = 0;
                    m[i][0] = 0;
                }
        }
        
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++)
                if(m[i][0]==0||m[0][j]==0)
                    m[i][j] = 0;

        }
        
        if(flag_row){
            for(int i=0;i<col;i++)
                m[0][i] = 0;
        }
        
        if(flag_col){
            for(int i=0;i<row;i++)
                m[i][0] = 0;
        }
  
    }
}