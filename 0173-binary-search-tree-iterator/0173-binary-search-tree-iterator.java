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
class BSTIterator {
    
Queue<TreeNode> inorder = new LinkedList<>();
    public BSTIterator(TreeNode root) {
            inorderTravel(root);
            
    }
    
    public int next() {
        TreeNode node = inorder.poll() ;
        return node.val;
    }
    
    public boolean hasNext() {
        return !inorder.isEmpty();
    }
    
    void inorderTravel(TreeNode root)
    {
        if(root==null) return;
        
        inorderTravel(root.left);
        inorder.offer(root);
        inorderTravel(root.right);
        return;
        
    }
    
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */