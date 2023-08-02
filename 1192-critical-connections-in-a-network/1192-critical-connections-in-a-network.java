class Solution {
  private int timer=1;
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
      
      List<List<Integer>> adj = new ArrayList();
      
      for(int i=0 ; i< n ; i++)adj.add(new ArrayList());
      
      for(List<Integer> it : connections)
      {
        adj.get(it.get(0)).add(it.get(1));
        adj.get(it.get(1)).add(it.get(0));
      }
      
      int[] vis = new int[n];
      int[] tin = new int[n];
      int[] low = new int[n];
      
      List<List<Integer>>bridges = new ArrayList<>();
      
      dfs(0,-1,adj,vis,tin,low,bridges);
      
      return bridges;
      
    }
  void dfs(int node , int parent, List<List<Integer>> adj , int[]vis , int[] tin , int[]low ,List<List<Integer>>bridges)
  {
    vis[node]=1;
    tin[node]= low[node]=timer;
    timer++;
    
    for(int adjNode : adj.get(node))
    {
      if(adjNode == parent) continue ;
      
      if(vis[adjNode]==0)
      {
        dfs(adjNode, node , adj , vis ,tin ,low ,bridges);
        low[node] = Math.min(low[node],low[adjNode]);
        
        //check for bridge
        if(tin[node]<low[adjNode])
        {
          bridges.add(Arrays.asList(node , adjNode));
        }
      }
      else
      {
        low[node] = Math.min(low[node],low[adjNode]);
      }
    }
    
  }
}