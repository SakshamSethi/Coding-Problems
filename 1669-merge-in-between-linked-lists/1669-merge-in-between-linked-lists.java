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
        
      if(list1==null || list2==null)return list1;
      
     // ListNode node = list1;
    //  ListNode start = null;
    //  ListNode end = null;
      int len=0;
     /* while(node!=null)
      {
        if(start!=null && end!=null) break;
        
        if(len+1== a)
        {
          start = node;
        }
        if(len+1 == b)
        {
          end  = node.next;
        }
        len++;
        node = node.next;
      }
      end = end.next;
      
      start.next = list2;
      
      ListNode temp = list2;
      while(temp.next!=null) temp = temp.next;
      
      temp.next = end;
      
      return list1;
      */
      // use for loop for better time 
      
      ListNode end = list1;
     ListNode start = null;
    
      for(int i=0 ; i<b && end!=null ; i++)
      {
        if(i+1==a)
        {
          start=end;
        }
        end=end.next;
      }
      end = end.next;
      ListNode temp = list2;
      
      while(temp.next!=null)temp=temp.next;
      
      start.next=list2;
      temp.next=end;
      return list1;
      
    }
}