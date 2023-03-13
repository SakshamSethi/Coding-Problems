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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
        
        ListNode mid  = middle(head);
        
        ListNode second = reverse(mid);
        
        ListNode temp = null, first=head;
        
        while(first!=null && second!=null)
        {
            temp = first.next;
            
            first.next = second;
            first = temp;
            
            temp = second.next;
            second.next = first;
            second=temp;
            
        }
        
       if(first!=null) first.next =null;
        
        
        
      
        
    }
    
    public ListNode middle(ListNode head)
    {
        ListNode one = head;
        ListNode two = head;
        while(two!=null && two.next!=null)
        {
            one = one.next;
            two = two.next.next;
            
        }
        return one;
        
    }
    public ListNode reverse(ListNode head)
    {
        if(head==null||head.next==null)return head;
        ListNode prev = null , curr = head,next=head.next;
        
        while(next!=null)
        {
            next = curr.next;
            curr.next =prev;
            prev = curr;
            curr = next;
            
        }
        return prev;
        
    }
}