class Solution {
    
    
    public int findPaths(int m, int n, int N, int i, int j) {
        
        if(m<=0||n<=0||N<=0)
            return 0;
        
        int mod = 1000000007;
        int[][] count = new int[m][n];
        count[i][j] = 1;
                
        int[][] idx = {{-1,0},{0,1},{1,0},{0,-1}}; //上 右 下 左
        int res = 0;
        
        for(int step = 0 ;step<N;step++){
            int[][] temp = new int[m][n];
            for(int x=0;x<m;x++){
                for(int y=0;y<n;y++){
                    for(int t=0;t<4;t++){
                        int nx = idx[t][0] + x;
                        int ny = idx[t][1] + y;
                        
                        if(nx<0||ny<0||nx>=m||ny>=n){
                            res = (res + count[x][y]) % mod;
                        }else{
                            temp[nx][ny] = (temp[nx][ny] + count[x][y]) % mod;
                        }
                    }
                }
            }
            count = temp;
            
        }

                
        return res;   
    }
    

}