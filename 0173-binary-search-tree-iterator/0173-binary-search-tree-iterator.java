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
    

   /* Queue<TreeNode> inorder = new LinkedList<>();
   My simple Solution
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
    */
    // O(H) space solution using a stack 

    Stack<TreeNode> st = new Stack();
    
  public BSTIterator(TreeNode root) {
    
   inorderTravel(root);
            
    }
    
    public int next() {
    
     TreeNode node = st.pop() ;
     
        
            inorderTravel(node.right);
        
        return node.val;
    
    }
    
    public boolean hasNext() {
        return !st.isEmpty();
    }
    
    void inorderTravel(TreeNode root)
    {
    while(root!=null)
    {
        st.push(root);
        root=root.left;
    }

        
    }
    
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */