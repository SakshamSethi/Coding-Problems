class Solution {
    public int change(int amount, int[] coins) {
        
        int n = coins.length;
        int[][]dp = new int[n][amount+1];
        for(int[]arr:dp)
        Arrays.fill(arr,-1);
        
        return func(coins,amount,n-1,dp);
    }
    int func(int coins[] , int amount , int n , int[][]dp)
    {
        if(n==0)
        {
            return amount%coins[0]==0?1:0;
        }
         
        
        if(dp[n][amount]!=-1)return dp[n][amount];
        int take=0;
        
        if(amount>=coins[n])
            take = func(coins,amount-coins[n],n,dp);
        
        int notTake =  func(coins,amount,n-1,dp);
        
        return dp[n][amount]=take+notTake;
    }
}