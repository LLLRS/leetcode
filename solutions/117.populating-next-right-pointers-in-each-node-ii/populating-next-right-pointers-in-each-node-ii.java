/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root==null) return;
        
        if(root.left!=null){
            if(root.right!=null){
                root.left.next =  root.right;
            }else{
                TreeLinkNode t = root.next;
                while(t!=null){
                    if(t.left!=null)
                        root.left.next = t.left;
                    else if(t.right!=null)
                        root.left.next = t.right;
                    
                    if(root.left.next!=null) break;
                    
                    t = t.next;
                }
            } 
        }
            
        
        if(root.right!=null){
            TreeLinkNode t = root.next;
            while(t!=null){
                if(t.left!=null)
                    root.right.next = t.left;
                else if(t.right!=null)
                    root.right.next = t.right;

                if(root.right.next!=null) break;

                t = t.next;
            }           

        }
            
        connect(root.right);//先处理右节点，放置左节点无法链接
        connect(root.left);
        
        
    }
}