/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        
        int up = 0;
        while(l1 != null || l2 != null || up != 0){
            int t = up;
            
            if(l1 != null){
                t += l1.val;
                l1 = l1.next;
            }
            
            if(l2 != null){
                t += l2.val;
                l2 = l2.next;
            }
            
            pre.next = new ListNode(t%10);
            up = t/10;
            pre = pre.next;
        }
        
        return dummy.next;
    }
}