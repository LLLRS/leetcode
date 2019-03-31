class Solution {

    public void wiggleSort(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        int[] temp = nums.clone();
        int idx = n-1;

        for(int i=1;i<n;i += 2)
            nums[i] = temp[idx--];
        
        for(int i=0;i<n;i += 2)
            nums[i] = temp[idx--];

    }
}