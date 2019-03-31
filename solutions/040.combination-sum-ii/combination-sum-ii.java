class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    boolean[] used =null;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if(candidates.length==0||target<=0) return res;
        used = new boolean[candidates.length];
        for(int i=0;i<used.length;i++)
            used[i] = false;
        
        Arrays.sort(candidates);
        combinationSumAux(candidates,target,new ArrayList<Integer>(),0);
        return res;
        
    }
    
    private void combinationSumAux(int[] arr,int tar,List<Integer> st,int sta){
        if(tar==0){
            res.add(new ArrayList<Integer>(st));
            return;
        }

        for(int i=sta;i<arr.length&&tar>0;i++){
            if(used[i]) continue;
            
            if(i>0&&arr[i]==arr[i-1]&&!used[i-1]) continue;
            
            used[i] = true;
            st.add(arr[i]);
            combinationSumAux(arr,tar-arr[i],st,i);
            st.remove(st.size()-1);
            used[i] = false;
        
        }
    }
}