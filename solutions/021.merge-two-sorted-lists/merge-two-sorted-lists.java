/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        if(l1==null) return l2;
        if(l2==null) return l1;
        
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        
		while(l1!=null||l2!=null){
			int c1 = Integer.MAX_VALUE;
			int c2 = Integer.MAX_VALUE;
			
			if(l1!=null) c1 = l1.val;
			if(l2!=null) c2 = l2.val;
			
			if(c1<c2){
				cur.next = l1;
				cur = l1;
				l1 = l1.next;
			}else{
				cur.next = l2;
				cur = l2;
				l2 = l2.next;
			}
		}
		
        
        return dummy.next;
    }
}