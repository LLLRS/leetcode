/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        //时间复杂度为O(n) 空间复杂度为O(k)
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        boolean flag = false;
        
        while(p!=null&&p.next!=null){
            ListNode[] tt = new ListNode[k];
            tt[0] = p.next;
            for(int i=1;i<k;i++){
                tt[i] = tt[i-1].next;
                if(tt[i]==null){
                     flag = true;
                     break; 
                }                   
            }
            if(flag) break;
            
            ListNode nex = tt[k-1].next;
            
            p.next = tt[k-1];
            for(int i=k-1;i>0;i--){
                tt[i].next = tt[i-1];
            }
            tt[0].next = nex;
            p = tt[0];
            
        }
        return dummy.next;
    }
}