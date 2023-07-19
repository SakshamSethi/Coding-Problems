class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
      
      int i1 = s1.length();
      int i2 = s2.length();
      int[][]dp = new int[i1+1][i2+1];
      for(int arr[] : dp) Arrays.fill(arr,-1);
    //  return count(s1,s2,i1,i2,dp);
    
      //TABULATION :
      
      for(int i=0;i<=i1;i++) dp[i][0]=0;
      for(int j=0;j<=i2;j++) dp[0][j]=0;
      
      for(int i=1;i<=i1;i++)
      {
        for(int j=1;j<=i2;j++)
        {
          if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
          
          else dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
        }
      }
    return dp[i1][i2];
    }
  /*int count(String s1 , String s2 , int i1 , int i2,int[][]dp)
  {
    if(i1==0 || i2==0)return 0;
    
    if(dp[i1][i2]!=-1)return dp[i1][i2];
    
    if(s1.charAt(i1-1)==s2.charAt(i2-1)) return dp[i1][i2]=1 + count(s1,s2,i1-1,i2-1,dp);
    
    else return dp[i1][i2] = Math.max(count(s1,s2,i1-1,i2,dp),count(s1,s2,i1,i2-1,dp));
  } */
}