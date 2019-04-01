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
    //考虑四种情况
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root ==null) return null;
        
        if(root.val>key){
            root.left = deleteNode(root.left, key);
        }else if(root.val<key){
            root.right = deleteNode(root.right,key);
        }else{
            if(root.left!=null&&root.right!=null){
               TreeNode t = findMax(root.left);
               root.val = t.val;
               root.left = deleteNode(root.left,t.val);
                
            }else{               
                if(root.left==null)
                    root = root.right;
                else
                    root = root.left;
            } 

        }

        return   root;  
        
    }
    
    public TreeNode findMax(TreeNode root) {
        
        if(root==null) return null;
        if(root.right==null)  return root;
        
        return findMax(root.right);            
    }

}