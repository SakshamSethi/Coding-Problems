//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
    
    ArrayList<String> ans = new ArrayList<>();
    
    compute(0,0,m,n,"",ans);
    
    return ans;
  
    }
    
    public static void compute(int i , int j , int[][]m , int n , String p , ArrayList<String>ans)
    {
    if(i<0 || j<0 || i>=n || j>=n || m[i][j]==0) return ;
    if(i==n-1 && j==n-1)
    {
        ans.add(new String(p));
        return ;
    }
 
    m[i][j]=0;   
    compute(i,j+1,m,n,p+'R',ans);
    compute(i,j-1,m,n,p+'L',ans);
    compute(i-1,j,m,n,p+'U',ans);
    compute(i+1,j,m,n,p+'D',ans);
    
    m[i][j]=1;
    return;
        
    }
    
}