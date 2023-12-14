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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        
        paths(root,"",res);
        
        return res;
    }
    
    private void paths(TreeNode root , String s ,List<String> res )
    {
        if(root==null)
        {
            return ;
        }
        s+=root.val;
        if(root.left==null && root.right==null)
        {
            res.add( new String(s) );
            return;
        }
        s+="->";
        paths(root.left,s,res);
        paths(root.right,s,res);
    }
    
    
}