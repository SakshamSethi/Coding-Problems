class Solution {
    public int longestPalindromeSubseq(String s) {
      
      int n = s.length();

      
      StringBuilder s2 = new StringBuilder(s).reverse();
      
      int[][]dp = new int[n+1][n+1];
      for(int arr[]:dp)Arrays.fill(arr,-1);
      return count(s,s2.toString(),n,n,dp);
      
      
    }
  
  int count(String s1 , String s2 , int n , int m , int[][]dp)
  {
    if(n==0 || m==0) return 0;
    if(dp[n][m]!=-1)return dp[n][m];
    
    
    if(s1.charAt(n-1)==s2.charAt(m-1)) return dp[n][m] = 1+ count(s1,s2,n-1,m-1,dp);
    else return dp[n][m] = Math.max(count(s1,s2,n,m-1,dp),count(s1,s2,n-1,m,dp));
  }
}