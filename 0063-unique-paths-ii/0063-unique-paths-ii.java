class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
      
      int m = grid.length -1 ;
      int n = grid[0].length-1;
      
      if(grid[m][n]==1) return 0;
      
      int[][] dp = new int[m+1][n+1];
      for(int[]arr : dp)
      {
        Arrays.fill(arr,-1);
      }
      return count(grid,0,0,m,n,dp);
      
      
    }
  int count(int[][] grid , int a , int b , int m , int n,int[][]dp)
  {
    if(a==m && b==n)
      return 1;
    
    if(a>m||b>n||grid[a][b]==1) return 0;
    
    if(dp[a][b]!=-1)return dp[a][b];
    int down = count(grid,a+1,b,m,n,dp);
    int right = count(grid,a,b+1,m,n,dp);
    
    return dp[a][b]= down+right;
  }
}