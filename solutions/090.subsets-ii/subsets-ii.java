class Solution {
    List<List<Integer>> res = new ArrayList<>();
    boolean[] used = null;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        used = new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
            used[i] = false;
        
        Arrays.sort(nums);
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
            if(used[i]) continue;
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1]) continue;
            
            used[i] = true;
            t.add(nums[i]);
            combine(nums,k,i+1,t);
            t.remove(t.size()-1);
            used[i] = false;
        }
    }
} 