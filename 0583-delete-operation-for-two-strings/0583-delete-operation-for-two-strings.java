class Solution {
    public int minDistance(String word1, String word2) {
      
      int n = word1.length();
      int m = word2.length();
      
      int[][] dp = new int[n+1][m+1];
      for(int[]arr : dp) Arrays.fill(arr,-1);
      
      int common = count(word1,word2,n,m,dp);
      
      return (n-common)+(m-common);
      
    }
  int count(String w1 , String w2 , int n , int m , int[][]dp)
  {
    if(n==0||m==0 )return 0;
    if(dp[n][m]!=-1) return dp[n][m];
    
    if(w1.charAt(n-1)==w2.charAt(m-1)) return dp[n][m] = 1 + count(w1,w2,n-1,m-1,dp);
    
    else return dp[n][m] = Math.max(count(w1,w2,n-1,m,dp) , count(w1,w2,n,m-1,dp));
    
  }
}