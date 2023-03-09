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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode curr = head;
        ListNode prev = null;
        ListNode last = null;
        int move = right-left;
        if(move==0)return head;
        
        while(left>0){ 
            last = prev;
            prev=curr;
            curr=curr.next;
            left--;
        }
        ListNode next = null;
        ListNode end=prev;
        
        
        while(move>0)
        {
        
            next = curr.next;
            curr.next =prev;
            
            prev=curr;
            curr=next;
            move--;
        }
        if(last==null)
        {
            end.next=curr;
            head = prev;
            return head ;
        }
        end.next = curr;
        last.next=prev;
        return head;
        
    }
}