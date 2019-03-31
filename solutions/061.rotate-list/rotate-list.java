/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null) return null;
        if(head.next==null||k==0) return head;
        
        ListNode cur = head;
        
        int cnt = 0;
        for(int i=0;i<k;i++){
            cur = cur.next;
            cnt++;
            if(cur==null)
                return rotateRight(head,k%cnt);
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode pre = null;
        while(cur!=null){
            pre = cur;
            cur = cur.next;
            slow = slow.next;
        }
        
        cur = slow.next;
        slow.next = null;
        pre.next = dummy.next;
        
        return cur;

    }
}