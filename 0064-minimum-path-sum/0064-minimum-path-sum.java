class Solution {
    public int minPathSum(int[][] grid) {
      
      int m = grid.length;
      int n = grid[0].length;
      int[][] dp = new int[m][n];

      for(int[] arr : dp)
      {
        Arrays.fill(arr,-1);
      }
      
      return count(grid ,m-1,n-1,dp );
      
    }
  
  int count(int[][] grid , int m , int n, int[][]dp )
  {
    if(m==0 && n==0) return grid[0][0];
    
    if(m<0 || n<0) return 201;
    
    if(dp[m][n]!=-1) return dp[m][n];
    
    int up = grid[m][n] + count(grid,m-1,n,dp);
  int left = grid[m][n] + count(grid,m,n-1,dp);  
    return dp[m][n]= Math.min( left, up);
  
  }
  
}