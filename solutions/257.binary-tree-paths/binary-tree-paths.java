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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root==null) return res;    
        
        if(root.left==null&&root.right==null){
            res.add(String.valueOf(root.val));
            return res;
        }
        
        List<String> l = binaryTreePaths(root.left);
        for(int i=0;i<l.size();i++)
            res.add(String.valueOf(root.val)+"->"+l.get(i));
        
        List<String> r = binaryTreePaths(root.right);
        for(int i=0;i<r.size();i++)
            res.add(String.valueOf(root.val)+"->"+r.get(i));   
        
        return res;

    }
}