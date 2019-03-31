/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pro = dummy;
        ListNode cur = dummy;
        for(int i=0;i<n+1;i++)
            cur = cur.next;
        
        while(cur!=null){
            cur = cur.next;
            pro = pro.next;
        }
        
        pro.next = pro.next.next;
        
        return dummy.next;
        
        
        
    }
}