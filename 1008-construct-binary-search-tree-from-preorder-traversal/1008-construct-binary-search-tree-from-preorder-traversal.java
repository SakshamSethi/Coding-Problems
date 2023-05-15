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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root = new TreeNode(preorder[0] );
        
        for(int i=1;i<preorder.length;i++)
        {
            TreeNode node = new TreeNode(preorder[i]);
            
            TreeNode cur = root;
            while(cur!=null)
            {
                if(node.val < cur.val)
                {
                if(cur.left!=null) cur = cur.left;
                else {cur.left = node;
                   break;  
                }
                }
                else
                {
                    if(cur.right!=null) cur=cur.right;
                    else
                    {
                        cur.right = node;
                        break;
                    }
                }
            }
            
        }
        return root;
    }
}