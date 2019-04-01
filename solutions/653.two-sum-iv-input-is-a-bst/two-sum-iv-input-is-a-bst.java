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
    

    public boolean findTarget(TreeNode root, int k) {
        
        if(root == null)
            return false;    
        HashSet<Integer> ts = new HashSet();
        Queue <TreeNode> q = new LinkedList();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(ts.contains(k-t.val))
                return true;
            
            ts.add(t.val);
            if(t.left != null) 
                q.add(t.left);
            
            if(t.right != null) 
                q.add(t.right);
        }
        
        
        return false;
        
    }

}
