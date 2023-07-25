class Solution {
    public int findCircleNum(int[][] isConnected) {
        
      int n = isConnected.length;
      int[] visited = new int[n];
      
      int count=0;
      
      for(int i =0 ; i<n ; i++)
      {
        if(visited[i]==0)
        {
          count++;
          dfs(i,isConnected,visited);
        }
      }
      
      return count;
        
      
    }
  void dfs(int node , int[][]isConnected,int[] visited)
    {
        visited[node]=1;
        
        for(int x=0 ; x<isConnected.length ;x++)
        {
            if(isConnected[node][x]==1 && visited[x]==0)
            {
                dfs(x,isConnected,visited);
            }
        }
    }
}