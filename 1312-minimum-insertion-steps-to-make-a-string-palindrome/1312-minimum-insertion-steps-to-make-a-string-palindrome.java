class Solution {
    public int minInsertions(String s) {
         int n = s.length();

      
      StringBuilder s2 = new StringBuilder(s).reverse();
      
      int[][]dp = new int[n+1][n+1];
      for(int arr[]:dp)Arrays.fill(arr,-1);
     
      String str = s2.toString();
      // return n - count(s,s2.toString(),n,n,dp);
      
      // tabulation :
      
      for(int i=0;i<=n;i++) 
      {
        dp[i][0]=0;
        dp[0][i]=0;
      }
      
      for(int i= 1 ; i<=n ; i++)
      {
        for(int j=1;j<=n ; j++)
        {
          if(s.charAt(i-1)==str.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
          else dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
        }
      }
      return n-dp[n][n];
    }
   /*int count(String s1 , String s2 , int n , int m , int[][]dp)
  {
    if(n==0 || m==0) return 0;
    if(dp[n][m]!=-1)return dp[n][m];
    
    
    if(s1.charAt(n-1)==s2.charAt(m-1)) return dp[n][m] = 1+ count(s1,s2,n-1,m-1,dp);
    else return dp[n][m] = Math.max(count(s1,s2,n,m-1,dp),count(s1,s2,n-1,m,dp));
  }*/
}