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
    public ListNode deleteDuplicates(ListNode head) {
      
      ListNode pre = null;
      ListNode curr = head;
      
      while(curr!=null && curr.next!=null)
      {
         
        if(curr.val!=curr.next.val)
        {
          pre = curr;
          curr=curr.next;
        }
        else
        {
          while(curr.next!=null && curr.val == curr.next.val)
          {
            curr=curr.next;
          }
          
          if(pre==null)
          {
            // its the first node
            head=curr.next;
          }
          else
          {
            pre.next=curr.next;
          }
          
          curr=curr.next;
        }
       
      }
      return head;
      }
      
    }
