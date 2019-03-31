/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {

    	if(head==null) return head;
    	ListNode dummy = new ListNode(0);
    	ListNode pro = dummy;
    	ListNode cur = head;
    	
    	while(cur!=null){
    		ListNode nex = cur.next;
    		while(pro.next!=null&&pro.next.val<cur.val)
    			pro = pro.next;
    		
    		cur.next = pro.next;
    		pro.next = cur;
    		pro = dummy;
    		cur = nex;

    	}
    	return dummy.next;
    }
}