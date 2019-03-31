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
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
               
        return aux(root,k).val;
    }
    
    public TreeNode aux(TreeNode root,int k){
        if(root == null) return null;
        
        TreeNode l = aux(root.left,k);
        
        if(l!=null) return l;
        if(++count ==k) return root;
        
        return aux(root.right,k);
    }
}