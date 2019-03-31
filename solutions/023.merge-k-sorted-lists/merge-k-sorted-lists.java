/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode dummy = new ListNode(0);
        ListNode nex = dummy;

        
        for(int i=0;i<lists.length;i++){
            ListNode cur = lists[i];
            while(cur!=null){
                pq.add(cur.val);
                cur = cur.next;               
            }
        }
        int n = pq.size();
        for(int i=0;i<n;i++){
            int t = pq.poll();
            nex.next = new ListNode(t);
            nex = nex.next;
        }
        return dummy.next;
        
    }
}