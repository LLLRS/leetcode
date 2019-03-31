class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
		
		HashMap<Integer,Integer> tm = new HashMap<>();
		
		for(int i =0;i<nums.length;i++){
            if(tm.containsKey(target - nums[i])){
                res[0]=tm.get(target-nums[i]);
                res[1]=i;
                return res;
 
            }else{
                tm.put(nums[i],i);
            }
        } 
            return res;
    }
}