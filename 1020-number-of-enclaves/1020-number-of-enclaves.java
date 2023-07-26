class Solution {
    public int numEnclaves(int[][] grid) {
      
      int n =grid.length;
      int m = grid[0].length;
      
      int[][]visited = new int[n][m];
      int count=0;
      int[]drow = {-1,0,1,0};
      int[]dcol = {0,-1,0,1};
      
      for(int i=0 ; i<n;i++)
      {
        if(grid[i][0]==1 && visited[i][0]==0) dfs(i,0,visited,grid,drow,dcol);
        if(grid[i][m-1]==1 && visited[i][m-1]==0) dfs(i,m-1,visited,grid,drow,dcol);
      }
      
      for(int j=0 ; j<m;j++)
      {
        if(grid[0][j]==1 && visited[0][j]==0) dfs(0,j,visited,grid,drow,dcol);
        if(grid[n-1][j]==1 && visited[n-1][j]==0) dfs(n-1,j,visited,grid,drow,dcol);
      }
      
      int allOne =0 ;
      for(int i=0 ; i<n;i++)
      {
        for(int j=0 ; j<m;j++)
        {
          if(grid[i][j]==1 && visited[i][j]==0) allOne++;
        }
      }
      
      return allOne ;
    }
  
  void dfs(int i , int j , int[][]visited , int[][]grid , int[]drow , int[]dcol)
  {
  
    visited[i][j]=1;
      int n =grid.length;
      int m = grid[0].length;
      
    for(int x =0 ; x<4;x++)
    {
      int row = i+drow[x];
      int col = j+dcol[x];
      
      if(row<n&&row>=0 && col>=0&&col<m && visited[row][col]==0 && grid[row][col]==1)
      {
        dfs(row,col,visited,grid,drow,dcol);
      }
      
    }
    return ;
  }
  
}