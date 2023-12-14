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
    public boolean hasPathSum(TreeNode root, int targetSum) {
    
        if(root==null)return false;
        return checkPath(root , targetSum , 0);
    }
    
    private boolean checkPath(TreeNode root , int target , int sum)
    {
        if(root==null)
        {
            return false;
        }
        if(root.left==null && root.right ==null)
        {
            return sum+root.val == target;
        }
        
        // either we go left or we go right 
        
        sum +=root.val;
        
 
        
       
        return checkPath(root.left,target,sum)
         ||
         checkPath(root.right,target,sum);
          
    }
}