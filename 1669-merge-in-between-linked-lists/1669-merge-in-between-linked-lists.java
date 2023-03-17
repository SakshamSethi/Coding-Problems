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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode temp = list1;
        ListNode ath = null;
        ListNode bth = null;
        int length =0;
        while(temp!=null)
        {
           
            
            if(length == a-1)
            {
                ath = temp;
            }
            if(length == b+1)
            {
                bth = temp;
            }
             length++;
            temp=temp.next;
            
        }
         temp = list2;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        ath.next=list2;
        temp.next=bth;
        
        return list1;
        
        
    }
}