class Solution {
    List<List<Integer>> res = new ArrayList<>();
    boolean[] used = null;
    
    public List<List<Integer>> permute(int[] nums) {
        res.clear();
        if(nums.length==0) return res;
        used = new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
            used[i]  = false;
        
        List<Integer> st = new ArrayList<>();
        permuteAux(nums,0,st);
        return res;
    }
    
    private void permuteAux(int[] nums,int index,List<Integer> st) {
        if(index == nums.length){
            List<Integer> t = new ArrayList<>(st);
            res.add(t);
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!used[i]){
                st.add(nums[i]);
                used[i] = true;
                permuteAux(nums,index+1,st);
                used[i] = false;
                st.remove(st.size()-1);
            }
        }
        
        return;
    }
}