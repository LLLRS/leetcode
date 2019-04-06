class Solution {

    public int minDeletionSize(String[] nums) {
        int res = 0;

        int n = nums.length;
        int len = nums[0].length();
        boolean[] cuts = new boolean[n-1];

        search: for(int i=0;i<len;i++){
            for(int j=0;j<n-1;j++){
                if(!cuts[j] && nums[j].charAt(i) > nums[j+1].charAt(i)){
                    res++;
                    continue search;
                }
            }

            for(int j=0;j<n-1;j++)
                if(nums[j].charAt(i) < nums[j+1].charAt(i))
                    cuts[j] = true;
                
        }
        
        return res;
    }
}