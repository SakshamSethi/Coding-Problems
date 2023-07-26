//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int[][] grid = new int[n][m];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < m; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            int[][] ans = obj.nearest(grid);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution
{
    class Pair
    {
        int first , second , distance ;
        
        Pair(int first , int second , int distance)
        {
            this.first = first ;
            this.second = second;
            this.distance = distance ;
        }
    }
    
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        int n = grid.length;
        int m = grid[0].length ;
        
        int[][]visited = new int[n][m];
        int[][]ans = new int[n][m];
        
        Queue<Pair> q = new LinkedList();
        
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0 ;j<m;j++)
            {
                if(grid[i][j]==1)
                {
                    visited[i][j]=1;
                    ans[i][j]=0;
                    q.add(new Pair(i,j,0));
                }
            }
        }
        
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        
        while(!q.isEmpty())
        {
            int row = q.peek().first;
            int col = q.peek().second;
            int distance = q.peek().distance;
            q.remove();
            
            for(int i=0 ; i<4;i++)
            {
                int r = row+drow[i];
                int c = col +dcol[i];
                
                if(r>=0 && r<n && c>=0 && c<m && visited[r][c]==0)
                {
                    q.add(new Pair(r,c,distance+1));
                    ans[r][c]=distance+1;
                    visited[r][c]=1;
                }
            }
            
        }
        return ans;
    }
}