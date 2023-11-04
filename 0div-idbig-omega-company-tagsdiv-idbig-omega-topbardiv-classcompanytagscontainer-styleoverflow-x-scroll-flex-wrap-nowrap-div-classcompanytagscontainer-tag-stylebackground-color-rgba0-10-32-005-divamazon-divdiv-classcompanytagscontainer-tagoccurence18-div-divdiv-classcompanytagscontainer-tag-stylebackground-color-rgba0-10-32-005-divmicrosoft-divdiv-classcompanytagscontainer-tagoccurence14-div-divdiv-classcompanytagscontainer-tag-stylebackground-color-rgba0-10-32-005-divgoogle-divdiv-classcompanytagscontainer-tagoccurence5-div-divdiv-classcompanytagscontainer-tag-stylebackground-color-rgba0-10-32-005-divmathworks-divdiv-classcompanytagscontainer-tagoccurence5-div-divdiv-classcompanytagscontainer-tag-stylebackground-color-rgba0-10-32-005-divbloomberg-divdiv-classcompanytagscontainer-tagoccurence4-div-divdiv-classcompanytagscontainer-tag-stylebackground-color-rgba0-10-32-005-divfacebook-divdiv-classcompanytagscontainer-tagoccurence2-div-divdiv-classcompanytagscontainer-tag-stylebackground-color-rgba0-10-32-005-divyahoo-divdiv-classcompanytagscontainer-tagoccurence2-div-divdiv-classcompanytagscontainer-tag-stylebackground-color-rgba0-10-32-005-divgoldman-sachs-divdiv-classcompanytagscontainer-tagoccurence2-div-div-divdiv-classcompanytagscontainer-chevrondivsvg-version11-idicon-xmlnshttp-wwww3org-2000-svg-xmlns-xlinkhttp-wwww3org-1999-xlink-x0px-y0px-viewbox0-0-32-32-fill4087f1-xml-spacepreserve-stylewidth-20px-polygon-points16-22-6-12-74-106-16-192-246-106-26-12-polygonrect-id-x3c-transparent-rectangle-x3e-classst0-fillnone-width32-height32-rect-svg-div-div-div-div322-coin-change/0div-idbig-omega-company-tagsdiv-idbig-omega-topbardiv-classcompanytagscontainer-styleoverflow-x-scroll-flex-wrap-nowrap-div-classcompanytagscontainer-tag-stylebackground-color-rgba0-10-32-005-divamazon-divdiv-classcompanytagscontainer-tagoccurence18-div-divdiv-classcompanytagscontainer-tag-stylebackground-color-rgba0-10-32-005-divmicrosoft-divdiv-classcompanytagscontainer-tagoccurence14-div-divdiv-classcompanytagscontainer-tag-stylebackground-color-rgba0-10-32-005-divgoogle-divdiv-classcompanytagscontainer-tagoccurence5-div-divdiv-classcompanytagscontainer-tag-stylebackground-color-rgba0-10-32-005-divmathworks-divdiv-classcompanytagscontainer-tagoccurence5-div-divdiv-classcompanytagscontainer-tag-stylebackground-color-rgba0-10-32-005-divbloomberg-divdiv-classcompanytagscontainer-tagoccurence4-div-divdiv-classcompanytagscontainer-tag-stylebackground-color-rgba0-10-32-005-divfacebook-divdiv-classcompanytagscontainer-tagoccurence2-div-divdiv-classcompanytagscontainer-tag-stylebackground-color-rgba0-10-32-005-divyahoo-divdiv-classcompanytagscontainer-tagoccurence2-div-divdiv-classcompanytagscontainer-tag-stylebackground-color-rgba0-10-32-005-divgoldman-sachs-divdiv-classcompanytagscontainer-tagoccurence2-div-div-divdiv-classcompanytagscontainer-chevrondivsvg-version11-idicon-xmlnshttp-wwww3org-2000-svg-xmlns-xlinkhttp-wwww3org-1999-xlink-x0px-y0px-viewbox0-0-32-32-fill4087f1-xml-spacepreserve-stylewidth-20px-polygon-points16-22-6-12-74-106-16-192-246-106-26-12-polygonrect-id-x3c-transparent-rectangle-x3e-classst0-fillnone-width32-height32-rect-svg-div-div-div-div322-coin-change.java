class Solution {
    public int coinChange(int[] coins, int amount) {
            if(amount==0)return 0;
            
        int[][]dp = new int[coins.length][amount+1];
        
        for(int[]arr:dp)Arrays.fill(arr,-1);
        
        int ans =func(coins , amount ,0,dp);
        
            return ans>=100000?-1:ans;
        
    }
    
    int func(int[]coins , int amount , int i , int[][]dp)
    {
        
        if(i==coins.length-1)
        { 
         return amount%coins[i]==0?amount/coins[i]:100000;
        }
        
        if(dp[i][amount]!=-1)return dp[i][amount];
        
        int take=100000;            
        if(amount>=coins[i]) take = 1 + func(coins,amount-coins[i],i,dp);
        
        
        int notTake = func(coins,amount,i+1,dp);
        
        
        return dp[i][amount]=Math.min(take,notTake);
        
        
        
    }
}