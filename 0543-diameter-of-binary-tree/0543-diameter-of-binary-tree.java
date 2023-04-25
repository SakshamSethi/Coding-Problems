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
     int maxi = -1;
    public int diameterOfBinaryTree(TreeNode root) {
       
        
      int x =  Height(root);
        
        return maxi;
    }
    int Height(TreeNode root )
    {
        if(root==null) return 0;
        
        int lh = Height(root.left);
        int rh = Height(root.right);
        
        maxi = Math.max(maxi, lh+rh);
        
        return 1+Math.max(lh,rh);
        
    }
}