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
    public ListNode middleNode(ListNode head) {
        
        ListNode node = head;
        ListNode node2 = head;
        
        while(node2!=null && node2.next!=null)
        {
            node=node.next;
            node2=node2.next.next;
        }
        head = node;
        return head;
    }
}