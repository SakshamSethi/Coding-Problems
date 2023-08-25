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
    public int getDecimalValue(ListNode head) {
      
     String str ="";
      
      ListNode node = head;
      while(node!=null)
      {
       str+=node.val;
        node =node.next;
      }
      
      int ans = 0;
      int power = 0;
      
      for(int i = str.length()-1; i>=0;i-- )
      {
        int n = Integer.parseInt(str.substring(i,i+1));
        ans += n*(int)Math.pow(2,power);
        power++;
      }
 
       
      return (int)ans;
      
    }
}