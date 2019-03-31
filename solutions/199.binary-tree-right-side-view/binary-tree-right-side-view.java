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
    class myTree{
        TreeNode node;
        int level;
        myTree(TreeNode n,int l){
            node = n;
            level = l;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
    
        java.util.Queue<myTree> q = new java.util.LinkedList<>();
        q.add(new myTree(root,0));
    
        myTree n = null;   
        while((n=q.poll())!=null){
            if(n.level==res.size())
                res.add(n.node.val);
                        
            if(n.node.right!=null)         q.add(new myTree(n.node.right,n.level+1));
            if(n.node.left!=null)          q.add(new myTree(n.node.left,n.level+1));
   
        }

        return res;           
    }
}
