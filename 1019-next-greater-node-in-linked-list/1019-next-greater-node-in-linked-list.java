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
    public int[] nextLargerNodes(ListNode head) {
        
        ListNode temp = head;
        int length =0;
    while(temp!=null)
    {
        length++;
        temp=temp.next;
    }
        int[] ans = new int[length] ;
        
        temp=head;int i=0;
        while(temp!=null)
        {
            ListNode Next = temp.next;
            while(Next!=null)
            {
                if(Next.val > temp.val)
                {
                    ans[i++]=Next.val;
                    break;
                }
                Next = Next.next;
            }
            if(Next==null)
            {
                ans[i++]=0;
            }
            temp=temp.next;
        }
        return ans;
    }
}