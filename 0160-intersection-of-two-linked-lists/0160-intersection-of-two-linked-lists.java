/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      
      // count the lengths of both the lists
      
      int lenA = countLength(headA);
      int lenB = countLength(headB);
      
      int n = 0;
      boolean isABigger = false;
      ListNode temp=null;
      if(lenA<lenB)
      {
        n = lenB-lenA;
        temp = headB;
        while(n>0)
        {
          temp=temp.next;
          n--;
        }
        
      }
      else
      {
        isABigger=true;
        n = lenA-lenB;
        temp = headA;
        while(n>0)
        {
          temp=temp.next;
          n--;
        }
      }
      

      ListNode nodeA = isABigger==true?temp:headA;
      ListNode nodeB = isABigger==true?headB:temp;
      
      while(nodeA!= nodeB)
      {
        nodeA=nodeA.next;
        nodeB=nodeB.next;
      }
      
      
      
      return nodeA;
      
        
    }
  
  int countLength(ListNode head)
  {
    ListNode temp = head;
    int count=1;
    while(temp!=null)
    {
      temp=temp.next;
      count++;
    }
      return count;
  }
}