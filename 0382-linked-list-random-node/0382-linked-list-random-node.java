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

    ListNode head;
    int length;
    public Solution(ListNode head) {
        this.head=head;
      ListNode temp = head;
        length=1;
      while(temp.next!=null)
      {
        temp=temp.next;
        length++;
      }
    }
    
    public int getRandom() {
      
      int randIndex = (int)(Math.random()*length);
      
      ListNode temp = head;
      for(int i = 0 ; i<randIndex;i++)
      {
        temp=temp.next;
      }
      
      return temp.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */