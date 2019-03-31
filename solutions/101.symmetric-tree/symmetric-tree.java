/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        
       return compare(root.left,root.right); 

    }
    
    public boolean compare(TreeNode l ,TreeNode r){
        if(l==null&&r==null)
            return true;
        if(l==null||r==null)
            return false;
        
        return l.val==r.val&&compare(l.left,r.right)&&compare(l.right,r.left);
    }

}