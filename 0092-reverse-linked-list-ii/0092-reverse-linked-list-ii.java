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
    public ListNode reverseBetween(ListNode head, int left, int right) {
      
      if(left==right)return head;
      
      ListNode current = head;
      ListNode prev = null;
      
      for(int i =0 ; i<left-1; i++)
      {
        prev = current;
        current=current.next;
      }
      
      ListNode newEnd = current;
      
      ListNode last = prev;
      ListNode next = current.next;
      // reverse b/w left and right 
      
      for(int i=0 ; i<right-left+1 ; i++)
      {
         next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        
      }
      
      if(last!=null)
      {
        last.next = prev;
      }
      else
      {
        head = prev;
      }
      
      newEnd.next = current;
      return head;
      
    }
}