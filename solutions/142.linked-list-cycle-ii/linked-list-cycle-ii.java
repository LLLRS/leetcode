/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
               
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
        while(fast!= null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast){
                flag = true;
                break;
            }
        }
        
        if(!flag) return null;
        
        fast = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next; 
        }
        
        return fast;
    }
}