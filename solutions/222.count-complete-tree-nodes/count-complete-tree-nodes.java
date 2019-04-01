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
    public int countNodes(TreeNode root) {
        
        //时间复杂度 O(k*log k)
        if(root==null) return 0;
         
        TreeNode  cur = root.left;
        int ld= 0;
        while(cur!=null){
            ld++;
            cur = cur.left;
        }
        cur = root.right;
        int rd = 0;
        while(cur!=null){
            rd++;
            cur = cur.left;
        }
        
        if(rd == ld) 
            return (1<<ld) + countNodes(root.right);
        else           
            return (1<<rd) + countNodes(root.left);
        
    }
}