/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {}

    public Node(int _val,Node _prev,Node _next,Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};
*/
class Solution {
    public Node flatten(Node head) {
        if(head == null)
            return null;
        Node root = head;
        
        while(head != null && head.child == null){
            head = head.next;
        }
        
        Node nex =null,child = null;
        if(head !=null){
            nex = flatten(head.next);
            child = flatten(head.child);
            head.child = null;
            head.next = child;
            child.prev = head;
        }
        
        while(child!=null && child.next!=null){
            child = child.next;
        }
        
        if(child != null && nex != null){
            
            child.next = nex;
            nex.prev = child;
        }
        
          
        return root;
    }
}