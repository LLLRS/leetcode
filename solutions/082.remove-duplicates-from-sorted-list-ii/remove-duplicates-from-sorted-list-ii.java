/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        
        while(cur!=null){
            if(cur.next!=null&&cur.next.val == cur.val){
                pre.next = null;
                ListNode t = cur.next.next;
                while(t!=null&&t.val == cur.val)
                    t = t.next;
                
                cur = t;
                continue;
            }
            
            pre.next = cur;
            pre = cur;
            cur = cur.next;
        }
        
        return dummy.next;
    }
}