class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length==0||target<=0) return res;
        
        combinationSumAux(candidates,target,new ArrayList<Integer>(),0);
        return res;
        
    }
    
    private void combinationSumAux(int[] arr,int tar,List<Integer> st,int sta){
        if(tar==0){
            res.add(new ArrayList<Integer>(st));
            return;
        }

        for(int i=sta;i<arr.length&&tar>0;i++){
            st.add(arr[i]);
            combinationSumAux(arr,tar-arr[i],st,i);
            st.remove(st.size()-1);
        
        }
    }
}