class Solution {
    public int minFallingPathSum(int[][] matrix) {
      
      int n = matrix.length;
      int mini = Integer.MAX_VALUE;
      int[][]dp = new int[n][n];
      for(int[] a : dp) Arrays.fill(a,-101);
      /*for(int i =0 ; i< n ;i++)
      {
        mini = Math.min(mini,count(matrix,n-1,0,i,dp));
        
      }
      return mini;
    */
      
      //Tabulation
      
      for(int i=0;i<n;i++) dp[n-1][i] = matrix[n-1][i];
      
      for(int i=n-2;i>=0;i--)
      {
        for(int j=n-1;j>=0;j--)
        {
          int l = (int)Math.pow(10,6) , r = (int)Math.pow(10,6) ,d = (int)Math.pow(10,6);
          
        if(j>0)   l = matrix[i][j] + dp[i+1][j-1];
                 d = matrix[i][j] + dp[i+1][j] ;
          if(j<n-1)  r = matrix[i][j] + dp[i+1][j+1];
        
          dp[i][j] = Math.min(l,Math.min(d,r));
        }
        
        
        
      }
      
int min=Integer.MAX_VALUE;
      for(int i=0;i<n;i++)
      {
        min = Math.min(min,dp[0][i]);
}
      return min;
    }
  
  /*int count(int[][]matrix , int n , int i , int j , int[][]dp )
  {
    if(j<0||j>n) return (int)Math.pow(10,8);
    if(i==n) return matrix[i][j];
    
    if(dp[i][j]!=-101) return dp[i][j];
    
    int  l = matrix[i][j] + count(matrix,n,i+1,j-1,dp);
    int d = matrix[i][j] + count(matrix,n,i+1,j,dp);
    int r = matrix[i][j] + count(matrix,n,i+1,j+1,dp);
    
    return dp[i][j]= Math.min(l,Math.min(r,d));
    
  }*/
}