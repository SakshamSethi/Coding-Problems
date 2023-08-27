class Node
{
  int val ;
  Node next;
  
  Node()
  {
  }
  Node(int val)
  {
    this.val = val;
  }
  Node(int val , Node next)
  {
    this.val = val;
    this.next = next;
  }
  
}

class MyLinkedList {

  Node head ;
  Node tail;
  int size;  
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int get(int index) {
        if(index>size-1||index<0) return -1;
      
      if(index==0)return head.val;
      if(index==size-1) return tail.val;
      
      Node temp = head;
      
      for(int i=1 ; i<=index ; i++)
      {
        temp=temp.next;
      }
      return temp.val;
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);
        
     
      
        node.next=head;
        head=node;
      
      
      if(tail==null) tail = head;
      size++;
      
    }
    
    public void addAtTail(int val) {
      
      if(tail==null) 
      {
        addAtHead(val);
        return;
      }
      
      Node node = new Node(val);
      
      tail.next = node;
      tail = node;
      size++;
      return;
      
      
      
    }
    
    public void addAtIndex(int index, int val) {
        
      if(index<0||index>size)return;
      
      if(index==0) 
      {
        addAtHead(val);
        return;
      }
      if(index==size)
      {
        addAtTail(val);
        return;
      }
      
      Node temp = head;
      for(int i=1 ; i<index;i++)
      {
        temp = temp.next;
      } 
       
      Node node = new Node(val,temp.next);
      
      temp.next = node;
      size++;
      return;
      
    }
    
    public void deleteAtIndex(int index) {
      
      if(index>=size|| index<0) return ;
      
      if(index==0)
      {
        deleteHead();
        return;
      }
      
      if(index==size-1)
      {
        deleteTail();
        return;
      }
      
      
      Node temp = head;
      for(int i=1 ; i<index;i++)
      {
        temp = temp.next;
      }
       temp.next = temp.next.next;
      
  
      size--;
      return;
      
        
    }
  
  public void deleteHead()
  {
    head = head.next;
  
    if(head==null)tail=null;
    size--;
    return;
  }
  public void deleteTail()
  {
    Node temp = head;
    
    for(int i=1; i<size-1 ; i++)
    {
      temp = temp.next;
    }
    temp.next=null;
    tail=temp;
    size--;
    return;
  }
  
  
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */