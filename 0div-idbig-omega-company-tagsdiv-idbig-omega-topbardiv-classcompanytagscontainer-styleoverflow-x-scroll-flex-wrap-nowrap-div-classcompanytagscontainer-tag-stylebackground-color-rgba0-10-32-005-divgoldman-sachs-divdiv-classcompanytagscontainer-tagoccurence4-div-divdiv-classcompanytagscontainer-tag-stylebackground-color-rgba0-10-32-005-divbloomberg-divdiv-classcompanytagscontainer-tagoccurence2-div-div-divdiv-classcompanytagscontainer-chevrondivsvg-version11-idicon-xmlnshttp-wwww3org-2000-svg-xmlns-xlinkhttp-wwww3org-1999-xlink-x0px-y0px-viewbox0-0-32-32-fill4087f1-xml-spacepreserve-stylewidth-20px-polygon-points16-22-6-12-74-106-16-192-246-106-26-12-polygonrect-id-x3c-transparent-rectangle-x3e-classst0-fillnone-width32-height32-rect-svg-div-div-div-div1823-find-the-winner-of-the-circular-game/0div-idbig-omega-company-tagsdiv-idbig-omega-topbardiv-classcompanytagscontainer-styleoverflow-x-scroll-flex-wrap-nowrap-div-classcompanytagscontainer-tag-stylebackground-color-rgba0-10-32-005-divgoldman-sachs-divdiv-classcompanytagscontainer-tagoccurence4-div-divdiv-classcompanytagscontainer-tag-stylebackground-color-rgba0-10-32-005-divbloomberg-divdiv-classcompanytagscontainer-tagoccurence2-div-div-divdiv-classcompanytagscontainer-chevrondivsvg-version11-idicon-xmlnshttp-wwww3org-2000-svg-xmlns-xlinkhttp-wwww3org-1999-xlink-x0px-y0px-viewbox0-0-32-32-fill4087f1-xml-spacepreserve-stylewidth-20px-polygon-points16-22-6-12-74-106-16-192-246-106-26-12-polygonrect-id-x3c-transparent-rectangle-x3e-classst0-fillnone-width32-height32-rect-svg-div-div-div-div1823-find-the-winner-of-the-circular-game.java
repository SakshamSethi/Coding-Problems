class Solution {
    public int findTheWinner(int n, int k) {
     
     /* Queue<Integer>queue = new LinkedList<>();
      
      for(int i=1 ; i<=n ; i++)
      {
        queue.offer(i);
      }
      
      while(queue.size()!=1)
      {
        
        for(int i=1 ; i<k ; i++)
        {
          int temp = queue.poll();
          queue.offer(temp);
        }
        queue.poll();
      }
      
      return queue.poll();
    */
     return helper(n,k)+1;
    }
  int helper(int n , int k)
  {
     if(n==1)return 0;
      return (helper(n-1,k)+k)%n;
  }
}