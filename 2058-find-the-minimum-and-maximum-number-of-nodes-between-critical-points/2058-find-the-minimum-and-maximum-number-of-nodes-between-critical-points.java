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
     ;
  
        if(head==null||head.next==null||head.next.next==null)
            return new int[]{-1,-1};
        
        
        
        int minD=Integer.MAX_VALUE;
        int last=0;
        int first=Integer.MAX_VALUE;
        
        int length=1;
        
ListNode temp =head;        
ListNode curr = head.next;

        while(curr!=null && curr.next!=null )
        {
         if((curr.val>temp.val && curr.val>curr.next.val)||(curr.val<temp.val && curr.val<curr.next.val))
         {
             if(last!=0)
             {
                 minD=Math.min(minD,length-last);
             }
              first = Math.min(first,length);
            
                last = length;
             
             
         }
            temp=curr;
            curr=curr.next;
            length++;
        }
        
        if(minD==Integer.MAX_VALUE)
            return new int[]{-1,-1};
        return new int[]{minD,(last-first)};
        
    }
}