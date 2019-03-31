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
   
    public void flatten(TreeNode root) {
        if(root==null) return; 
        
        TreeNode l = root.left;
        TreeNode r = root.right;

        flatten(l);
        flatten(r);
        
        root.left = null;
        root.right = l;
        
        TreeNode cur = root;
        while(cur.right != null)  cur = cur.right;
        
        cur.right = r;
           
    }

}