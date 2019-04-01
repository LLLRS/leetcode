class Solution {
    public int findLHS(int[] nums) {

        int n = nums.length;
        int maxLen = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++)
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

        for(int key : hm.keySet()){
            int t =  Math.max(hm.getOrDefault(key-1,0)
                        , hm.getOrDefault(key+1,0));
            
            if(t != 0 && hm.get(key) + t > maxLen)
                maxLen = hm.get(key) + t;
        }

        return maxLen;
    }
}