//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            char[][] grid = new char[n][m];
            for (int i = 0; i < n; i++) {
                String[] S = br.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    grid[i][j] = S[j].charAt(0);
                }
            }
            Solution obj = new Solution();
            int ans = obj.numIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to find the number of islands.
    class Pair
    {
        int first , second;
        
        Pair(int first , int second)
        {
            this.first=first;
            this.second = second;
        }
    }
    public int numIslands(char[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        boolean[][]visited = new boolean[row][col] ;
        for(boolean[] arr:visited) Arrays.fill(arr,false);
        
        int count =0 ;
        
        for(int i =0 ; i < row ; i++)
        {
            for(int j =0 ; j<col ; j++)
            {
                if(!visited[i][j] && grid[i][j]=='1')
                {   count++;
                    bfs(i,j,visited,grid);
                 
                }
                
            }
        }
        return count;
    }
    
    void bfs(int row , int col , boolean[][]visited , char[][]grid)
    {
        int n = grid.length;
        int m = grid[0].length;
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row,col));
        visited[row][col]=true;
        while(!q.isEmpty())
        {
            int r = q.peek().first;
            int c = q.peek().second;
            q.remove();
            
            for(int di = -1 ; di<=1 ; di++)
            {
                for(int dc = -1 ; dc<=1;dc++)
                {
                    int nrow = r+di;
                    int ncol = c+dc;
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !visited[nrow][ncol] && grid[nrow][ncol]=='1')
                {
                    visited[nrow][ncol]=true;
                    q.add(new Pair(nrow,ncol));
                }
                }
            }
            
        }
    }
}