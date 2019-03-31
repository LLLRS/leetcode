class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int l = -1, r = 0;
        int ans = 0;

        for (int i = 0; i < n; ++i) {
            if (seats[i] == 1) {
                l = i;
            } else {
                while (r < n && seats[r] == 0 || r < i)
                    r++;

                int left = l == -1 ? n : i - l;
                int right = r == n ? n : r - i;
                ans = Math.max(ans, Math.min(left, right));
            }
        }

        return ans;
    }
}