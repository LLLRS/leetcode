/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pro = dummy;
        ListNode cur = pro.next;
        
        while(cur!=null){
            if(cur.val!=val){
                pro.next = cur;
                pro = cur;
            }
            
            cur = cur.next;
            pro.next = null;
                
        }
        
        return dummy.next;
    }
}