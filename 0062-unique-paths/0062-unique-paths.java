class Solution {
  

  public int uniquePaths(int m, int n) {
      
    int[][]dp = new int[m][n];
    
   for(int[] arr : dp)
   {
Arrays.fill(arr,-1);
   }
    
    //return count(0,0,m-1,n-1,dp);
    
    // TABULATION  
      
    dp[m-1][n-1] = 1;
    
    for(int i =m-1 ; i>=0;i--)
    {
      for(int j=n-1;j>=0;j--)
      {
       
        if(i==m-1 && j==n-1) continue;
        else
        {
         int down =0 , right =0;
          if(i<m-1)   down = dp[i+1][j];
         if(j<n-1) right = dp[i][j+1];
          dp[i][j] = down+right;
        }
        
    
      }
    }
    return dp[0][0];
   
      
    }
 /* int count(int a , int b , int m , int n ,int[][] dp )
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
  }*/
}