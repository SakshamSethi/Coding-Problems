class Solution {
    public int minFallingPathSum(int[][] matrix) {
      
      int n = matrix.length;
      int mini = Integer.MAX_VALUE;
      int[][]dp = new int[n][n];
      for(int[] a : dp) Arrays.fill(a,-101);
      for(int i =0 ; i< n ;i++)
      {
        mini = Math.min(mini,count(matrix,n-1,0,i,dp));
        
      }
      return mini;
    }
  
  int count(int[][]matrix , int n , int i , int j , int[][]dp )
  {
    if(j<0||j>n) return (int)Math.pow(10,8);
    if(i==n) return matrix[i][j];
    
    if(dp[i][j]!=-101) return dp[i][j];
    
    int  l = matrix[i][j] + count(matrix,n,i+1,j-1,dp);
    int d = matrix[i][j] + count(matrix,n,i+1,j,dp);
    int r = matrix[i][j] + count(matrix,n,i+1,j+1,dp);
    
    return dp[i][j]= Math.min(l,Math.min(r,d));
    
  }
}