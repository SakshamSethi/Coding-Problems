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
    public ListNode removeZeroSumSublists(ListNode head) {
      
      ListNode dummy = new ListNode();
      dummy.next=head;
      HashMap<Integer,ListNode> map = new HashMap();
      
      map.put(0,dummy);
      int prefix = 0;
      
      ListNode node = head;
      
      while(node!=null)
      {
        prefix+=node.val;
        
        if(map.containsKey(prefix))
        {
          ListNode start= map.get(prefix);
          
          ListNode temp = start.next;
          
          int sum = prefix;
          while(temp!=node)
          {
            sum+=temp.val;
            
            if(temp!=node)
            map.remove(sum);
            
            temp = temp.next;
          }
          
          start.next=node.next;
          
        }
        else
        {
          map.put(prefix,node);
        }
        node = node.next;
      }
      
      return dummy.next;
    }
}