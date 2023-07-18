class Solution {
    public int change(int amount, int[] coins) {
      
      int n = coins.length ;
      int[][]dp = new int[n][amount+1];
      
      for(int[] arr : dp ) Arrays.fill(arr,-1);
      
      return count(coins,n-1,amount,dp);
      
    }
  
  int count(int[]coins  , int n , int amount,int[][]dp)
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
    
  }
  
}