/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        
        if(head==null) return head;
        
        ListNode d1 = new ListNode(0);
        d1.next = head;
        ListNode d2 = new ListNode(0);
        
        ListNode cur = d1;
        ListNode nc = d2;
        
        while(cur.next!=null){
            if(cur.next.val<x){
                
                nc.next = cur.next;
                cur.next = cur.next.next;
                nc = nc.next;
                nc.next = null;
                
            }else{
                cur = cur.next;
            }
        }
            
        nc.next = d1.next;
        
        return d2.next;
    }
}