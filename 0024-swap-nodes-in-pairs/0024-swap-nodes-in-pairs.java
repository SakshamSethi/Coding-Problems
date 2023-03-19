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
    public ListNode swapPairs(ListNode head) {
        if(head ==null || head.next==null)return head;
        ListNode curr = head;
        ListNode next = head.next;
     
        do{
            int temp = curr.val ;
            curr.val = next.val;
            next.val = temp;
            
            curr = next.next;
            if(curr==null || curr.next==null) break;
            next=curr.next;
            
        }   while(next!=null);
        return head;
    }
}