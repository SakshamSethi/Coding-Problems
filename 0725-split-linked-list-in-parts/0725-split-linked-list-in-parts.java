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
    public ListNode[] splitListToParts(ListNode head, int k) {
      
      ListNode[] ans = new ListNode[k];
      
      int index = 0;
         int n=0;
        ListNode curr = head;
        while(curr!=null)
        {
            n++;
            curr=curr.next;
        }
      
        int nums = n/k;
        int rem = n%k;
      if(n<k)rem=0;
      ListNode node = head;
       
      
      while(node!=null && index<k)
      {
        ListNode tempHead = node;
        ListNode tempTail =node;
        for(int i=0 ; i<nums-1 && tempTail.next!=null ; i++)
        {
          tempTail=tempTail.next;
          
        }
        
       
        
        if(rem>0)
        {
          tempTail=tempTail.next;
          rem--;
        }
        
         ans[index++] = tempHead;
        ListNode tailNext = tempTail.next;
        tempTail.next=null;
        
        node = tailNext;
        
      }

      return ans;
    }
}