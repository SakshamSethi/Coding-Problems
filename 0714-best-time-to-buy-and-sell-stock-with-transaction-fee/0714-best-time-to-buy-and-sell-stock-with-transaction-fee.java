class Solution {
    public int maxProfit(int[] prices, int fee) {
         int n = prices.length;
    //  int[][]dp = new int[n][2];
      //for(int [] arr : dp ) Arrays.fill(arr,-1);
   //   return count(prices , 0 , 1,dp , fee); 
  
    /*  int[][]dp = new int[n+1][2];
      
      for(int i=n-1;i>=0;i--)
      {
       
    
      dp[i][1] = Math.max( (-prices[i]+ dp[i+1][0]-fee) , dp[i+1][1]);
    
    
    
      dp[i][0] = Math.max(prices[i]+ dp[i+1][1], dp[i+1][0]) ;
      
    
        }
      
  return dp[0][1];
    }
  */
  //space optimization :
  
      int[]ahead = new int[2];
      int[]cur = new int[2];
      for(int i=n-1;i>=0;i--)
      {
       
    
      cur[1] = Math.max( (-prices[i]+ ahead[0]-fee) , ahead[1]);
    
    
    
      cur[0] = Math.max(prices[i]+ ahead[1], ahead[0]) ;
      
    ahead=cur;
        }
      
  return ahead[1];
  
    }
  
 /*  int count(int[] prices , int i , int buy , int[][]dp,int fee)
  {
    
    if(i>=prices.length) return 0 ; 
    
    if(dp[i][buy]!=-1)return dp[i][buy];
    
    int profit = 0;
    if(buy==1)
    {
      profit = Math.max(-prices[i]+count(prices,i+1,0,dp,fee)-fee , 0+count(prices,i+1,1,dp,fee));
    }
    else
    {
      profit= Math.max(prices[i]+count(prices,i+1,1,dp,fee),count(prices,i+1,0,dp,fee));
      
    }
    return dp[i][buy]= profit;
  } */
}