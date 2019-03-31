class Solution {
    public int trapRainWater(int[][] map) {
        
        if(map.length == 0 || map[0].length == 0) return 0;
        int res = 0;
        
        int m = map.length;
        int n = map[0].length;
        boolean used[][] = new boolean[m][n];
        int[][] idx = {{0,1},{1,0},{-1,0},{0,-1}};
        
        PriorityQueue<Cell> minHeap = new PriorityQueue<>(new Comparator<Cell>() {
			@Override
			public int compare(Cell c1, Cell c2) {

				return c1.h - c2.h;
			}
		});
        //第一列  最后一列
        for(int i=0;i<m;i++){
        	used[i][0] = true;
        	minHeap.offer(new Cell(i, 0, map[i][0]));
        	used[i][n-1] = true;
        	minHeap.offer(new Cell(i, n-1, map[i][n-1]));
        }
        //第一行 最后一行
        for(int i=1;i<n-1;i++){
        	used[0][i] = true;
        	minHeap.offer(new Cell(0, i, map[0][i]));
        	used[m-1][i] = true;
        	minHeap.offer(new Cell(m-1, i, map[m-1][i]));
        }
        
        while(!minHeap.isEmpty()){
        	Cell cur = minHeap.poll();
        	for(int i=0;i<4;i++){
        		int nx = cur.x + idx[i][0];
        		int ny = cur.y + idx[i][1];
        		
        		if(nx>=0&&ny>=0&&nx<m&&ny<n&&!used[nx][ny]){
        			used[nx][ny] = true;
        			if(cur.h > map[nx][ny]) 
        				res += cur.h - map[nx][ny];
        			
        			minHeap.offer(new Cell(nx, ny, Math.max(cur.h, map[nx][ny])));
        		}
        	}
        }
        
        return res;
    }
    
}


class Cell {
	
	int x;
	int y;
	int h;
	
	public Cell(int x, int y, int h) {

		this.x = x;
		this.y = y;
		this.h = h;
	}
	
}