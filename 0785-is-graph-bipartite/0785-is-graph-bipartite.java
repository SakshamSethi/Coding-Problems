class Solution {

    public boolean isBipartite(int[][] graph) {
      
      int n = graph.length;
      int[]color = new int[n];

      
      for(int i=0 ; i<n;i++)
      {
          if(color[i]==0)
          {
          if(dfs(i,1,color,graph)==false)
            return false;
        }
        
      }
      return true;
    }
  
  boolean dfs(int i ,int col , int[]color , int[][]graph)
  {
    color[i]=col;
    
    for(int u : graph[i])
    {
      if(color[u]==0)
      {
          if(dfs(u,-col,color,graph)==false)return false;
      }
      else
      {
        if(color[u]==color[i]) return false;
      }
    }
    return true;
  }
  
  
  /*boolean bfs(int i  , int[]color , int[][]graph)
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
  }*/
}