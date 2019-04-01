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
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
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
        sortList(res);
        return res;    
    }
    
    public void sortList(List<List<Integer>> res){
        for(int i =0;i<res.size();i++){
            if(i%2==0) continue;
            List<Integer> t = res.get(i);
            int sz = t.size();
            for(int j=0;j<sz/2;j++){
                int m = t.get(j);
                t.set(j,t.get(sz-1-j));
                t.set(sz-j-1,m);
            }
        }

    }
}