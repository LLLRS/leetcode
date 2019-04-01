/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {

    	ListNode dummy = new ListNode(0);
    	dummy.next =head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode h2 = reverse(slow.next);
        slow.next = null;

        while(h2!=null){
        	ListNode nex1 = head.next;
        	ListNode nex2 = h2.next;
        	
        	head.next = h2;
        	head.next.next = nex1;
        	head = nex1;
        	h2 = nex2;
        } 
    }
    public ListNode reverse(ListNode head){
        if(head ==null) return null;
        
        ListNode pro = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode nex = cur.next;
            
            cur.next = pro;
            pro = cur;
            cur = nex;
        }
        
        return pro;
    }
}