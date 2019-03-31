class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        
        
        TreeSet<Long> ts = new TreeSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(ts.ceiling((long)nums[i]-(long)t)!=null&&
            		ts.ceiling((long)nums[i]-(long)t)<=(long)nums[i]+(long)t)
                return true;
            
            ts.add((long)nums[i]);
            
            if(ts.size()==k+1)
                ts.remove((long)nums[i-k]);
        }
        
        return false;

    }
}