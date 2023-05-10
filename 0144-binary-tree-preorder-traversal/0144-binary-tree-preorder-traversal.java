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
        
           /*
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
          
           return ans; */
        // Morris Traversal , Constant space
                   List<Integer> ans = new ArrayList();
        TreeNode cur = root;
        
        while(cur!=null)
        {
            if(cur.left == null)
            {
                ans.add(cur.val);
                cur = cur.right;
            }
            else
            {
                TreeNode prev = cur.left;
                
                while(prev.right!=null && prev.right != cur)
                {
                    prev=prev.right;
                }
                
                if(prev.right==null) // Make a thread
                {
                    prev.right = cur;
                       ans.add(cur.val);
                    cur=cur.left;
                }
                else // Left SubTree is Completely visited 
                {
                    prev.right = null ;
                 
                    cur=cur.right;
                }
      
                
                
            }
       
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