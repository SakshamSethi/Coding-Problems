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
        
        if(head==null||head.next==null)return head;
        
        ListNode temp=head;
        for(int i=1;i<k;i++)
        {
            temp=temp.next;
        }
        ListNode Last = head;
        int length=1;
        while(Last.next!=null)
        {
            Last=Last.next;
            length++;
        }
        int skip = length-k;
        
        ListNode temp2 =head;
        for(int i=1;i<=skip;i++)
        {
            temp2=temp2.next;
        }
        int swap = temp.val;
        temp.val=temp2.val;
        temp2.val = swap;
        return head;
    }
}