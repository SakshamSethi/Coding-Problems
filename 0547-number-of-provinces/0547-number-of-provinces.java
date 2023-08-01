class DisjointSet 
{
  List<Integer> size = new ArrayList();
    List<Integer> parent = new ArrayList();
  
  public DisjointSet(int n)
  {
    for(int i=0 ; i<=n ; i++)
    {
      size.add(1);
      parent.add(i);
      }
  }
  
  int findUPar(int node )
  {
    if(node==parent.get(node))return node;
    
    int ulp = findUPar(parent.get(node));
    parent.set(node,ulp);
    return ulp;
  }
  public void unionBySize(int u , int v)
  {
    int ulp_u = findUPar(u);
    int ulp_v = findUPar(v);
    if(ulp_u == ulp_v) return ;
    
    if(size.get(ulp_u)<size.get(ulp_v))
    {
      parent.set(ulp_u,ulp_v);
      size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
      
    }
    else
    {
       parent.set(ulp_v,ulp_u);
      size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
    }
  }
  
}







class Solution {
    public int findCircleNum(int[][] isConnected) {
        
     /* visited = new int[n];
      
      int count=0;
      
      for(int i =0 ; i<n ; i++)
      {
        if(visited[i]==0)
        {
          count++;
          dfs(i,isConnected,visited);
        }
      }
      
      return count;*/
      
      //Using Disjoint Set DataStructure 
      int n = isConnected.length;
      
      DisjointSet ds = new DisjointSet(n);
      for(int i=0 ; i<n ;i++)
      {
        for(int j=0 ; j<n ; j++)
        {
          if(isConnected[i][j]==1)
          {
            ds.unionBySize(i,j);
          }
        }
      }
      int cnt =0 ;
      for(int i=0;i<n;i++)
      {
        if(ds.findUPar(i)==i)cnt++;
      }
      return cnt;
    }

    
  /*void dfs(int node , int[][]isConnected,int[] visited)
    {
        visited[node]=1;
        
        for(int x=0 ; x<isConnected.length ;x++)
        {
            if(isConnected[node][x]==1 && visited[x]==0)
            {
                dfs(x,isConnected,visited);
            }
        }
    }*/
}