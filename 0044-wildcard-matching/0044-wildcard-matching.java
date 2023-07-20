class Solution {
    public boolean isMatch(String s, String p) {
        
      int n = s.length();
      int m = p.length();
      int[][]dp = new int[n+1][m+1];
      for(int[]arr:dp)Arrays.fill(arr,-1);
      
      return match(s,p,n,m,dp);
    }
  boolean match(String s , String p , int n , int m,int[][]dp)
  {
    if(n==0 && m==0) return true ;
    
    if(m==0 && n>0) return false;
    
    if(n==0 && m>0) 
    {
      for(int i =0 ; i<m;i++)
      {
        if(p.charAt(i)!='*') return false;
      }
      return true;
    }
    if(dp[n][m]!=-1) {
      
      return  (dp[n][m] == 1)?true:false;
      
    }
    if(p.charAt(m-1)==s.charAt(n-1) || p.charAt(m-1)=='?')
      
    { 
      boolean ans = match(s,p,n-1,m-1,dp);
      dp[n][m] = ans==true?1:0;
    return ans;
    }
    
    else if(p.charAt(m-1)=='*')
    {
      boolean ans = (match(s,p,n,m-1,dp)||match(s,p,n-1,m,dp));
    dp[n][m] = ans==true?1:0;
    return ans;
    }
    else {
    
      dp[n][m]=0;
      return false ;
    }
  }
}