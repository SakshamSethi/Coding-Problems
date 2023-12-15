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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        if(root==null)return new ArrayList<>();
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer>list = new ArrayList<>();
            
            for(int i=0 ; i<size ; i++)
            {
                TreeNode node = q.poll();
                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
                
                if(flag) list.add(node.val);
                else list.add(0,node.val);
            }
            flag=!flag;
            ans.add(new ArrayList(list));
        }
        return ans;
    }
}