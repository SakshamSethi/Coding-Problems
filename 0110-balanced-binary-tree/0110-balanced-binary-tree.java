/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        
        if(root == null)return true;
        //brute force solution
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        if( Math.abs(rh-lh)>1) return false;
        
        boolean  left = isBalanced(root.left);
        boolean  right = isBalanced(root.right);
        
        if(!left || !right) return false;
        return true;
    }
    
    int height(TreeNode root)
    {
        if(root==null) return 0;
        
        int l = height(root.left); 
        int r =  height(root.right);
        
        return 1 + Math.max(l,r);
    }
}