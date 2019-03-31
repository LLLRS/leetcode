class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        for(int i=0;i<=nums.length;i++)
            combine(nums,i,0,new ArrayList<Integer>());
        
        return res;
        
    }
    
    private void combine(int[] nums,int k,int sta,List<Integer> t){
        
        if(t.size()==k){
            res.add(new ArrayList(t));
            return;
        }
        
        for(int i = sta;i<=nums.length-(k-t.size());i++){
            t.add(nums[i]);
            combine(nums,k,i+1,t);
            t.remove(t.size()-1);
        }
    }
}    