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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
     // we can count the last critical point and in the end we can return the array of there difference
      
      if(head==null || head.next==null || head.next.next==null) return new int[]{-1,-1};
      
      int last = 0;
      int miniDis = Integer.MAX_VALUE;
      int first  = 0;
      
      int length = 1;
      ListNode prev = head;
      ListNode curr = head.next;
      
      while(curr!=null && curr.next!=null )
      {
        if((curr.val>prev.val && curr.val>curr.next.val)||(curr.val<prev.val && curr.val<curr.next.val))
        {
          if(last!=0)
          {
            miniDis = Math.min(miniDis , length-last);
          }
          else
          {
            first = length ;
          }
          last = length;
        }
        
        prev=curr;
        curr=curr.next;
        length++;
        
        
        }
      
      if(miniDis==Integer.MAX_VALUE)
        return new int[]{-1,-1};
      
      return
        new int[] {miniDis , last-first};
      
    }
}