/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if(headA==null||headB==null) return null;
        
        ListNode curA = headA;
        ListNode curB = headB;
        
        int ca = getLength(headA);
        int cb = getLength(headB);
        
        if(ca<cb){
            for(int i=0;i<cb-ca;i++)
                curB = curB.next;
        }else{
            for(int i=0;i<ca-cb;i++)
                curA = curA.next;
        }
        
        while(curA != curB ){
            curA = curA.next;
            curB = curB.next;
            if(curA==null||curB==null)
                return null;
        }
          
        return curA;
    }
    
    public int  getLength(ListNode head) {
        int c = 0;
        while(head!=null){
            head = head.next;
            c++;
        }
        return c;
        
    }
}