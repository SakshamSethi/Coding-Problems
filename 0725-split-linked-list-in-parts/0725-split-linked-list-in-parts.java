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
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        int n=0;
        ListNode curr = head;
        while(curr!=null)
        {
            n++;
            curr=curr.next;
        }
        System.out.println(n);
        int nums = n/k;
        int rem = n%k;
        
        ListNode[] ans = new ListNode[k];
        curr=head; int x=0;ListNode prev =null;  
        while(curr!=null && x<k)
        {
            ans[x++]=curr;
                      
            for(int j=0;j<nums &&curr!=null;j++)
            {
                prev =curr;
                curr=curr.next;
            }
           
            
            if(rem>0)
            {
                prev=curr;
                curr=curr.next;
                --rem;
            }

            
            prev.next=null;
            
        }
      
        return ans;
    }
}