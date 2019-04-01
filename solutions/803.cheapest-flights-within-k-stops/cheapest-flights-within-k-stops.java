class Solution {
    
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        Queue<int[]> pq = new PriorityQueue<>((a, b) -> (Integer.compare(a[0], b[0])));
        pq.add(new int[] {0, src, k + 1});
        while (!pq.isEmpty()) {
            int[] top = pq.remove();
            int price = top[0];
            int city = top[1];
            int stops = top[2];
            if (city == dst) return price;
            if (stops > 0) {
            	
            	for(int i=0;i<flights.length;i++){
            		if(flights[i][0]!=city) continue;
            		
            		pq.add(new int[] {price + flights[i][2], flights[i][1], stops - 1});
            	}
            	
            }
        }
        return -1;
    }
}