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
  
    ArrayList<Integer> arr ;
    int size ;  
  public Solution(ListNode head) {
        arr = new ArrayList<>();
        
        ListNode node = head;
    while(node!=null)
    {
      arr.add(node.val);
      node=node.next;
    }
    size = arr.size();
      
    }
    
    public int getRandom() {
      
      int randomIndex = (int)(Math.random()*size);
      
      return arr.get(randomIndex);
      
      
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */