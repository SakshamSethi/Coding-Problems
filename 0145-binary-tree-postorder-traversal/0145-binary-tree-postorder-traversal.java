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
        public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        
    //Recursive Solution    postorder(root,ans);

            //Iterative Solution :
    if(root==null)return ans;
            Stack<TreeNode>st1 = new Stack();
            Stack<TreeNode>st2 = new Stack();
            st1.push(root);
            TreeNode node;
            while(!st1.isEmpty())
            {
                node = st1.pop();
                if(node.left!=null) st1.push(node.left);
                if(node.right!=null) st1.push(node.right);
                st2.push(node);
                
            }
            while(!st2.isEmpty())
            {
                ans.add(st2.pop().val);
            }
            return ans;
        
    }
 /* public void postorder(TreeNode node ,List<Integer>ans )
 {
    //Left->Right->Root
     
     if(node==null) return;
     
     inorder(node.left,ans);
    inorder(node.right,ans);
     ans.add(node.val);
     return;
 }*/
}