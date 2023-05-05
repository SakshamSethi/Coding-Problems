/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public void mark_parents(TreeNode root , Map<TreeNode,TreeNode>pc)
    {
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        
        while(!q.isEmpty())
        {
            TreeNode node = q.poll();
            
            if(node.left!=null)
            {
                pc.put(node.left,node);
                q.add(node.left);
            }
            if(node.right!=null)
            {
                pc.put(node.right,node);
                q.add(node.right);
            }
        }
        
    }
    
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        Map<TreeNode , TreeNode>parent_check = new HashMap();
        mark_parents(root,parent_check);
        
    //Map for Visited 
        Map<TreeNode,Boolean>visited=new HashMap();
        
        Queue<TreeNode>q = new LinkedList();
        int dis = 0;
        visited.put(target,true);
        q.offer(target);
        //Start BFS from Target
        while(!q.isEmpty())
        {
            int size=q.size();
            
            if(dis == k) break;
            dis++;
            
            for(int i=0;i<size;i++)
            {
            TreeNode  current = q.poll();
            if(current.left!=null && visited.get(current.left)==null)
            {
                q.offer(current.left);
                visited.put(current.left,true);
            }
            
            if(current.right!=null && visited.get(current.right)==null)
            {
                q.offer(current.right);
                visited.put(current.right,true);
            }
           if(parent_check.get(current)!=null && visited.get(parent_check.get(current))==null)
            {
                q.offer(parent_check.get(current));
                visited.put(parent_check.get(current),true);
            }
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        while(!q.isEmpty())
        {
            ans.add(q.poll().val);
        }
        return ans;
        
    }
}