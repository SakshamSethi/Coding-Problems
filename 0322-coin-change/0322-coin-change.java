class Solution {
    public int coinChange(int[] coins, int amount) {
    if(amount==0)return 0;
      int n = coins.length;
    if(n==1 && amount%coins[0]!=0) return -1;
      
      
      int[][]dp = new int[n][amount+1];
      for(int arr[] : dp) Arrays.fill(arr,-1);
      
      
      int ans = count(coins , n-1 , amount,dp);
      if(ans>=(int)1e7) return -1;
      return ans;
    }
  int count(int[]coins , int n ,int amount,int[][]dp)
  {
    
    if(n==0)
    {
      
      if(amount%coins[0]==0) return amount/coins[0];
      else return (int)1e7;
    }
    if(dp[n][amount]!=-1)return dp[n][amount];
    
    int take = Integer.MAX_VALUE;
    
    if(amount>=coins[n]) take = 1 + count(coins,n,amount-coins[n],dp);
    
    int notTake = 0 + count(coins,n-1,amount,dp);
    
    return dp[n][amount]= Math.min(take,notTake);
    
    
    
  }
}