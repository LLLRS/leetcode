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
    public boolean isValidBST(TreeNode root) {
        if(root ==null) return true;
        
        if(root.left!=null&&findMax(root.left).val >=root.val) return false;
        
        if(root.right!=null&&findMin(root.right).val<=root.val) return false;
        
        return isValidBST(root.left)&&isValidBST(root.right);
    }
    
    public TreeNode findMax(TreeNode root){
        if(root == null)  return null;
        
        if(root.right==null) return root;
        
        return findMax(root.right);        
    }
 
    public TreeNode findMin(TreeNode root){
        if(root == null)  return null;
        
        if(root.left==null) return root;
        
        return findMax(root.left);        
    }    
}