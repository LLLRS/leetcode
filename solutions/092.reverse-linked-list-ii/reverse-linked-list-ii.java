/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null) return null;        
        if(m==n) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;       
        
        for(int i=1;i<m;i++)
            cur = cur.next;
        ListNode t1 = cur;
        ListNode t2 = cur.next;
        cur = t2;
        ListNode pro = null;
        
        for(int i=0;i<n-m+1;i++){

            ListNode nex = cur.next;
            
            cur.next = pro;
            pro = cur;
            cur = nex;
            
        }
        t2.next = cur;
        t1.next = pro;
        
        return dummy.next;
    }
}