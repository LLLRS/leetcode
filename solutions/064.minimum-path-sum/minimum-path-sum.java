class Solution {
    int col = 0,row = 0;
    public int minPathSum(int[][] g) {
        
        row = g.length;
        if(row==0) return 0;
        col = g[0].length;

        for(int i=row-1;i>=0;i--){
            for(int j=col-1;j>=0;j--){
                if(i==row-1&&j==col-1) continue;
                
                int t1 = Integer.MAX_VALUE;
                int t2 = Integer.MAX_VALUE;
                if(inArea(i,j+1)) t1 = g[i][j+1];
                if(inArea(i+1,j)) t2 = g[i+1][j];
                
                g[i][j] = g[i][j] + Math.min(t1,t2);
            }
        }     
        
        
        return g[0][0];
    }
    private boolean inArea(int r,int c){
        
        return r>=0&&r<row&&c>=0&&c<col;
    }
    
}
