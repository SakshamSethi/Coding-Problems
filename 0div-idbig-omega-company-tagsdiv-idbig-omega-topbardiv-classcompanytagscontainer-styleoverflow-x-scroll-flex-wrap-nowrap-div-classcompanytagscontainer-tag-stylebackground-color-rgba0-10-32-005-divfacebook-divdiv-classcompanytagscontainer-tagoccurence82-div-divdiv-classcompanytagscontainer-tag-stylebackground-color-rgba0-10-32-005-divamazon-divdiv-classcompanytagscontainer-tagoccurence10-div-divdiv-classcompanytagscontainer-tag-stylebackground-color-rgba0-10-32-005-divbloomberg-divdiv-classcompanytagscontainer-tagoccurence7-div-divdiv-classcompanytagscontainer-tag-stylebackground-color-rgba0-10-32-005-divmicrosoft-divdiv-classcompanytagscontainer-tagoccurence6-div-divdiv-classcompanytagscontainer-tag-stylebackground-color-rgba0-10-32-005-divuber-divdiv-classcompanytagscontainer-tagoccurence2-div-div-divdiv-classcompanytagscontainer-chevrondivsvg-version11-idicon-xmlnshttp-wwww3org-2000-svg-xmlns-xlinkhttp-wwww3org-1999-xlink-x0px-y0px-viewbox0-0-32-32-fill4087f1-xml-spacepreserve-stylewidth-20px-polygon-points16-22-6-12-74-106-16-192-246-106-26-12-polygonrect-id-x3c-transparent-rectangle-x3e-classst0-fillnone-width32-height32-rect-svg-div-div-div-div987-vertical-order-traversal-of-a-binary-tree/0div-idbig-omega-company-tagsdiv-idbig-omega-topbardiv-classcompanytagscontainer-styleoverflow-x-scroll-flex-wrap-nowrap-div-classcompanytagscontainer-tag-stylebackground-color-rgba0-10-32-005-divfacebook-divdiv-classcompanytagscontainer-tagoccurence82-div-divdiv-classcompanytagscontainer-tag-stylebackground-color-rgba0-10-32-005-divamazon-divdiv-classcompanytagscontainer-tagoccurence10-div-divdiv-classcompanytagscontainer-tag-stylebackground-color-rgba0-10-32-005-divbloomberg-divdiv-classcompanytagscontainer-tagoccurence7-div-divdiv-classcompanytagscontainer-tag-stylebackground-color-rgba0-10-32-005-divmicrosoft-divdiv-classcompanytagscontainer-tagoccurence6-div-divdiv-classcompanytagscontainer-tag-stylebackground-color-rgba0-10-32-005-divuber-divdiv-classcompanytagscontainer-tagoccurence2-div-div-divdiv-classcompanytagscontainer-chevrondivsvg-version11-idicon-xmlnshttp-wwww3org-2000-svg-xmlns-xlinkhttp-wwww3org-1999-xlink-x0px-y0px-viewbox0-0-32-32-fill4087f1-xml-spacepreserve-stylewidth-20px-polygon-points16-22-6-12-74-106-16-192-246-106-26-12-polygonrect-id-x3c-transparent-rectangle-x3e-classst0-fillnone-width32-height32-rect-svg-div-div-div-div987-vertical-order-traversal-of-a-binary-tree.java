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
    class Node
    {
        TreeNode node ;
        int row , col ;
        Node(TreeNode node , int col , int row)
        {
            this.node=node;
            this.col=col;
            this.row=row;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        HashMap<Integer , TreeMap<Integer, PriorityQueue<Integer>>> map = new HashMap<>();
        
        Queue<Node> q = new LinkedList<>();
        
        q.offer(new Node(root,0,0));
        
        int minCol = 0;
        int maxCol = 0;
        
        while(!q.isEmpty())
        {
            Node node = q.poll();
            TreeNode treeNode = node.node;
            int col = node.col;
            int row = node.row;
            
            if(!map.containsKey(col)) map.put(col, new TreeMap());
            
            if(!map.get(col).containsKey(row)) map.get(col).put(row , new PriorityQueue());
            
            // push this value in the priority queue 
            
            map.get(col).get(row).offer(treeNode.val);
            
            
            if(treeNode.left!=null) q.offer(new Node(treeNode.left , col-1 , row+1));
            if(treeNode.right!=null) q.offer(new Node(treeNode.right , col+1 , row+1));
            
            minCol = Math.min(minCol , col);
            maxCol = Math.max(maxCol , col);
            
        }
        
        List<List<Integer>>ans = new ArrayList<>();
        
        for(int i=minCol ; i<=maxCol ; i++)
        {
            TreeMap<Integer,PriorityQueue<Integer>> miniMap = map.get(i);
            List<Integer> temp = new ArrayList<>();

            for(PriorityQueue<Integer>nodes : miniMap.values())
            {
                while(!nodes.isEmpty())
                {
                    temp.add(nodes.poll());
                }
            }
           
            ans.add(new ArrayList(temp));
            
        }
        
        return ans;
    }
}