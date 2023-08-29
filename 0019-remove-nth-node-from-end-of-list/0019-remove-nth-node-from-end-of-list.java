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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      
      if(head==null)return head;
      if(head.next==null && n==1)
      {
        head=head.next;
        return head;
      }
      
      
      int size = 1;
      // count the length of the list first;
      
      ListNode temp = head;
      
      while(temp.next!=null) 
      {
        temp=temp.next;
        size++;
      }
        
      if(n==size)
      {
        head = head.next ;
        return head;
      }
      
      int toReach = size-n;
      temp = head;
      
      for(int i=1 ; i<toReach ; i++)
      {
        temp=temp.next;
      }
      
      temp.next=temp.next.next;
      return head;
    }
}