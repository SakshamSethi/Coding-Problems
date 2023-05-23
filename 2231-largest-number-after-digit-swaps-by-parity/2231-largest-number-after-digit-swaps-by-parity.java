class Solution {
    public int largestInteger(int num) {
       PriorityQueue<Integer> odd = new  PriorityQueue<>();
        PriorityQueue<Integer> even = new  PriorityQueue<>();
        
        int temp = num;
        
        while(num>0)
        {
        
            int rem = num%10;
            
            if(rem%2==1) odd.offer(rem);
            else even.offer(rem);
            
            num = num/10;
            
        }
        num = temp;
        StringBuilder str = new StringBuilder();
        
        while(num>0)
        {
            int rem = num%10;
            
            if(rem%2==0)
                str.insert(0,even.poll());
            else
                str.insert(0,odd.poll());
            
            num/=10;
        }
        
        return Integer.parseInt(str.toString());
    }
    
}