/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int eraseOverlapIntervals(Interval[] intervals) {
        int n = intervals.length;
    	 if(n==0) return 0;
    	 
    	 Arrays.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval t1, Interval t2) {
				return t1.start!=t2.start ?t1.start-t2.start:t1.end-t2.end;
			}
		});
         
    	 int[] res= new int[n];
    	 res[0] = 1;
        
    	 for(int i=1;i<n;i++)
             for(int j=0;j<i;j++){
                 if(intervals[i].start>=intervals[j].end)
                     res[i] = Math.max(res[i],1+res[j]);
             }

    	int max = res[0];
        for(int i=0;i<n;i++)
            if(res[i]>max)
                max = res[i];
        
    	 return n - max;        
    }
}