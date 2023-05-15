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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root == null) return root;
        
        
        if(root.val == key)
        {
            
           return  deleteNode(root);    
        
        }
        
        TreeNode temp = root;
        
        while(root!=null)
        {
            if(root.val > key)
            {
                if(root.left!=null && root.left.val == key)
                {      root.left =  deleteNode(root.left);
              break;
                }
                else
                    root=root.left;
            }
            else
            {
                
                if(root.right!=null && root.right.val == key)
                {   root.right = deleteNode(root.right);
               break;
                }
                else
                    root=root.right;
                
                
            }
        }
        return temp;
        
        
    }
    
    TreeNode deleteNode(TreeNode root)
    {
        if(root.left == null)
        {
            return root.right;
        }
        if(root.right == null)
            return root.left;
    
    TreeNode rootKaRight = root.right;
    TreeNode rootLeftRightMostChild = findChild(root.left);
    
    rootLeftRightMostChild.right = root.right;
        return root.left;
}
    TreeNode findChild(TreeNode root)
    {
        
        while(root.right != null)
            root=root.right;
        
    return root;
    }
    
    }
    
