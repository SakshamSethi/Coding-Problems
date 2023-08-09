class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        
      Queue<Integer> q = new LinkedList<>();
      
      //--> check if the current element is 0 or not --> if it is zero , we will check that if it is possibly  reachable throught the previous 0's which we will be storing inside out queue (they should be in range of the previous zeroes )
    
      // so if at any point the queue becomes empty which we have reach a 0 we can say that zero is not possible to reach and hence we conclude that there is no other way to reach the end and we return false
    
      
      int n=s.length();
      if(s.charAt(n-1)!='0')return false ;
      q.offer(0); // store index 0 as the start point 
      
      for(int i=1 ; i<n ; i++)
      {
        if(s.charAt(i)=='0')
        {
         while(!q.isEmpty() && q.peek()+maxJump<i) q.poll();
          
          if(q.isEmpty()) return false;
        
          int prev = q.peek();
          if(prev+minJump<=i && prev+maxJump>=i )
          {
            if(i==n-1)return true;
            q.offer(i);
            
          }
            
        }
      }
      return false;
    }
}