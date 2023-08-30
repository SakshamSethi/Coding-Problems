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

  //reservoir sampling
  ListNode head ;
  Random rand;
  
    public Solution(ListNode head) {
      
      this.head = head;
      rand = new Random();
      
    }
    
    public int getRandom() {
      
      ListNode curr = head;
      
      int ans = curr.val;
      int i=1;
      while(curr.next!=null)
      {
        curr=curr.next;
        
        if(rand.nextInt(i+1)==i) ans = curr.val; 
        
        i++;
     
      }
      return ans;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */