class Solution {
    public  String largestNumber(int[] nums) {
        
    	ArrayList<Integer> list = new ArrayList<>();
    	StringBuilder sb = new StringBuilder();
    	
    	int z = 0;
    	for(int t : nums){
    		list.add(t);
    		if(t == 0)
    			z++;
    	}
    	
        if(z==nums.length)
    		return "0";
        
    	Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer t1, Integer t2) {
				String s1 = t1.toString() + t2.toString();
				String s2 = t2.toString() + t1.toString();
				return s2.compareTo(s1);
			}
		});
    	
    	for(int t : list)
    		sb.append(t);
    	
    	return sb.toString();
    }
}