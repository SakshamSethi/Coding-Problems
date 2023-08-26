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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      
        ListNode head = null;
        ListNode travel = null;
      while(list1!=null && list2!=null)
      {
        if(head==null)
        {
            if(list1.val<=list2.val)
            {
              head = list1;
              list1=list1.next;
            }
          else
          {
            head = list2;
            list2=list2.next;
          }
          travel = head;
          continue;
        }
        
        if(list1.val<=list2.val)
        {
          travel.next = list1;
          travel = travel.next;
          list1=list1.next;
        }
        else
        {
            travel.next = list2;
          travel = travel.next;
          list2=list2.next;
        }
        
      }
      
      while(list1!=null)
      {
        if(head==null)
        {
              head = list1;
              list1=list1.next;
travel=head;
          continue;
        }
        travel.next = list1;
        travel=travel.next;
        list1=list1.next;
      }
          while(list2!=null)
      {if(head==null)
        {
              head = list2;
              list2=list2.next;
              travel = head;
          continue;
        }
        travel.next = list2;
        travel=travel.next;
        list2=list2.next;
      }
      return head ;
    }
}