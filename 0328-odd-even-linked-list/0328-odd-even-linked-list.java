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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode OddHead = head;
        ListNode EvenHead = head.next;
        ListNode EvenStart = head.next;
        ListNode temp = head.next.next;
        int Length =3;
        while(temp!=null)
        {
            if(Length%2==1)
            {
                OddHead.next = temp;
                OddHead = temp;
            }
            else
            {
                EvenHead.next=temp;
                EvenHead = temp;
                
            }
            temp = temp.next;
            Length++;
        }
        OddHead.next = EvenStart;
        EvenHead.next = null;
        
        return head;
        

    }
}