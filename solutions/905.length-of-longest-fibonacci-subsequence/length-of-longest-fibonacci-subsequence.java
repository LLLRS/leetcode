class Solution {
    public int lenLongestFibSubseq(int[] nums) {
        int N = nums.length;
        Map<Integer, Integer> index = new HashMap();
        for (int i = 0; i < N; ++i)
            index.put(nums[i], i);

        Map<Integer, Integer> longest = new HashMap();
        int ans = 2;

        for (int k = 0; k < N; ++k)
            for (int j = 0; j < k; ++j) {
                int i = index.getOrDefault(nums[k] - nums[j], -1);
                int t = 0;
                if (i >= 0 && i < j) {
                    // Encoding tuple (i, j) as integer (i * N + j)
                    int cand = longest.getOrDefault(i * N + j, 2) + 1;
                    longest.put(j * N + k, cand);
                    ans = Math.max(ans, cand);
                }
            }

        return ans == 2 ? 0 : ans;
    }
}