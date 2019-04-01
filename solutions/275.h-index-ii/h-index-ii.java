class Solution {
public int hIndex(int[] c) {
    
	int n = c.length;
	int l = 0, h = n - 1;
	while (l <= h) {
		int m = (h + l) / 2;
        
		if (c[m] == n - m) {
			return n - m;
		} else if (c[m] < n - m) {
			l = m + 1;
		} else { 

			h = m - 1;
		}
	}
	return n - l;
}
}