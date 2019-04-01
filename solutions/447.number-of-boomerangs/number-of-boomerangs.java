class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        for(int i =0;i<points.length;i++){
        	HashMap<Integer,Integer> hm = new HashMap<>();
        	
        	for(int j=0;j<points.length;j++){
        		if(i==j) continue;
        		int tt = dis(points[i],points[j]);
        		if(hm.containsKey(tt)) 
        			hm.put(tt, hm.get(tt)+1);
        		else
        			hm.put(tt,1);      		
        	}
        	
        	for(int re:hm.keySet()){
        		int t = hm.get(re);
        		res += t*(t-1);
        	}
        }
        
        return res;
    }
    
    private int dis(int[] p1, int[] p2) {

        return (p1[0]-p2[0])*(p1[0]-p2[0])+(p1[1]-p2[1])*(p1[1]-p2[1]);
    }
}