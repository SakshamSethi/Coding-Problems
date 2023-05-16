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
    
    class BSTiterator
    {
        Stack<TreeNode> st = new Stack<>();
        boolean reverse = true;
        // true -> next -> left
        // false -> before -> right
        BSTiterator(TreeNode root , boolean order)
        {
            reverse = order ;
            pushAll(root);
        }
        int next()
        {
            TreeNode node = st.pop();
             
            if(!reverse) pushAll(node.left);
            else pushAll(node.right);
            
            return node.val;
        }
        void pushAll(TreeNode root)
        {
            TreeNode node = root;
            while(node!=null)
            {
                st.push(node);
              
                if(!reverse) node = node.right;
                else node = node.left;
            }
        }
        
        
    }
    
    
    
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
        
        BSTiterator i = new BSTiterator(root,true);
        BSTiterator j = new BSTiterator(root,false);
        
        int l = i.next();
        int r = j.next();
        while(l<r)
        {
            if(l+r==k)return true;
                else if(l+r<k) l = i.next();
            else r = j.next();
        }
        return false;
        
    }
    
    
}