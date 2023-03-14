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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = head;
        int length=1;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
        }
        temp = head;
        if(n==length){
            
            head = head.next;
            return head;
        }
        
        int skip = length-n;
        for(int i=1;i<skip;i++)
        {
            temp=temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}