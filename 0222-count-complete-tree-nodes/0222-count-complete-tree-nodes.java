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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        
        int lh = leftHeight(root);
        int rh = rightHeight(root);
        
        if(lh == rh) return (2<<lh)-1;
        else
            return (1 + countNodes(root.left) + countNodes(root.right));
    }
    
    public int leftHeight(TreeNode node)
    {
        int count = 0;
        while(node!=null)
        {
              
                node=node.left;
                count++ ;
        }
        return count-1;
    }
        public int rightHeight(TreeNode node)
    {
        int count = 0;
        while(node!=null)
        {
                count++ ;
                node=node.right;
        }
        return count-1;
    }
}