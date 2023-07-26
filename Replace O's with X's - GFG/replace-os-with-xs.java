//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(a[0]);
            int m = Integer.parseInt(a[1]);
            char mat[][] = new char[n][m];
            for(int i=0; i<n; i++)
            {
                String S[] = in.readLine().trim().split(" ");
                for(int j=0; j<m; j++)
                {
                    mat[i][j] = S[j].charAt(0);
                }
            }
            
            Solution ob = new Solution();
            char[][] ans = ob.fill(n, m, mat);
            for(int i = 0;i < n;i++) {
                for(int j = 0;j < m;j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static char[][] fill(int n, int m, char board[][])
    {
          
      int[][]visited = new int[n][m];
      
      int[]drow = {-1,0,1,0};
      int[]dcol ={0,-1,0,1};
      
      for(int i=0 ; i<n;i++)
      {
          if(board[i][0]=='O' && visited[i][0]==0) dfs(i,0,board,visited,drow,dcol);
            
            if(board[i][m-1]=='O' && visited[i][m-1]==0) dfs(i,m-1,board,visited,drow,dcol);
          
      }
      for(int j=0 ;j<m;j++)
      {
        if(board[0][j]=='O' && visited[0][j]==0 ) dfs(0,j,board,visited,drow,dcol);
           
           if (board[n-1][j]=='O' && visited[n-1][j]==0 ) dfs(n-1,j,board,visited,drow,dcol);
      }
      
      for(int i=0 ; i<n;i++)
      {
        for(int j=0 ; j<m; j++)
        {
          if(board[i][j]=='O'&&visited[i][j]==0) board[i][j]='X';
        }
          
      }
      return board;
    }
   static void dfs(int i , int j ,char[][]board , int[][]visited, int[] drow , int[] dcol)
  {

    visited[i][j]=1;
  int n=board.length;
  int m=board[0].length;
  for(int r = 0 ; r<4;r++)
  {
    int row = i+drow[r];
    int col = j+dcol[r];
    
    if(row>=0 && row<n && col>=0 && col<m &&board[row][col]=='O' && visited[row][col]==0)
    {
      dfs(row,col,board,visited,drow,dcol);
    }
  }
  
    
  }
}