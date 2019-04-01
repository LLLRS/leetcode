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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null&&root.right==null)
            return 1;
        
        int t = Integer.MAX_VALUE;
        
        if(root.left!=null)
            t = Math.min(t,minDepth(root.left));
        if(root.right!=null)
            t = Math.min(t,minDepth(root.right));
        
        return t+1;
    }
}