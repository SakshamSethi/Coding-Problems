class Solution {
    public int maxProfit(int[] prices) {

      int n = prices.length;
      int[][]dp = new int[n][2];
      for(int [] arr : dp ) Arrays.fill(arr,-1);
      return count(prices , 0 , 1,dp );
    }
  int count(int[] prices , int i , int buy , int[][]dp)
  {
    
    if(i==prices.length) return 0 ; 
    if(dp[i][buy]!=-1)return dp[i][buy];
    int profit = 0;
    if(buy==1)
    {
      profit = Math.max(-prices[i]+count(prices,i+1,0,dp) , 0+count(prices,i+1,1,dp));
    }
    else
    {
      profit= Math.max(prices[i]+count(prices,i+1,1,dp),count(prices,i+1,0,dp));
      
    }
    return dp[i][buy]= profit;
  }
}