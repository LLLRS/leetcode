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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null)
            return 0;
        
        int leftTree =  diameterOfBinaryTree(root.left);
        int rightTree =  diameterOfBinaryTree(root.right);
        
        int lt = aux(root.left);
        int rt = aux(root.right);

        return Math.max(lt+rt,Math.max(leftTree,rightTree));
                
    }
    
    public int aux(TreeNode root) {
        
        if(root==null)
            return 0;
        
        int l = aux(root.left);
        int r = aux(root.right);

        if(l>r)
            return l+1;
        else 
            return r+1;
                
    }
}