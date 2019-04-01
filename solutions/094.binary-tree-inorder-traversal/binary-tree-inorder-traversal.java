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
    class Command{

        boolean flag;  // flag==false print  true go;
        TreeNode node;
        Command(TreeNode t,boolean f){
            flag = f;
            node = t;
        }

    }
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root==null) return arr;
        java.util.Stack<Command> st = new java.util.Stack<>();
        st.push(new Command(root,true));
        
        while(!st.empty()){
            Command c = st.pop();
            if(c.flag){                
                if(c.node.right!=null) st.push(new Command(c.node.right,true));
                st.push(new Command(c.node,false));
                if(c.node.left!=null) st.push(new Command(c.node.left,true));
            }else{
                arr.add(c.node.val);
            }
        }
        
        return arr;
    }
}