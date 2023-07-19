class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
      
      int i1 = s1.length();
      int i2 = s2.length();
      int[][]dp = new int[i1][i2];
      for(int arr[] : dp) Arrays.fill(arr,-1);
      return count(s1,s2,i1-1,i2-1,dp);
      
    }
  int count(String s1 , String s2 , int i1 , int i2,int[][]dp)
  {
    if(i1<0 || i2<0)return 0;
    
    if(dp[i1][i2]!=-1)return dp[i1][i2];
    
    if(s1.charAt(i1)==s2.charAt(i2)) return dp[i1][i2]=1 + count(s1,s2,i1-1,i2-1,dp);
    
    else return dp[i1][i2] = Math.max(count(s1,s2,i1-1,i2,dp),count(s1,s2,i1,i2-1,dp));
  }
}