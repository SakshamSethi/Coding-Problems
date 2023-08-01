//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java
class DisjointSet
{
  List<Integer> parent = new ArrayList<>();
  List<Integer> size = new ArrayList<>();
  
  DisjointSet(int n)
  {
    for(int i=0 ; i< n ; i++)
    {
      parent.add(i);
      size.add(1);
    }
  }
  int findUPar(int node)
  {
    if(node == parent.get(node)) return node;
    
    int ulp = findUPar(parent.get(node));
    parent.set(node,ulp);
    return ulp;
  }
  void unionBySize(int u , int v)
  {
    int upu = findUPar(u);
    int upv = findUPar(v);
    
    if(upu==upv)return;
    
    if(size.get(upu)<size.get(upv))
    {
      parent.set(upu,upv);
      size.set(upv , size.get(upu)+size.get(upv));
    }
    else
    {
            parent.set(upv,upu);
      size.set(upu , size.get(upu)+size.get(upv));
    }
  }
}

class Solution {
    
    public List<Integer> numOfIslands(int n, int m, int[][] operators) {
    DisjointSet ds = new DisjointSet(n*m);
    List<Integer> ans = new ArrayList<>();
    int[][]vis = new int[n][m];
  int cnt=0;
  for(int[] it : operators)
  {
      int row = it[0];
      int col = it[1];
      if(vis[row][col]==1){
          ans.add(cnt);
          continue;
      }
      
      vis[row][col]=1;
      cnt++;
      
      int[]dr = {-1,0,1,0};
      int[]dc = {0,-1,0,1};
      
      for(int i=0 ; i<4;i++)
      {
            int adjr = row + dr[i];
            int adjc = col + dc[i];
      
          
          if(adjr<n && adjr>=0 && adjc<m && adjc>=0 && vis[adjr][adjc]==1 )
          {
              int node = (row*m) + col;
              int adjNode = (adjr*m) + adjc;
              
              if(ds.findUPar(node)!=ds.findUPar(adjNode))
              {
                  cnt--;
                  ds.unionBySize(node , adjNode);
              }
          }
          
      }
      ans.add(cnt);
  }
 
    return ans;
    
    }
 
    
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int  k= sc.nextInt();
            int[][] a = new int[k][2];
            for(int i=0;i<k;i++){
            
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            List<Integer> ans = obj.numOfIslands(n,m,a);
           
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends