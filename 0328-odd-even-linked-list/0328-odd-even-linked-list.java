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
    public ListNode oddEvenList(ListNode head) {
      
      if(head==null || head.next==null)return head;
      
      ListNode oddHead = head;
      ListNode evenHead = head.next;
      ListNode evenStart = evenHead;
      ListNode node = head.next.next;      
      int index = 2;
      
      while(node!=null)
      {
        index++;
        
        if(index%2==1)
        {
          oddHead.next = node;
          oddHead=oddHead.next;
        }
        else
        {
          evenHead.next=node;
          evenHead=evenHead.next;
        }
        node=node.next;
      }  
      
      oddHead.next=evenStart;
      evenHead.next=null;
      return head;
      
      
    }
}