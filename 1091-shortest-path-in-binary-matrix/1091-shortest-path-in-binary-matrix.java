class Pair
{
    int wt ,first,second ;
    Pair(int wt , int first , int second )
    {
        this.wt=wt;
        this.first = first ;
        this.second = second ;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
      if(grid[0][0]==1)return -1;
    
    int n=grid.length;
   
    int m = grid[0].length;
     if(n==1 && m==1 && grid[0][0]==0)return 1;
    int[][]dist = new int[n][m];
    
    for(int[] arr:dist)
    {
        Arrays.fill(arr,(int)1e9);
    }
    
    
    dist[0][0] = 0;
    
    Queue<Pair> q= new LinkedList<>();
    q.add(new Pair(0,0,0));
    
    
    int[]drow = {-1,0,1,0};
    int[]dcol = {0,1,0,-1};
    
    
    while(!q.isEmpty())
    {
        int wt = q.peek().wt;
        int first = q.peek().first;
        int second = q.peek().second;
        q.remove();
       for(int dr = -1 ; dr<=1 ;dr++)
       {
         for(int dc = -1 ; dc<=1 ; dc++)
         {
           
            int row = first+dr;
            int col = second+dc;
            if(row<n && row>=0 && col<m && col>=0 && grid[row][col]==0 && wt+1<dist[row][col]) 
        {
            dist[row][col]=1+wt;
            if(row==n-1 && col==n-1)
            {return 1+wt +1;
            }
            q.add(new Pair(1+wt , row ,col));
            
        }
         }
         
       }
       
    }
    
    return -1;
    
    
    }
    }
