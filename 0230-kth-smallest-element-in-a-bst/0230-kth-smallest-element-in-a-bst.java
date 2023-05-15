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
    public int kthSmallest(TreeNode root, int k) {
        // using the property that inorder traversal of BST gives an sorted array O(n)
        List<Integer> arr = new ArrayList<>();
     
        inorder(root,arr);
        return arr.get(k-1);
        
        }
    void inorder(TreeNode root ,List<Integer> arr)
    {
        if(root==null) return ;
        
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return;
        
    }
}