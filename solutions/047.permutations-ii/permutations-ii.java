class Solution {

    List<List<Integer>> res = new ArrayList<>();
    boolean[] used = null;
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        res.clear();
        if(nums.length==0) return res;
        used = new boolean[nums.length];
        for(int i=0;i<nums.length;i++)
            used[i]  = false;
        
        Arrays.sort(nums);
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
            if(used[i]) continue;
            //used[i-1] 表示i-1现在还没有使用，第i个相同的也就不能使用了
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;
            
            st.add(nums[i]);
            used[i] = true;
            permuteAux(nums,index+1,st);
            used[i] = false;
            st.remove(st.size()-1);
            
        }
        
        return;
    }
}