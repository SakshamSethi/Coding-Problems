//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }
            int[] source = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                source[i] = x;
            }
            int[] dest = new int[2];
            for (int i = 0; i < 2; i++) {
                int x = sc.nextInt();
                dest[i] = x;
            }
            Solution ob = new Solution();
            int ans = ob.shortestPath(grid, source, dest);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java
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

    int shortestPath(int[][] grid, int[] source, int[] destination) {

    if(source[0]==destination[0] && source[1]==destination[1])return 0;
    
    int n=grid.length;
    int m = grid[0].length;
    
    int[][]dist = new int[n][m];
    
    for(int[] arr:dist)
    {
        Arrays.fill(arr,(int)1e9);
    }
    
    
    dist[source[0]][source[1]] = 0;
    
    Queue<Pair> q= new LinkedList<>();
    q.add(new Pair(0,source[0],source[1]));
    
    
    int[]drow = {-1,0,1,0};
    int[]dcol = {0,1,0,-1};
    
    
    while(!q.isEmpty())
    {
        int wt = q.peek().wt;
        int first = q.peek().first;
        int second = q.peek().second;
        q.remove();
        for(int i=0 ; i<4;i++)
        {
            int row = first+drow[i];
            int col = second+dcol[i];
            
        if(row<n && row>=0 && col<m && col>=0 && grid[row][col]==1 && wt+1<dist[row][col]) 
        {
            dist[row][col]=1+wt;
            if(row==destination[0] && col==destination[1])
            {return 1+wt;
            }
            q.add(new Pair(1+wt , row ,col));
            
        }
        }
    }
    
    return -1;
    
    
    }
}
