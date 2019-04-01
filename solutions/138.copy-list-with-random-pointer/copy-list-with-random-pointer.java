/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head == null)
            return null;
        
        RandomListNode cur = head;
        while(cur != null){
            RandomListNode nex = cur.next;
            RandomListNode t = new RandomListNode(cur.label);
            
            cur.next = t;
            t.next = nex;
            cur = nex;
        }

        cur = head;
        while(cur != null){
            RandomListNode nex = cur.next.next;
            
            if(cur.random != null)
                cur.next.random = cur.random.next;
            
            cur = nex;
        }

        RandomListNode dummy = new RandomListNode(0);
        RandomListNode pre = dummy;

        cur = head;
        while(cur != null){
            RandomListNode nex = cur.next.next;
            RandomListNode t = cur.next;
            
            t.next = null;
            pre.next = t;
            pre = pre.next;
            
            cur.next = nex;
            cur = nex;
        }
        
        return dummy.next;
    }
}