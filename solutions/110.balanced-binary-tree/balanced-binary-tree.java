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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        
        return IsBalancedAux(root)!=-1;
    }
    
    private int IsBalancedAux(TreeNode root){
        
        if(root==null) return 0;
        int left = IsBalancedAux(root.left);
        if(left==-1) return -1;
        int right = IsBalancedAux(root.right);
        if(right==-1) return -1;
        
        return Math.abs(left-right)>1 ? -1 : 1 + Math.max(left,right);
    }
}