class Solution {
    public int maxProfit(int[] prices) {
      
      int n = prices.length;
      /*int[][][]dp = new int[n][2][3];
      
      for(int arr[][] : dp )
      {
        for(int[]a : arr)
          Arrays.fill(a,-1);
      }
      */
     // return count(prices,0,1,2,dp);
      
      // Tabulation :
      int[][][]dp = new int[n+1][2][3];
      for(int i=0 ; i<=n;i++)
      {
        for(int j =0 ; j<2;j++)
        {
          dp[i][j][0]=0;
        }
      }
      
      for(int i=0;i<2;i++)
      {
        for(int j=0;j<3;j++)
        {
          dp[n][i][j]=0;
        }
      }
      
      for(int i=n-1;i>=0;i--)
      {
        for(int buy=0;buy<2;buy++)
        {
          for(int cap=1;cap<3;cap++)
          {
             int profit = 0;
           if(buy==1)
        {
      profit = Math.max(-prices[i]+dp[i+1][0][cap], dp[i+1][1][cap] );
      
    }
    else
    {
      profit= Math.max(prices[i]+dp[i+1][1][cap-1] ,dp[i+1][0][cap]);
    }
       dp[i][buy][cap]=profit;
          }
        }
      }
      return dp[0][1][2];
    }
 /* int count(int[]prices,int i , int buy , int cap,int[][][]dp)
  {
    
    if(cap==0)return 0 ;
    if(i==prices.length)return 0;
    
    if(dp[i][buy][cap]!=-1) return dp[i][buy][cap];
    
    int profit = 0;
    if(buy==1)
    {
      profit = Math.max(-prices[i]+count(prices,i+1,0,cap,dp),count(prices,i+1,1,cap,dp) );
      
    }
    else
    {
      profit= Math.max(prices[i]+count(prices,i+1,1,cap-1,dp),count(prices,i+1,0,cap,dp));
    }
      return dp[i][buy][cap]=profit;
      
      
      
    
  }*/
}