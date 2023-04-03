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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        
    //Recursive solution    inorder(root,ans);
        
        //iterative solution
        
        if(root==null) return ans;
    Stack<TreeNode>st = new Stack();
        TreeNode node =root;
        while(true)
        {
            if(node!=null)
            {
                st.push(node);
                node=node.left;
            }
            else
            {
                if(st.isEmpty()) break;
                ans.add(st.peek().val);
                    node = st.pop();
                node=node.right;
            }
            
        }
        
        return ans;
        
    }
/* public void inorder(TreeNode node ,List<Integer>ans )
 {
    //Left->Root->Right
     
     if(node==null) return;
     
     inorder(node.left,ans);
     ans.add(node.val);
    inorder(node.right,ans);
     return;
 }*/
 
}