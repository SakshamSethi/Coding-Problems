class Solution {
    public int coinChange(int[] coins, int amount) {
    if(amount==0)return 0;
      int n = coins.length;
    
      
      
      int[][]dp = new int[n][amount+1];
      for(int arr[] : dp) Arrays.fill(arr,-1);
      
      
      //int ans = count(coins , n-1 , amount,dp);
      //if(ans>=(int)1e7) return -1;
    //  return ans;
    
    //Tabulation :
      
      for(int i=0;i<=amount;i++)
      {
      if(i%coins[0]==0) dp[0][i]=i/coins[0];  
      else  dp[0][i] = (int)1e7;
        
      }
      
    
  
  for(int i=1;i<n;i++)
  {
    for(int j=0;j<=amount;j++)
    {
      int take = Integer.MAX_VALUE;
    
    if(j>=coins[i]) take = 1 + dp[i][j-coins[i]] ;
    
    int notTake = 0 + dp[i-1][j];
      dp[i][j]= Math.min(take,notTake);
    }
  }
  
  if(dp[n-1][amount]>=(int)1e7) return -1;
  return dp[n-1][amount];
    }
  
  /*int count(int[]coins , int n ,int amount,int[][]dp)
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
    
    
    
  }*/
}