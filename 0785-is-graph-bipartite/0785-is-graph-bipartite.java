class Solution {

    public boolean isBipartite(int[][] graph) {
      
      int n = graph.length;
      int[]color = new int[n];
      Arrays.fill(color,-1);
      
      for(int i=0 ; i<n;i++)
      {
          if(color[i]==-1)
          {
          if(bfs(i,color,graph)==false)
            return false;
        }
        
      }
      return true;
    }
  boolean bfs(int i  , int[]color , int[][]graph)
  {
    color[i] = 0 ;
    Queue<Integer> q = new LinkedList();
    q.add(i);
    
    while(!q.isEmpty())
    {
      int u = q.remove();
      
      for(int node : graph[u])
      {
        if(color[node]==-1)
        {
          color[node] = color[u]==0?1:0;
          q.add(node);
        }
        else
        {
          if(color[node]==color[u]) return false;
        }
      }
  
      
    }
    return true;
  }
}