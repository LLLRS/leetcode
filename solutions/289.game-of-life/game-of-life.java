class Solution {
    /**
     *   旧 --> 新
     *   0 --> 0   0
     *   0 --> 1   -1
     *   1 --> 0   2
     *   1 --> 1   1
     */
    
    private int[][] idx = {{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
    public void gameOfLife(int[][] board) {

        int row = board.length;
        int col = board[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int cnt = 0;
                for(int[] s : idx){
                    int nx = s[0] + i;
                    int ny = s[1] + j;
                    if(nx>=0&&ny>=0&&nx<row&&ny<col&& board[nx][ny] >=1)
                        cnt++;
                }
                if(cnt<2 || cnt>3)
                    board[i][j] = board[i][j] == 1 ? 2 : 0;
                else if(cnt == 3)
                    board[i][j] = board[i][j] == 0 ? -1 : 1;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j] == -1)
                    board[i][j] = 1;
                else if(board[i][j]==2)
                    board[i][j] = 0;
            }
        }

    }
}