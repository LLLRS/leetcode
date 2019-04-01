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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if(t1 == null && t2 == null)
            return null;

        int v = 0;
        if(t1 != null )
            v += t1.val;

        if(t2 != null)
            v += t2.val;

        TreeNode root = new TreeNode(v);
        

        root.left = mergeTrees(t1==null ? null : t1.left,t2==null ? null : t2.left);
        root.right = mergeTrees(t1==null ? null : t1.right,t2==null ? null : t2.right);

        return root;
    }

}