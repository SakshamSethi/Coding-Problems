/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null||(head.next==null && head.child==null))return head;
       Stack<Node> st = new Stack();
        Node temp = head;
        
        while(temp.next!=null||temp.child!=null)
        {
          
          if(temp.child!=null)
          {
            st.push(temp.next);
            
            temp.next = temp.child;
            temp.child.prev = temp;
            temp.child=null;
          }
          
          temp=temp.next;
        }
      
      while(!st.isEmpty())
      {
        Node remaining = st.pop();
        if(remaining==null)continue;
        temp.next = remaining;
        remaining.prev = temp;
        
        while(temp.next!=null)
          temp=temp.next;
        
      }
      return head;
      
      
     
    }
}