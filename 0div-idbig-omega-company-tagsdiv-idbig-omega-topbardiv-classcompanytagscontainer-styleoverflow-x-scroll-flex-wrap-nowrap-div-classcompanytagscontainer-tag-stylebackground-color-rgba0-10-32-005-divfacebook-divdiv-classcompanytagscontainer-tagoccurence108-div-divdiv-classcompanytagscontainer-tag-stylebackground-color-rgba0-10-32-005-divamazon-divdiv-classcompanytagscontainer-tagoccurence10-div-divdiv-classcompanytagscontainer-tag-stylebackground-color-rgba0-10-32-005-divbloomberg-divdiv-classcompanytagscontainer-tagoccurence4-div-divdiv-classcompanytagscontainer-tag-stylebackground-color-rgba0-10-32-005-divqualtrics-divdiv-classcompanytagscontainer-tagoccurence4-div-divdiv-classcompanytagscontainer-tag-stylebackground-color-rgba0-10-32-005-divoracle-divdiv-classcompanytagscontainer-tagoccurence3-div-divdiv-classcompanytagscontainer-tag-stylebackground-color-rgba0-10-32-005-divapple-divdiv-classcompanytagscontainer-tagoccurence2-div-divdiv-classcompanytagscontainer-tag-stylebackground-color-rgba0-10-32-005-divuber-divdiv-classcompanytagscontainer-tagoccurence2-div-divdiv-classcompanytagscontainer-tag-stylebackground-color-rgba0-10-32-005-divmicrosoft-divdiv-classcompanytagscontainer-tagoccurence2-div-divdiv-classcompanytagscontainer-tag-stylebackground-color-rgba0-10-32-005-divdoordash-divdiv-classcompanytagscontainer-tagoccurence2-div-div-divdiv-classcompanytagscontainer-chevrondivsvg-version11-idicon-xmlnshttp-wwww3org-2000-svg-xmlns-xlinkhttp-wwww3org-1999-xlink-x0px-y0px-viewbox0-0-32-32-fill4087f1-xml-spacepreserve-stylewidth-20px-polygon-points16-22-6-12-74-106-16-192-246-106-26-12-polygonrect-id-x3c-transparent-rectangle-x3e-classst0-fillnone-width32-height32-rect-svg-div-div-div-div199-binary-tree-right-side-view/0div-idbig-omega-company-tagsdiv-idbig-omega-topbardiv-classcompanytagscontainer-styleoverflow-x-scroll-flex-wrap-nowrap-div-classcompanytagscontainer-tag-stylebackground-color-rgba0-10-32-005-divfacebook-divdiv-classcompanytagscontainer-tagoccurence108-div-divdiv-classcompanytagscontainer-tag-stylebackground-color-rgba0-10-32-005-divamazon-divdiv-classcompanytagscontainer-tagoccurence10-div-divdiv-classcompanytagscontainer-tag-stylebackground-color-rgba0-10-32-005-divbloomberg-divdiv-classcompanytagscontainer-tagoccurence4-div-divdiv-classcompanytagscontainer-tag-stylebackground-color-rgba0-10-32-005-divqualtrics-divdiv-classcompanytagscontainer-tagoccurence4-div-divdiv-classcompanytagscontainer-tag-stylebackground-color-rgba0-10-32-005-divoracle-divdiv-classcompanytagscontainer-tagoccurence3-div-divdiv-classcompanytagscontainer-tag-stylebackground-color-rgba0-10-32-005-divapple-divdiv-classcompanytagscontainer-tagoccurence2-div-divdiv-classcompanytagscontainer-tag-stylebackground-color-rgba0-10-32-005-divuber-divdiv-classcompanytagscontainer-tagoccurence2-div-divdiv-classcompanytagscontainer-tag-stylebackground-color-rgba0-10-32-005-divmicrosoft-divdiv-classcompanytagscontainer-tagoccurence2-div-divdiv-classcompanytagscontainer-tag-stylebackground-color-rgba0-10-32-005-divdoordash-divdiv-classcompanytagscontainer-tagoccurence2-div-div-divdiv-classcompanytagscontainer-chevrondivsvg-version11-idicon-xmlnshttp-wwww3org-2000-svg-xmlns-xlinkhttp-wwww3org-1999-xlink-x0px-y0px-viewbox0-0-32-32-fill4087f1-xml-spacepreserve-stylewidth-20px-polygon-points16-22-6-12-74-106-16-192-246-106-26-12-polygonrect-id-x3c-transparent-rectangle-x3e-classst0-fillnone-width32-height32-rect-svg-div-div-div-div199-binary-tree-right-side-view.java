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
    public List<Integer> rightSideView(TreeNode root) {
        
        if(root==null) return new ArrayList();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        List<Integer> ans = new ArrayList<>();
        
        while(!q.isEmpty())
        {
            
 
         int size = q.size();  
        
            for(int i=0 ; i<size ;i++)
            {
                TreeNode node = q.poll();
                if(i==0) ans.add(node.val);
                
                  
            
            if(node.right!=null) q.offer(node.right);
    
                if(node.left!=null) q.offer(node.left);
            
            }
            
                       
            
        }
        return ans;
    }
}