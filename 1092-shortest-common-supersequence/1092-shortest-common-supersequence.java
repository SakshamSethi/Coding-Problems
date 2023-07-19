class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
            int i1 = s1.length();
      int i2 = s2.length();
      int[][]dp = new int[i1+1][i2+1];
      for(int arr[] : dp) Arrays.fill(arr,-1);
  
      
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
      
      StringBuilder  ans  = new StringBuilder("");
      int i = i1 , j=i2;
      while(i>0 && j>0)
      {
        
        if(s1.charAt(i-1)==s2.charAt(j-1))
        {
          ans=ans.append(s2.charAt(j-1));
          i-- ;
          j--;
        }
        else if(dp[i-1][j]>dp[i][j-1])
        {
          ans=ans.append(s1.charAt(i-1));
          i--;
        }
        else
        {
          ans=ans.append(s2.charAt(j-1));
          j--;
        }
        
      }
      while(i>0)
      {
        ans=ans.append(s1.charAt(i-1));
        i--;
      }
          while(j>0)
      {
        ans = ans.append(s2.charAt(j-1));
        j--;
      }
return ans.reverse().toString();
    }
    
}