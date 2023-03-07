/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        //Current Node mai next node ki value copy krdi
        // or fir next node ko he skip kardiya :) 
        node.val = node.next.val;
        node.next=node.next.next;
    }
}