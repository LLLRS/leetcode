class RandomizedSet {

	HashMap<Integer, Integer> hs = null;
	ArrayList<Integer> list = null;
    Random rand = new Random();
    
    public RandomizedSet() {
    	hs = new HashMap<>();
    	list = new ArrayList<>();
    }
    
    
    public boolean insert(int val) {
        if(hs.containsKey(val)) return false;
        
        hs.put(val, list.size());
        list.add(val);
        return true;
    }
    
    
    public boolean remove(int val) {
    	
    	if(!hs.containsKey(val)) return false;
    	
    	int t = hs.get(val);
    	if(t < list.size()-1){
    		int l = list.get(list.size()-1);
    		hs.put(l, t);
    		list.set(t, l);
    	}
        
    	hs.remove(val);
    	list.remove(list.size()-1);
    	return true;
    }
    

    public int getRandom() {
    	
    	return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */