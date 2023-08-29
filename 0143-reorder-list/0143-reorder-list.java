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
    public void reorderList(ListNode head) {
    
      if(head==null || head.next==null)return ;
      
      ListNode cur = midPoint(head);
      
     
      
     
      
      ListNode prev = null;
      ListNode next = cur.next;
      
      // reverse
      
      while(next!=null)
      {
        next=cur.next;
        cur.next  = prev;
        prev = cur;
        cur=next;
      }
      
      
      ListNode first = head;
      ListNode second = prev;
      
      ListNode temp =null;
      
      while(first!=null && second!=null)
      {
        temp = first.next;
        
        first.next = second;
        first = temp;
        
        if(second.next==null)break;
        
        temp = second.next;
        second.next=first;
        second=temp;
        
      }
      
      return;
    }
  
  ListNode midPoint(ListNode head)
  {
    
    ListNode prev = null;
    ListNode slow = head;
    ListNode fast = head;
    
    while(fast!=null && fast.next!=null)
    {
      prev = slow;
      slow=slow.next;
      fast = fast.next.next;
      
    }
    
  return slow;
  }
  
}