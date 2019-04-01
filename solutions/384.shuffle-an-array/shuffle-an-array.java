class Solution {

    private int[] nums = null;
    private int[] original = null;

    private Random r = new Random();
    public Solution(int[] nums) {
        this.nums = nums;
        this.original = nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        nums = original;
        original = nums.clone();
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {

        for(int i=0;i<nums.length;i++)
            swap(i,i + r.nextInt(nums.length - i));
        
        return nums;
    }

    private void swap(int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}