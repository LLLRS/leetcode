class RandomizedCollection {

	HashMap<Integer, LinkedList<Integer>> hs = null;
	ArrayList<Integer> list = null;
	Random rand = new Random();
    public RandomizedCollection() {
    	hs = new HashMap<>();
    	list = new ArrayList<>();
    }
    

    public boolean insert(int val) {
        
    	LinkedList<Integer> t = hs.getOrDefault(val, new LinkedList<>());
        t.add(list.size());
        hs.put(val, t);
        list.add(val);
        
        return t.size() == 1;
    }
    
    
    public boolean remove(int val) {
        
    	if(!hs.containsKey(val)) return false;
    	
    	LinkedList<Integer> t = hs.get(val);
    	int p = t.get(t.size()-1);
    	
    	if(p < list.size() -1){
    		int l = list.get(list.size()-1);
    		LinkedList<Integer> tl = hs.get(l);
    		  			
    		tl.removeFirst();
    		tl.add(p);
    		hs.put(l, tl);
    		list.set(p, l);
    	}
    	
    	list.remove(list.size()-1);
    	if(t.size() == 1)
    		hs.remove(val);
    	else{
	    	t.remove(t.size()-1);
	    	hs.put(val, t);
    	}
    	
    	
    	return true;
    }
    

    public int getRandom() {
    	return list.get(rand.nextInt(list.size()));
    }
}