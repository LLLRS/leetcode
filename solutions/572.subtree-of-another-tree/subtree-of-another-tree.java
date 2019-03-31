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
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null)
            return false;
        
        if(s.val == t.val)
            if(isSubtreeAux(s,t))
                return  true;
        
        return isSubtree(s.left , t) || isSubtree(s.right,t);
    }

    private boolean isSubtreeAux(TreeNode s, TreeNode t) {
        if( s==null && t == null)
            return true;
        
        if(s == null || t == null || t.val != s.val)
            return false;
        
        return isSubtreeAux(s.left , t.left) && isSubtreeAux(s.right,t.right);
    }
}