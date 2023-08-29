/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      
      int lengthOfCycle = cycleLength(head);
    
      if(lengthOfCycle==-1) return null;
      
      ListNode first = head;
      ListNode second = head;
      
      for(int i=0; i<lengthOfCycle;i++)
      {
        second=second.next;
      }
      
      while(first!=second)
      {
        first=first.next;
        second=second.next;
      }
      return first; // or you can aslo return second 
    }
  int cycleLength(ListNode head)
  {
    if(head==null || head.next==null) return -1;
    ListNode fast = head;
    ListNode slow = head;
    int size=0;
    do
    {
      fast = fast.next.next;
      slow=slow.next;
    }while(fast!=null && fast.next!=null &&fast!=slow);
    
    if(fast!=slow)return -1;
      
     do
     {
       fast=fast.next;
       size++;
     }while(fast!=slow);
      
    return size;
  }
}