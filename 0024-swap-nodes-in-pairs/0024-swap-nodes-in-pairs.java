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
    public ListNode swapPairs(ListNode head) {
     
      if(head==null || head.next==null) return head;
      
      ListNode dummyFirst = new ListNode();
      ListNode dummySecond = new ListNode();
      ListNode first = dummyFirst;
      ListNode second = dummySecond;
      
      ListNode temp = head;
      while(temp!=null)
      {
        ListNode node1 = new ListNode(temp.val);
        first.next = node1;
        first=first.next;
        
        temp=temp.next;
        if(temp==null)break;
        
        ListNode node2 = new ListNode(temp.val);
        second.next = node2;
        second=second.next;
        temp=temp.next;
        
      }
      
      first = dummyFirst.next;
      second = dummySecond.next;
      
  
      while(second!=null && first!=null)
      {
        
        ListNode nextRef = second.next;
        second.next=first;
        second=nextRef;
        
        if(second==null || first.next==null) break;
         
        
        nextRef = first.next;
        first.next=second;
        first=nextRef;
       
      }
      
      return dummySecond.next;
    }
}