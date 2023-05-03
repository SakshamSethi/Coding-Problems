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
class Pair
{
    int num ;
    TreeNode node ;
    public Pair(TreeNode node , int num)
    {
        this.node = node ;
        this.num = num;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        
        if(root==null)return 0;
        int ans=0;
        
        Queue<Pair> q = new LinkedList();
        
        q.offer(new Pair(root,0));
        
        while(!q.isEmpty())
        {
            int size = q.size();
            int curmin = q.peek().num;
            int left =0 , right=0;
            
            for(int i=0;i<size;i++)
            {
                int cur= q.peek().num;
                cur = cur-curmin;
                TreeNode node = q.peek().node;
                q.poll();
                
                if(i==0) left = cur;
                if(i==size-1) right=cur;
                
                if(node.left!=null) q.offer(new Pair(node.left,(2*cur)+1));
                if(node.right!=null) q.offer(new Pair(node.right,(2*cur)+2));
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
        
    }
}