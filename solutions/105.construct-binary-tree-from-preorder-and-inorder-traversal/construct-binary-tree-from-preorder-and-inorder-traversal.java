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
    public TreeNode buildTree(int[] pre, int[] in) {
        
        return buildTreeAux(pre,in,0,in.length-1);        
    }
    
    public TreeNode buildTreeAux(int[] pre,int[] in,int st,int end){
        
        if(st>end) return null;
        int val = pre[p];
        p++;        
        TreeNode root = new TreeNode(val);
        if(st==end)
            return root;
        
        int index = findIndex(in,val,st,end);        
        root.left = buildTreeAux(pre,in,st,index-1);
        root.right = buildTreeAux(pre,in,index+1,end);
        
        return root;
        
        
    }
    
    private int findIndex(int[] m,int val,int st,int end){
        
        for(int i=st;i<=end;i++)
            if(m[i]==val)
                return i;
        
        return 0;
        
    }
       
}