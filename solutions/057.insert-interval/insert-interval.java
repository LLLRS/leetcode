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
     public static List<Interval> insert(List<Interval> nums, Interval t){
         
    	List<Interval> res = new ArrayList<>();
        int n = nums.size();
        if(n==0){
            res.add(t);
            return res;
        }
        
        if(t.end<nums.get(0).start){
            res.add(t);
            res.addAll(nums);
            return res;
        }
        
        if(t.start>nums.get(n-1).end){
            res.addAll(nums);
            res.add(t);
            return res;
        }
        
        int i = 0;
        for(;i<n;i++){
            Interval s = nums.get(i);
            if( t.start > s.end)
                res.add(s);
            else
                break;
        }
        
        if(i==n){
            res.add(t);
            return res;
        }
        
        Interval nt = new Interval(0,0);
        nt.start = nums.get(i).start > t.start ? t.start : nums.get(i).start;
        
        for(;i<n;i++){
            Interval s = nums.get(i);
            if(t.end>=s.start&&t.end<=s.end){
                nt.end = s.end;
                res.add(nt);
                i++;
                break;
            }else if(t.end < s.start){
                nt.end = t.end;
                res.add(nt);
                break;
            }
        }
        
        if(i==n&&nums.get(i-1).end<t.end){
            nt.end = t.end;
            res.add(nt);
            return res;
        }
        
        for(;i<n;i++){
            res.add(nums.get(i));
        }

        return res;
     }
}