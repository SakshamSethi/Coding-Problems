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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
     
        Map<Integer,Integer> inmap = new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            inmap.put(inorder[i],i);
        }
        
        TreeNode root = null;
        root =  constructTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,inmap);
         return root;
        }

    public TreeNode constructTree(int[] pre , int preStart,int preEnd,int[] in ,int inStart,int inEnd,Map<Integer,Integer>imap)
    {
        if(preStart>preEnd || inStart>inEnd) return null;
        
        TreeNode root = new TreeNode(pre[preStart]);
        
        int inRoot = imap.get(root.val);
        int remNum = inRoot-inStart;
        
        root.left = constructTree(pre,preStart+1,preStart+remNum,in,inStart,inRoot-1,imap);
        root.right = constructTree(pre,preStart+remNum+1,preEnd,in,inRoot+1,inEnd,imap);
        
        return root;
    }
    
    
    
    
    
    
    
    
    
}