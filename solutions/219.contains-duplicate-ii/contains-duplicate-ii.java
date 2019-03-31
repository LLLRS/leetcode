class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length==0||k==0) return false;

        HashSet<Integer> hs = new HashSet<>();
          
          for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i]))
                return true;
            else
                hs.add(nums[i]);
        
            if(hs.size()==k+1)
                hs.remove(nums[i-k]);
        }
    
        return false;
    }
}