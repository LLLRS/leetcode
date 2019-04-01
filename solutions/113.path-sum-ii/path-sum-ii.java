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
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        
        if(root==null) return res;
        
        getPath(root,sum,new ArrayList<Integer>());
        
        return res;

    }
    
       private void getPath(TreeNode root, int sum,List<Integer> st){
        
        if(root!=null&&sum==root.val&&root.left==null&&root.right==null){
            st.add(root.val);
            res.add(new ArrayList<Integer>(st));
            return;
        }
            
        
        if(root==null) return;
        
        st.add(root.val);
        
        getPath(root.left, sum - root.val,new ArrayList<Integer>(st));
        getPath(root.right,sum - root.val,new ArrayList<Integer>(st));
        
    } 
}