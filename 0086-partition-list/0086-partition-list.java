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
    public ListNode partition(ListNode head, int x) {
        
       ListNode list = new ListNode(0,null);
        ListNode ans = list;
        ListNode ret = ans;
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                ListNode node = new ListNode(temp.val,null);
                ans.next = node;
                ans = ans.next;
            }
            
            temp = temp.next;
        }
        temp = head;
        while(temp!=null)
        {
            if(temp.val>=x)
            {   ListNode node = new ListNode(temp.val,null);
                ans.next = node;
              ans = ans.next;
            }
              temp=temp.next;
        }
        
        return ret.next;
    }
}