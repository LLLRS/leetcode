/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
      if(head==null||head.next==null)
      	return head;
      
      ListNode cur = head;    
      int count = 0;

      while(cur!=null){
    	  cur = cur.next;
    	  count++;
      }
      
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      
      for(int step=1;step<count;step +=step){
    	  cur = dummy.next;
    	  ListNode left = null;
    	  ListNode right = null;
    	  ListNode end = dummy;
    	  
    	  while(cur!=null){
    		  ListNode t = null;
    		  left = cur;
    		  for(int i=0;cur!=null&i<step;i++){
    			  t = cur;
    			  cur = cur.next;
    		  }
    		  t.next = null;
    		  
    		  right = cur;
    		  
    		  for(int i=0;cur!=null&i<step;i++){
    			  t = cur;
    			  cur = cur.next;
    		  }
    		  t.next = null;
    		  
    		  end = merge(left,right,end);
    	  }
      }
      
      return dummy.next;
  }
	public  ListNode merge(ListNode l1, ListNode l2,ListNode dummy) {
		if(l1==null){
			dummy.next = l2;
			return null;
		}
			
		if(l2==null) {
			dummy.next = l1;
			return null;
		}
		
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
		
		return cur;
	}
}