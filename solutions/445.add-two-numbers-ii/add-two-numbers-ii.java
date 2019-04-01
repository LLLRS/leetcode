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
        ListNode cur = null;
        
        ArrayList<Integer> a1 = toArrayList(l1);
        ArrayList<Integer> a2 = toArrayList(l2);
        
        int m = a1.size()-1,n = a2.size()-1;
        int sum = 0;
        
        
        while(m>=0||n>=0||sum!=0){
            if(m>=0) sum = sum + a1.get(m--);
            if(n>=0) sum += a2.get(n--);
            
            cur = new ListNode(sum%10);
            sum = sum/10;
            
            cur.next = dummy.next;
            dummy.next = cur;
            
        }
        
        return dummy.next;
    }
    
    public ArrayList<Integer> toArrayList(ListNode head){
        
        ArrayList<Integer> arr = new ArrayList();
        ListNode cur = head;

        while(cur!=null){
            arr.add(cur.val);
            cur = cur.next;
        }
        
        return arr;
    }
}