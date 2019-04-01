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
    int p = 0;
    public TreeNode buildTree(int[] in, int[] post) {
        p = in.length-1;
        
        return  buildTreeAux(in, post,0,in.length-1);
        
    }
    private TreeNode buildTreeAux(int[] in, int[] post,int st,int end){
        
        if(st>end) return null;
        
        int val = post[p];
        p--;

        
        TreeNode root = new TreeNode(val);
        if(st==end)
            return root;
        int index = findIndex(in,val,st,end);
        
        root.right = buildTreeAux(in,post,index+1,end);
        root.left = buildTreeAux(in,post,st,index-1);
        
        
        return root;
    }
    
    private int findIndex(int[] in,int val,int st,int end){
        for(int i=st;i<=end;i++){
            if(val==in[i])
                return i;
        }
        return 0;
    }
}