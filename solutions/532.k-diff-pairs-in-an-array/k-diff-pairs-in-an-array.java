class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        int res = 0;
        
        if(k==0){
            HashMap<Integer,Integer> hs = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                hs.put(nums[i],hs.getOrDefault(nums[i],-1)+1);
            }
            
            for(int t : hs.values()){
                if(t>0) res++;
            }
        }else {
            TreeSet<Integer> ts = new TreeSet<>();
            for(int i=0;i<nums.length;i++){
                ts.add(nums[i]);
            }
            for(int t : ts){
                if(ts.contains(t+k))
                    res++;
            }
        }

        return res;
        
    }
}