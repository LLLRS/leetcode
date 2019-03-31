class Solution {
    public int findMaxLength(int[] nums) {
        
        int res = 0;
        int len = nums.length;
        if(len<2) return 0;
        
        int cnt = 0;
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,0);
        
        for(int i=1;i<=len;i++){
            if(nums[i-1]==0)
                cnt--;
            else
                cnt++;
            
            if(hm.containsKey(cnt))
                res = Math.max(res,i-hm.get(cnt));
            else
                hm.put(cnt,i);     
        }
        
        return res;
    }
}