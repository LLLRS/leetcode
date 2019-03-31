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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        int len = nums.length;
        if(len==0) return null;
        
        return sortedArrayToBST(nums,0,len-1);
    }
    
    private TreeNode sortedArrayToBST(int[] nums,int l,int r){
        if(l>r) return null;
        
        int m = l + (r-l)/2;
        TreeNode root = new TreeNode(nums[m]);
        root.left = sortedArrayToBST(nums,l,m-1);
        root.right = sortedArrayToBST(nums,m+1,r);
        
        return root;
        
    }
}