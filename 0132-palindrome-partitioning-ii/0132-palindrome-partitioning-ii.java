class Solution {
 static  private int[][] dpPalin;
    public int minCut(String s) {
      
      //int[]dp=new int[s.length()];
      //Arrays.fill(dp,-1);
      //return count(s,0,dp)-1; 
    
      int n = s.length();
      dpPalin = new int[n+1][n+1];
      int[]dp = new int[n+1];
      dp[n]=0;
      
      for(int i=n-1;i>=0;i--)
      {
       
        int mincost = Integer.MAX_VALUE;
        
        for(int j=i;j<n;j++)
        {
       
          if(isPalindrome(s,i,j))
          {
            int cost = 1 +dp[j+1];
            mincost=Math.min(cost,mincost);
          }
        }
        dp[i]=mincost;
      }
      return dp[0]-1;
      
    }
  /*int count(String s , int i ,int[]dp )
  {
    if(i==s.length())return 0;
    if(dp[i]!=-1)return dp[i];
  
    String temp="";
    int  mincost=Integer.MAX_VALUE; int cost=0;
    for(int j=i ; j<s.length() ;j++)
    {
      temp+=s.charAt(j);
      
      if(isPalindrome(temp))
      {
        cost =  count(s,j+1,dp)+1;
         mincost = Math.min(cost,mincost);
      }
     
    }
    return dp[i]=mincost;
    
  }*/

    private boolean isPalindrome(String s, int i, int j) {
        if(i>=j) return true;
        if(dpPalin[i][j] != 0) return dpPalin[i][j] == 1;
        else dpPalin[i][j] = (s.charAt(i) == s.charAt(j) && isPalindrome(s, i+1, j-1)) ? 1 : -1;
        return dpPalin[i][j] == 1;
    }
}