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
    public ListNode swapNodes(ListNode head, int k) {
      
      if(head==null || head.next==null)return head;
       
      int size = linkedListLength(head);
      
      ListNode fromFront = head;
      
      ListNode temp = head;
      
      for(int i=1 ; i<k;i++)
      {
        temp=temp.next;
      }
      
      fromFront = temp;
      temp = head;
      ListNode fromBack = head;
      
      int backIndex = size-k+1;
      
      for(int i=1 ; i<backIndex;i++)
      {
        temp = temp.next;
      }
      
      fromBack = temp;
      
      int tempVal = fromFront.val;
      fromFront.val = fromBack.val;
      fromBack.val = tempVal;
      
      return head;
      
      
      
    }
  
  int linkedListLength(ListNode head)
  {
    int size = 1;
    ListNode temp = head;
    
    while(temp.next!=null)
    {
      temp=temp.next;
      size++;
      
    }
    return size;
  }
}