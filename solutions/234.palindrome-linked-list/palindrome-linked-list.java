/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

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
            if(h2.val!=head.val){
                return false;
            }

        	head = head.next;
        	h2 = h2.next;

        } 
        return true;
    }
    public  ListNode reverse(ListNode head){
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