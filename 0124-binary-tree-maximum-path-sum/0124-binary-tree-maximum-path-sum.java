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
    
    public int maxPathSum(TreeNode root) {
    
        int[] arr = new int[1];
        arr[0]= Integer.MIN_VALUE;
        
        height(root , arr);
        
        return arr[0];
    }
    int height(TreeNode root , int[] arr)
        
    {
        if(root == null) return 0;
        
        int ls = Math.max (0,height(root.left , arr) );
        int rs = Math.max(0, height(root.right , arr) );
            
        arr[0] = Math.max(arr[0], ls+rs+root.val);
        
        return root.val + Math.max(ls,rs);
    }
}