class Solution {
    public int change(int amount, int[] coins) {
      
      int n = coins.length ;
      int[][]dp = new int[n][amount+1];
      
      for(int[] arr : dp ) Arrays.fill(arr,-1);
      
     // return count(coins,n-1,amount,dp);
      
      //TABULATION : BOTTOM-UP
      
      for(int i=0;i<=amount;i++) 
      {
        if(i%coins[0]==0)
        {
          dp[0][i] = 1;
        }
        
      else  dp[0][i] = 0;
      
      }
      
      for(int i=1;i<n;i++)
      {
        for(int j = 0 ; j<=amount ; j++)
        {
          int take = 0 ;
    
    if(j>=coins[i]) take = dp[i][j-coins[i]];
    
    int notTake = dp[i-1][j];
    
    dp[i][j]=take+notTake;
        }
        
      }
      return dp[n-1][amount];
    }
  
  /*int count(int[]coins  , int n , int amount,int[][]dp)
  {
    
    if(n==0)
    {
      if(amount%coins[0]==0) return 1;
      else return 0;
      
      
    }
    if(dp[n][amount]!=-1)return dp[n][amount];
  
    int take = 0 ;
    
    if(amount>=coins[n]) take = count(coins,n,amount-coins[n],dp);
    
    int notTake = count(coins,n-1,amount,dp);
    
    return dp[n][amount]=take+notTake;
    
  }*/
  
}