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
       public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();
        if(root==null)return ans;
    //Recursive solution ->    inorder(root,ans);
      
           //Iterative solution :
           
      Stack<TreeNode>st = new Stack<>();
          
          st.push(root);
           
           while(!st.isEmpty())
           {
               ans.add(st.peek().val);
               TreeNode temp = st.pop();
               if(temp.right!=null) st.push(temp.right);
               if(temp.left!=null) st.push(temp.left);
               
           }
          
           return ans;
        
    }
/* public void inorder(TreeNode node ,List<Integer>ans )
 {
    //Root->Left->Right
     
     if(node==null) return;
     
     ans.add(node.val);
     inorder(node.left,ans);
    inorder(node.right,ans);
     return;
 }*/
}