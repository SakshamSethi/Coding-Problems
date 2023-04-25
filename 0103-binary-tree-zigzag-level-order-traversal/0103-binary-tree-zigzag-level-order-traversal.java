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
        
        List<List<Integer>> ans = new ArrayList<>() ;
        if(root==null) return ans;
        Queue<TreeNode> nodes = new LinkedList(); ;
        nodes.add(root);
        boolean flag = true;
        while(!nodes.isEmpty())
        {
            int size = nodes.size();
            List<Integer> arr = new ArrayList();
            
            
            for(int i=0;i<size;i++)
            {

                
                if(nodes.peek().left!=null) nodes.add(nodes.peek().left);
                if(nodes.peek().right!=null) nodes.add(nodes.peek().right);
                
                if(flag==true)
                arr.add(nodes.poll().val);
                else
                arr.add(0,nodes.poll().val);
            }
           flag = !flag;
            ans.add(arr);
            
        }
        return ans;
    }
}