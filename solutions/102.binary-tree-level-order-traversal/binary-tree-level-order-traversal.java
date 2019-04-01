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
        int level;
        TreeNode node;
        myTree(TreeNode t,int l){
            level = l;
            node = t;
        }
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;
    
        java.util.Queue<myTree> q = new java.util.LinkedList<>();
        q.add(new myTree(root,0));
    
        myTree n = null;
    
        while((n=q.poll())!=null){
            if(n.level==res.size()){
                List<Integer> t = new ArrayList<>();
                t.add(n.node.val);
                res.add(t);
            }else{
                List<Integer> t = res.get(n.level);
                t.add(n.node.val);
            }
            
            
            if(n.node.left!=null)       q.add(new myTree(n.node.left,n.level+1));
            if(n.node.right!=null)      q.add(new myTree(n.node.right,n.level+1));
        }
    
        return res;
        
    }
}