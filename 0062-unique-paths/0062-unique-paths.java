class Solution {
  

  public int uniquePaths(int m, int n) {
      
    int[][]dp = new int[m][n];
    
   for(int[] arr : dp)
   {
Arrays.fill(arr,-1);
   }
    
    return count(0,0,m-1,n-1,dp);
    
   
      
    }
  int count(int a , int b , int m , int n ,int[][] dp )
  {
    if(a==m && b==n)
    {
  
      return 1;
    }
    if(a>m || b>n) return 0;
    
    if(dp[a][b]!=-1) return dp[a][b];
    
    int down =  count(a+1,b,m,n,dp);
    int right = count(a,b+1,m,n,dp);
  
    return dp[a][b]=down+right;
  }
}