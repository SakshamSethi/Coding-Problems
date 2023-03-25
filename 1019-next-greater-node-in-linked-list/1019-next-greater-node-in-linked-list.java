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
        
       /* ListNode temp = head;
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
        return ans; */
        
        // using Stack
        
        ListNode temp = head;
        int n = 0;
        while(temp!=null)
        {
            n++;
            temp=temp.next;
        }
        int[] arr = new int[n];
        temp = head;
        int k=0;
        while(temp!=null)
        {
            arr[k++]=temp.val;
            temp=temp.next;
        }
        Stack<Integer>st = new Stack();
        int[]ans=new int[n];
        for(int i=n-1;i>=0;i--)
        {
           
            
            while(!st.isEmpty() && st.peek()<=arr[i])
            {
                st.pop();
            }
            if(!st.isEmpty()) {ans[i]=st.peek();}
            else {ans[i]=0;}
            
            st.push(arr[i]);
            
        }
        return ans;
    }
}