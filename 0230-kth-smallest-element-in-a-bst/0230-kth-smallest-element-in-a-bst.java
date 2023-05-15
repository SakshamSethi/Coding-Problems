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
    public int kthSmallest(TreeNode root, int k) {
   /*     // using the property that inorder traversal of BST gives an sorted array O(n)
        List<Integer> arr = new ArrayList<>();
     
        inorder(root,arr);
        return arr.get(k-1);
        
        }
    void inorder(TreeNode root ,List<Integer> arr)
    {
        if(root==null) return ;
        
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return;
        
    }*/
        
        
        //Mooris Traversal
    
    TreeNode cur = root;
    int ans =0;    
        int count = 0;
        while(cur != null)
        {
            
            if(cur.left == null)
            {
                count++;
                if(count == k)
                    ans =cur.val;
                cur = cur.right;
            }
            else
            {
                TreeNode prev = cur.left;
                
                while(prev.right!=null && prev.right!=cur)
                    prev = prev.right;
                
                if(prev.right == null)
                {prev.right = cur;
                    cur = cur.left;
                }else
                {  prev.right = null;
                count++;
                    if(count == k) ans =cur.val;
                cur = cur.right;
            }
            }
        }
    
    return ans;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}