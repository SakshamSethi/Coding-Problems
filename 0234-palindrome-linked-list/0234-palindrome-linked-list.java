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
    public boolean isPalindrome(ListNode head) {
      
      ListNode  mid = getMiddle(head);
      ListNode start = head;
      ListNode end =  reverseList(mid);
      System.out.println(mid.val);
      while(start!=null && end!=null)
      {
        if(start.val!=end.val)return false;
        start=start.next;
        end=end.next;
      }
      
      if( end!=null)return false;
      
      return true;
      
      
    }
  ListNode reverseList(ListNode head)
  {
    if(head==null || head.next==null)return head;
    ListNode prev = null;
    ListNode next = head.next;
    ListNode curr = head;
    
    while(next!=null)
    {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr=next;
      
    }
    return prev;
    
  }
  
  
  ListNode getMiddle(ListNode head)
  {
    ListNode fast = head;
    ListNode slow = head;
    
    while(fast!=null && fast.next!=null)
    {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }
}