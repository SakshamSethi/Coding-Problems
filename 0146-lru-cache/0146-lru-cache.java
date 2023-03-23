class LRUCache {

    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    HashMap<Integer,Node> map = new HashMap();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity ;
        head.next = tail;
        head.prev=tail.next=null;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }
        else return -1;
            
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
            remove(map.get(key));
        if(map.size()==capacity)
        {
            remove(tail.prev);
        }
        insert(new Node(key,value));
    }
    public void insert(Node node)
    {
        map.put(node.key , node);
        Node headNext = head.next;
      
        head.next = node;
        node.next = headNext;
        headNext.prev=node;
        node.prev=head;
        
    }
     private void remove(Node node) {
        map.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    class Node
    {
      Node next;
        Node prev;
        int key , value ;
        Node(int key , int value)
        {
            this.key = key;
            this.value = value;
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */