class Solution {
    public int numDistinct(String s, String t) {
        
      int n = s.length() ;
      int m = t.length();
      int[][]dp = new int[n+1][m+1];
      
   //   for(int[]arr : dp) Arrays.fill(arr,-1);
      
    //  return count(s,t,n,m,dp);
  
      //Tabulation :
      
      for(int i =0 ; i<=n; i++) dp[i][0]=1;
      for(int i = 1 ; i<=m;i++) dp[0][i]=0;
      
      for(int i=1 ; i<=n ;i++)
      {
        for(int j=1;j<=m;j++)
        {
          if(s.charAt(i-1)==t.charAt(j-1))
          {
            dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
          }
          else
          {
            dp[i][j] = dp[i-1][j];
          }
        }
      }
      return dp[n][m];
    }

  /*  int count(String s , String t , int n , int m , int[][]dp )
  {
      if(m==0)
    {return 1;}
    if(n<=0) 
    {return 0;}
    
 if(dp[n][m]!=-1) return dp[n][m];
    
    if(s.charAt(n-1)==t.charAt(m-1))
    {
      return dp[n][m]= count(s,t,n-1,m-1,dp) +  count(s,t,n-1,m,dp);
    }
    else
      return dp[n][m]= count(s,t,n-1, m,dp);
    
  } */
}