class Solution {
    public int maxProfit(int[] prices) {
      
      int profit = 0 ;
      int mini = prices[0] ;
      int n = prices.length;
      for(int i =1 ; i<n;i++)
      {
        
        int cost = prices[i] - mini ;
        if(cost<0) mini = prices[i];
        profit = Math.max(profit,cost);
        
      
        
      }
      return profit;
    }
}