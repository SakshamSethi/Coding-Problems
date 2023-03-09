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
    public boolean isPalindrome(ListNode head) {
     if(head.next==null || head==null)return true;
        ListNode one = head;
        ListNode two = head;
        while(two!=null && two.next!=null)
        {
            one = one.next;
            two=two.next.next;
        }
        ListNode h2 = reverse(one);
        
        ListNode first = head;
        ListNode second = h2;
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;
        
        
    }
    public ListNode reverse(ListNode head)
    {
        if(head.next==null)return head;
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=curr.next;
        
        while(next!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}