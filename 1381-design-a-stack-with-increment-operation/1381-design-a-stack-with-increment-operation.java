class CustomStack {

    int[] arr;
    int head=-1;
    public CustomStack(int max) {
        arr = new int[max];
    }
    
    public void push(int x) {
        
        if(!isFull()) {arr[++head] = x ;}
        else
            return;
        
    }
    
    public int pop() {
        
        int x = -1;
            
            if(!isEmpty())
            {
                  
               x =arr[head--];
                      
            }
        
        return x;
    }
    public boolean isEmpty()
    {
        return head<0;
    }
    public boolean isFull()
    {
        return head == arr.length-1;
    }
    public void increment(int k, int val) {
        
 
        for(int i=0 ;i<k && i<arr.length;i++)
        {
            arr[i] += val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */