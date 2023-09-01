/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
   
      if(head==null || head.next==null) return head;
    
      ListNode dummy = new ListNode();
      dummy.next=head;
      ListNode node = dummy;
    
      ListNode temp = head;
      int length=1;
     
        
      temp= head;
    
      while(temp!=null)
      { 
        ListNode start = temp;
       
        ListNode count = temp;
        int countNodes = 1;
        while(count.next!=null)
        {
          countNodes++;
          count=count.next;
        }
        
        if(countNodes<k) break;
        
        
        
        ListNode prev = null;
        ListNode curr= temp;
        ListNode next = curr.next;
        
        for(int i=0 ; i<k ; i++)
        {
          next = curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
        }
        
         start.next=curr;
        
        node.next=prev;
        node=start;
        
        temp = curr;
        
      }
        
      return dummy.next;
    }
}