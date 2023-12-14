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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root==null) return 0;
        
        int left = height(root.left);
        int right = height(root.right);
        
        int maxi =left+right;
        
        return Math.max(maxi , Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right) ));
        
    }
    
    private int height(TreeNode root) 
    {
          if(root==null)return 0;
        return 1+(Math.max(height(root.left),height(root.right)));
    }
    
}