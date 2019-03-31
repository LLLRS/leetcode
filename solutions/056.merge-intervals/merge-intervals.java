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
     public  List<Interval> merge(List<Interval> nums) {
    	 List<Interval>  res = new ArrayList<>();
        
        if(nums==null||nums.size()==0) return res;
        int n = nums.size();
        
        Collections.sort(nums,new Comparator<Interval>() {
            @Override
            public int compare(Interval t1, Interval t2) {
                int t = t1.start - t2.start;
                return t!=0? t : t1.end - t2.end;
            }});
        
        res.add(nums.get(0));
        
        for(int i=1;i<n;i++){
            Interval pre = res.get(res.size() - 1);
            Interval cur = nums.get(i);
            
            if(cur.start > pre.end){
                res.add(cur);
                continue;
            }  
                
            
            int st = cur.start > pre.start ? pre.start : cur.start;
            int ed = cur.end > pre.end ? cur.end : pre.end;
                
            Interval t = new Interval(st,ed);
            res.remove(res.size() - 1);
            res.add(t);
        }
        
        return res;
    }
}