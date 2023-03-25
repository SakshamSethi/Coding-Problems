class FrontMiddleBackQueue {
    
    class ListNode{
        int val;
        ListNode next;
        ListNode prev;
        ListNode(int val){
            this.val = val;
        }
    }
    
    int count;
    ListNode start;
    ListNode middle;
    ListNode last;
    
    public FrontMiddleBackQueue() {
        count = 0;
        //place holders for start, middle, last
        start = new ListNode(-1);
        middle = new ListNode(-1);
        last = new ListNode(-1);
        
        start.next = last;
        last.prev = start;
    }
    
    public void pushFront(int val) {
        ListNode newNode = new ListNode(val);
        
        //insert new node in between start and start.next
        newNode.next = start.next;
        newNode.prev = start;
        
        //fix start and start.next to connect the new node
        start.next.prev = newNode;
        start.next = newNode;
        
        //increment count
        count++;
        if (count == 1)
            middle = newNode;   // for first time the newNode will be the middle node
        else if(count % 2 == 0) // if even store to the left side of existing middle node
            middle = middle.prev;
    }
    
    public void pushMiddle(int val) {
        ListNode newNode = new ListNode(val);
        
        //if there is not extra node other than start and last then add the node to the middle
        if (count == 0){
            newNode.prev = start;
            newNode.next = last;
            
            last.prev = newNode;
            start.next = newNode;
        }
        else if(count % 2 == 0){   // if count is even then newNode will be pushed after middle
            newNode.next = middle.next;
            newNode.prev = middle;
            
            middle.next.prev = newNode;
            middle.next = newNode;
        }
        else{
            newNode.prev = middle.prev; // if count is odd then newNode will be pushed before middle
            newNode.next = middle;
            
            middle.prev.next = newNode;
            middle.prev = newNode;
        }
        middle = newNode;
        count++;
        return;
    }
    
    public void pushBack(int val) {
        ListNode newNode = new ListNode(val);
        
        // newNode will be inserted before the last
        newNode.prev = last.prev;
        newNode.next = last;
        
        last.prev.next = newNode;
        last.prev = newNode;
        
        count++;
        if (count == 1)
            middle = newNode;
        else if(count % 2 != 0) // if count is odd then middle will be set to the right side of new node
            middle = middle.next;
    }
    
    public int popFront() {
        // no element to pop
        if (count == 0)
            return -1;
        
        int result = start.next.val;
        //remove the start.next for pop operation
        removeNode(start.next);
        count--;
        if (count % 2 != 0)
            middle = middle.next;
        
        return result;
    }
    
    public int popMiddle() {
        // do only if there are elements
        if (count == 0)
            return -1;
        
        int result = middle.val;
        removeNode(middle);
        if (count % 2 != 0) // if count is odd then set middl to the left node
            middle = middle.prev;
        else
            middle = middle.next; // if count is even then set middle to the right node
        count--;
        return result;
    }
    
    public int popBack() {
        // do only if there are elements
        if (count == 0)
            return -1;
        
        int result = last.prev.val;
        //remove the last.prev node
        removeNode(last.prev);
        count--;
        if (count % 2 == 0) // if count is even then set middle to the left node
            middle = middle.prev;
        return result;
    }
    
    private void removeNode(ListNode node){
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }
}