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
    public ListNode insertionSortList(ListNode head) {
      
      if(head==null || head.next==null)return head;
      
      ListNode dummy = new ListNode();
      
      ListNode curr = head, next=null;
      
      while(curr!=null)
      {
         next = curr.next;
        
        ListNode pre = dummy;
         
        while(pre.next!=null && pre.next.val<curr.val)
        {
          pre=pre.next;
        }

        curr.next=pre.next;
        
        pre.next=curr;
        
        curr = next;
        
      }
      
      return dummy.next;
      
    }
}