/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
      
      if(head==null ) return null;
        
 

         // optimized solution :
      
      
      // 3 iterations 
      
      //--> first restructure the LL 
      // --> assign random pointers
      // --> separate both lists 
      
      Node temp = head;
      
      while(temp!=null)
      {
        Node node = new Node(temp.val);
        
        node.next = temp.next;
        temp.next=node;
        temp = temp.next.next;
      }
      
      temp = head;
      while(temp!=null && temp.next!=null)
      {
       temp.next.random =  (temp.random!=null)? temp.random.next : null ;
        
        temp = temp.next.next;
        
      }
      
      Node orignal = head;
      Node copy = head.next;
      Node copyHead = copy;
      
      while(orignal!=null )
      {
        orignal.next = orignal.next.next;
         
            
         
            if(copy.next== null){
                break;
            } 
        copy.next=copy.next.next;
        
        orignal = orignal.next;
        copy=copy.next;
        
      }
      
      return copyHead;
      
      
      
    /*// With Space   
      
      Node temp = head;
      int size = listLength(head);
      
      int[]arr = new int[size];
      
      int i=0;
      while(temp!=null)
      {
       Node random = temp.random;
        if(random==null) 
        {
          arr[i++] = -1;
          temp=temp.next;
          continue;
        }
        
        Node tempHead = head;
        int index = 0;
        while(tempHead!=random)
        {
          tempHead=tempHead.next;
          index++;
        }
        arr[i++] = index;
        temp=temp.next;
      }
      
      // start making the copy
      
     
      Node dummy = new Node(-1);
      Node curr = dummy;
      temp = head;
      
      while(temp!=null)
      {
      
        Node node = new Node(temp.val);
        curr.next = node;
        curr=node;
       
        temp=temp.next;
          
      }
      
      curr = dummy.next;
 
    
  for( i=0; i<size ; i++)
  {
    if(arr[i]==-1)
    {
      curr.random = null;
      curr=curr.next;
      continue ;
    }
    
    int index = arr[i];
    Node tempHead = dummy.next;
    
    for(int j = 0 ; j<index ; j++)
    {
      tempHead=tempHead.next;
    }
    
    curr.random = tempHead;
    curr=curr.next;
    
  }
    
    return dummy.next;
    */
    
    
    
    }
  
 /* private int listLength(Node head)
  {
    int size = 1;
    Node temp = head;
    while(temp.next!=null)
    {
      temp = temp.next;
      size++;
    }
    return size;
  
  }*/
  
}