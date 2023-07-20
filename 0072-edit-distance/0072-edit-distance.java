class Solution {
    public int minDistance(String w1, String w2) {
      
      int n = w1.length();
      int m = w2.length();
      int[][]dp = new int[n+1][m+1];
      for(int arr[] : dp) Arrays.fill(arr,-1);
    //  return count(w1,w2,n,m,dp);
    
  for(int i=0 ; i<=n ; i++) dp[i][0]=i;
      for(int j=0 ; j<=m ; j++) dp[0][j]=j;
    
      for(int i=1 ; i<=n ;i++)
      {
        
        for(int j=1 ; j<=m ; j++)
        {
          if(w1.charAt(i-1)==w2.charAt(j-1)) dp[i][j] = dp[i-1][j-1];
          else
          {
            dp[i][j] = Math.min(1+dp[i][j-1] , Math.min(1+dp[i-1][j] , 1+dp[i-1][j-1]));
          }
        }
        
      }
      return dp[n][m];
    }
  
  /*int count(String w1 , String w2 , int n , int m , int[][]dp)
  {
    
    if(n==0) return m;
    if(m==0) return n;
    
    if(dp[n][m]!=-1) return dp[n][m];
    if(w1.charAt(n-1)==w2.charAt(m-1)) return dp[n][m] = count(w1,w2,n-1,m-1,dp);
    
    else return dp[n][m] = Math.min(1+count(w1,w2,n,m-1,dp) , Math.min(1+count(w1,w2,n-1,m,dp),1+count(w1,w2,n-1,m-1,dp)));
    
  }*/
  
  
}