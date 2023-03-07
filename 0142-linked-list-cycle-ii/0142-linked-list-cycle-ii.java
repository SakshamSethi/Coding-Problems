/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        int length=0;
        while(fast!=null && fast.next!=null)
        {
        
            slow=slow.next;
            fast = fast.next.next;
            if(slow==fast)
            {
                length = Length(slow);
                break;
            }
        }
        
        if(length==0) return null;
        
        ListNode first = head;
        ListNode second = head;
        
        while(length>0)
        {
            second=second.next;
            length--;
        }
        while(first!=second)
        {
            first=first.next;
            second=second.next;
        }
        return first;
        
    }
    
    public int Length(ListNode h)
    {
        ListNode temp = h;
        int l=0;
        do
        {
            temp = temp.next;
            l++;
        }while(temp!=h);
        return l;
            
    }
}