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
    public int pathSum(TreeNode root, int sum) {
        if(root==null) return 0;
        
        return findPathSum(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);        
    }
    
    public int findPathSum(TreeNode root,int sum){
        if(root ==null) return 0;
        
        if(root.val==sum)  
            return 1+findPathSum(root.left,0)+findPathSum(root.right,0);
        
        return findPathSum(root.left,sum-root.val)+findPathSum(root.right,sum-root.val);
    }
}