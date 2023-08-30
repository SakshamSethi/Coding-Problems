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
   public ListNode insertionSortList(ListNode head) {
    if (head == null || head.next == null)
    {
        return head;
    }

    ListNode sortedHead = head, sortedTail = head;
    head = head.next;
    sortedHead.next = null;
    
    while (head != null)
    {
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        
        // new val is less than the head, just insert in the front
        if (temp.val <= sortedHead.val)
        {
            temp.next = sortedHead;
    
            sortedHead = temp;
        }
        // new val is greater than the tail, just insert at the back
        else if (temp.val >= sortedTail.val)
        {
            sortedTail.next = temp;
            sortedTail = sortedTail.next;
        }
        // new val is somewhere in the middle, we will have to find its proper
        // location.
        else
        {
            ListNode current = sortedHead;
            while (current.next != null && current.next.val < temp.val)
            {
                current = current.next;
            }
            
            temp.next = current.next;
            current.next = temp;
        }
    }
    
    return sortedHead;
}
}