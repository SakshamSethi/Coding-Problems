/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
       
        ListNode node = head;
        ListNode node2 = head;
        
        while(node2!=null && node2.next!=null)
        {
          
            
             node=node.next;
            node2=node2.next.next;
      if(node == node2) return true;
        }
    return false;
        
    }
    
}