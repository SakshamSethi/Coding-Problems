class Tuple
{
  int first , second , third ;
  Tuple(int first , int second , int third)
  {
      this.first = first ;
    this.second = second ;
    this.third = third ;
    
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
      int m = heights[0].length;
      
      int[][]dist = new int[n][m];
    
      for(int[] arr : dist )
        Arrays.fill(arr,Integer.MAX_VALUE);
      
      PriorityQueue<Tuple> q = new PriorityQueue<Tuple>((x,y)->x.first-y.first);
      
      q.add(new Tuple(0,0,0));
      dist[0][0]=0;
      int[]drow ={-1,0,1,0};
      int[]dcol={0,-1,0,1};
      while(!q.isEmpty())
      {
        int diff = q.peek().first;
        int row = q.peek().second;
        int col = q.peek().third;
        q.remove();
        
        if(row==n-1 && col==m-1)return diff;
        
        for(int i=0 ; i<4 ; i++)
        {
          int nrow = row+drow[i];
          int ncol = col+dcol[i];
          
          if(nrow<n && nrow>=0 && ncol<m && ncol>=0)
          {
            int newEffort = Math.max(Math.abs(heights[row][col]-heights[nrow][ncol]),diff);
            
            if(newEffort<dist[nrow][ncol])
            {
              dist[nrow][ncol]=newEffort;
              q.add(new Tuple(newEffort,nrow,ncol));
            }
          }
        }
        
      }
      
      return 0;
    }
}