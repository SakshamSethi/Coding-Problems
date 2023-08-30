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
    public ListNode partition(ListNode head, int x) {
        
      // firstly take all the lesser elements
      
      ListNode dummy = new ListNode();
      ListNode curr = dummy;
      ListNode temp = head;
      
      while(temp!=null)
      {
        if(temp.val<x)
        {
          ListNode node = new ListNode(temp.val);
          curr.next=node;
          curr=node;
          
        }
        temp = temp.next;
      }
      
      temp = head;
      
         while(temp!=null)
      {
        if(temp.val>=x)
        {
          ListNode node = new ListNode(temp.val);
          curr.next=node;
          curr=node;
          
        }
        temp = temp.next;
      }
      return dummy.next;
    }
}