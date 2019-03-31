public class Solution {
    int[][] move = {{-1,0},{0,1},{1,0},{0,-1}};
    int m,n;
    
    public boolean exist(char[][] b, String w) {
        m = b.length;
        n = b[0].length;
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                if(dfs(b,w,0,i,j))
                    return true;
        
        return false;
    }
    
    private boolean dfs(char[][] b, String w,int st,int x,int y){
 
        
        if(b[x][y]!=w.charAt(st))
            return false;
        
        if(st == w.length()-1)
            return true;
        
        b[x][y] ^= 256;  //大于等于256的2的整数次幂都可以
        for(int i=0;i<4;i++){
            int nx = x + move[i][0];
            int ny = y + move[i][1];
            
            if(inArea(nx,ny)&&dfs(b,w,st+1,nx,ny))
                return true;
        }
        b[x][y] ^= 256; 
            
         return false;   
    }
    
    private boolean inArea(int x,int y){
        return x>=0&&x<m&&y>=0&&y<n;
    }
}