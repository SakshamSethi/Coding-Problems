class Pair
{
  int first , second ;
  Pair(int first , int second )
  {
    this.first = first ;
    this.second = second ;
  }
 
}
 class Tuple
  {
    int first , second , third ;
    
    Tuple(int first , int second , int third)
    {
      this.first = first ;
      this.second = second ;
      this.third = third;
    }
  }
class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
      ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
      
      for(int i=0 ; i<n ; i++)
      { 
      adj.add(new ArrayList());
      }
      int m = flights.length;
      for(int i=0 ; i< m ;i++)
      {
        adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
      }
      
      Queue<Tuple> q = new LinkedList();
      
      q.add(new Tuple(0,src,0));
      
      int[]dist = new int[n];
      Arrays.fill(dist , (int)1e9);
      dist[src]=0;
      
      while(!q.isEmpty())
      {
        Tuple it = q.poll();
        int stops = it.first ;
        int node = it.second ;
        int wt = it.third ;
        
        if(stops>k) continue ;
        
        for(Pair itr : adj.get(node))
        {
          int adjNode = itr.first;
          int edgeW = itr.second;
            
          if(wt+edgeW<dist[adjNode] && stops<=k)
          {
            dist[adjNode] = wt+edgeW;
          //  4---(node)---4--->(adjNode)
          q.add(new Tuple(stops+1 , adjNode , wt+edgeW));
          
          }
          
        }
        
      }
      
      if(dist[dst]==1e9)return -1;
      return dist[dst];
      
    }
}