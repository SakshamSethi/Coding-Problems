class Solution {
    public int minDistance(String word1, String word2) {
      
      int n = word1.length();
      int m = word2.length();
      
      int[][] dp = new int[n+1][m+1];
     // for(int[]arr : dp) Arrays.fill(arr,-1);
      
    //  int common = count(word1,word2,n,m,dp);
          for(int i=0;i<=n;i++) 
      {
        dp[i][0]=0;
      }
      for(int j=0;j<=m;j++)dp[0][j]=0;
      
      for(int i= 1 ; i<=n ; i++)
      {
        for(int j=1;j<=m ; j++)
        {
          if(word1.charAt(i-1)==word2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
          else dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
        }
      }
      return (n-dp[n][m])+(m-dp[n][m]);
    }
     // return (n-common)+(m-common);
      
//}
  /*int count(String w1 , String w2 , int n , int m , int[][]dp)
  {
    if(n==0||m==0 )return 0;
    if(dp[n][m]!=-1) return dp[n][m];
    
    if(w1.charAt(n-1)==w2.charAt(m-1)) return dp[n][m] = 1 + count(w1,w2,n-1,m-1,dp);
    
    else return dp[n][m] = Math.max(count(w1,w2,n-1,m,dp) , count(w1,w2,n,m-1,dp));
    
  }*/
}