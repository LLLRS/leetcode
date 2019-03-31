/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode p = dummy;
            
        while(p.next!=null&&p.next.next!=null){
            ListNode node1 = p.next;
            ListNode node2 = p.next.next;
            ListNode nex = node2.next;
            
            p.next = node2;
            node2.next = node1;
            node1.next = nex;
            
            p = node1;
        }
        
        return dummy.next;
        
    }
}