class Solution {
    public boolean isNStraightHand(int[] hand, int w) {
        
        TreeMap<Integer, Integer> ts = new TreeMap<>();
        for(int t : hand)
        	ts.put(t, ts.getOrDefault(t, 0) + 1);
        
        while(ts.size() > 0){

        	int t = ts.firstKey();
        	
        	for(int i =t;i<t+w;i++){
        		if(!ts.containsKey(i)) return false;
        		
        		int v = ts.get(i);
        		if(v==1)
        			ts.remove(i);
        		else
        			ts.put(i,v-1);

        	}
        }
    	     
    	return true;
    }
}