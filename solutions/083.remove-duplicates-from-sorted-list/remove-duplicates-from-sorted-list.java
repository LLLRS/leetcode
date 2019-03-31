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
        
        ListNode pro = head;
        ListNode cur = head.next;
        
        while(cur!=null){
            if(cur.val!=pro.val){
                pro.next = cur;
                pro = cur;
            } 
            
            cur = cur.next;    
            pro.next = null;
        }
        return head;
    }
}