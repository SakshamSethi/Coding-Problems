class Solution {
  int ans = Integer.MAX_VALUE;
    public int numSquares(int n) {
       
      int[]dp = new int[n+1];
   Arrays.fill(dp,-1);
      return count(n,dp);
    }
  int count(int n , int[]dp)
  {
 if(n==0)return 0;
    if(dp[n]!=-1) return dp[n];
    for(int i=1 ; i*i<=n ; i++)
    {
      
      ans = Math.min(ans , count(n-(i*i),dp )+1 );
      
    }
    return dp[n]= ans;
    
  }
}