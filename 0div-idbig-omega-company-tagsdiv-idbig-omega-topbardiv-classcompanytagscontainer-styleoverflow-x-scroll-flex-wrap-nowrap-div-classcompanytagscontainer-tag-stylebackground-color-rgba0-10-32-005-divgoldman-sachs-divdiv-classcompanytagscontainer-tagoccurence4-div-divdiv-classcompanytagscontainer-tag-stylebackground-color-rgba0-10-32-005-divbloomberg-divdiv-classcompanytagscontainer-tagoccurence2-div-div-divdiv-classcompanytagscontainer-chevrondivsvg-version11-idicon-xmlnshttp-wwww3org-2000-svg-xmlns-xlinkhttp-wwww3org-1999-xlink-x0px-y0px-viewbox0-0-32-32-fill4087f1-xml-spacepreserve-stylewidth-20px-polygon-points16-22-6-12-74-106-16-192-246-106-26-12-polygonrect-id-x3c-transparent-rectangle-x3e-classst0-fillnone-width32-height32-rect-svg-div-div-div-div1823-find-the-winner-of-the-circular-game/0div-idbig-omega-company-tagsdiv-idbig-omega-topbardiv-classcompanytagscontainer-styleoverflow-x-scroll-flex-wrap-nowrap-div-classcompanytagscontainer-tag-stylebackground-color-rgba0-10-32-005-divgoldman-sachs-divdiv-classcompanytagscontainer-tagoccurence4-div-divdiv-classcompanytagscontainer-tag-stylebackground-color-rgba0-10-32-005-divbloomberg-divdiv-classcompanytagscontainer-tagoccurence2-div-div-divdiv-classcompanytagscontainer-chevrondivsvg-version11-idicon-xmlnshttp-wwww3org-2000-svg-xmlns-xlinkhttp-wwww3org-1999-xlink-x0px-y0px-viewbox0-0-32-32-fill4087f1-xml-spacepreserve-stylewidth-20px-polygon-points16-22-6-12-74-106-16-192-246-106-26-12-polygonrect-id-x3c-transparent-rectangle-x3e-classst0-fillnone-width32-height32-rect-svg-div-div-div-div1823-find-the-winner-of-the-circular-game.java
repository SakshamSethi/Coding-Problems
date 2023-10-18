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
     return helper(n,k);  // converting it into 1 based indexing by adding 1
    }
  int helper(int n , int k)
  {
     if(n==1)return 1;
      return (helper(n-1,k)+k-1)%n+1;
  }
}