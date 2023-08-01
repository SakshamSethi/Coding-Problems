class DisjointSet
{
  List<Integer>parent = new ArrayList<>();
  List<Integer>size = new ArrayList<>();

  public DisjointSet(int n)
  {
    for(int i=0 ; i<n ; i++)
    {
      parent.add(i);
      size.add(1);
      
    }
  }
  public int findUPar(int node)
  {
    if(node==parent.get(node)) return node ;
    
    int ulp = findUPar(parent.get(node));
    parent.set(node,ulp);
    return ulp;
  }
  public void unionBySize(int u , int v)
  {
    int up_u = findUPar(u);
        int up_v = findUPar(v);
    
    if(up_u==up_v){

      return;
    }
    if(size.get(up_u) < size.get(up_v))
    {
      parent.set(up_u , up_v);
      size.set(up_v , size.get(up_u)+size.get(up_v));
    }
    else
    {
      parent.set(up_v , up_u);
      size.set(up_u , size.get(up_u)+size.get(up_v));
    }
  }
}


class Solution {
    public int largestIsland(int[][] grid) {
      int n = grid.length;
      DisjointSet ds = new DisjointSet(n*n);
      for(int i =0 ; i<n ; i++)
      {
        for(int j=0 ; j<n ; j++)
        {
          if(grid[i][j]==0)continue;
          
          int[]dr={-1,0,1,0};
          int[]dc={0,1,0,-1};
          
          for(int ind = 0 ; ind<4 ; ind++)
          {
            int nrow = i+dr[ind];
            int ncol = j+dc[ind];
            
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<n&&grid[nrow][ncol]==1)
            {
              int node = i*n + j;
              int adjNode = nrow*n+ncol;
              ds.unionBySize(node,adjNode);
            }
          }
          
        }
      }
      
      // step 2 making all the zeroes one 
        int mx=0;
      for(int i=0 ; i< n ; i++)
      {
        for(int j =0 ; j<n ; j++)
        {
          if(grid[i][j]==1)continue ; // khali zero ko one bana na hai toh 1 ko ignore karo 
         
           int[]dr={-1,0,1,0};
          int[]dc={0,1,0,-1};
          HashSet<Integer> hs = new HashSet<>();
          for(int ind = 0 ; ind<4 ; ind++)
          {
            int nrow = i+dr[ind];
            int ncol = j+dc[ind];
            
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<n&&grid[nrow][ncol]==1)
            {
              
              int adjNode = (nrow*n)+ncol;
              hs.add(ds.findUPar(adjNode));
            }
          
        }
          int subTotal=0;
          for(int it : hs)
          {
            subTotal+=ds.size.get(it);
          }
       
          mx = Math.max(mx , subTotal+1);
        
      }
    }
      //agar poore graph mai saare one honge toh upper wala loop chlega he nahi or mx ki value 0 rhegi
      // to handle this edge case what we'll do is that we will check for ultimate parent of all nodes
       for (int cellNo = 0; cellNo < n * n; cellNo++) {
            mx = Math.max(mx, ds.size.get(ds.findUPar(cellNo)));
       }   
      
      return mx;
}
    }