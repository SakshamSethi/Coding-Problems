class Solution {
  class Pair{
    
    int first , second ,time;
    Pair(int i , int j , int time)
    {
      first = i;
      second =j;
      this.time = time;
    }
  }
    public int orangesRotting(int[][] grid) {
        
      //can use bfs or dfs 
      
      //using bfs 
      int n=grid.length;
      int m = grid[0].length;
      int fresh=0;
      //int[][]visited = new int[n][m];
      
      Queue<Pair>q = new LinkedList();
      
      for(int i =0 ; i<n ; i++)
      {
        for(int j =0 ; j<m ; j++)
        {
          if(grid[i][j]==2)
          {
            q.add(new Pair(i,j,0));
              
         
          }
          else if(grid[i][j]==1)
            fresh++;
          
        }
      }
      
      int count = 0;
      int maxTime = 0 ;
      
      int[] drow = {-1,0,1,0};
      int[] dcol = {0,1,0,-1};
      
      while(!q.isEmpty())
      {

               
        int row = q.peek().first;
        int col = q.peek().second;
        
        int time = q.peek().time;
        q.remove();
        maxTime = Math.max(maxTime,time);
        for(int i = 0 ; i<4; i++)
        {
          
        
            int nrow = row+drow[i];
            int ncol = col+dcol[i];
               
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1)
            { 
              grid[nrow][ncol]=2;
              q.add(new Pair(nrow,ncol,time+1));
              count++;
            }
            
        }
      }
      return count!=fresh?-1:maxTime ;
    }
}