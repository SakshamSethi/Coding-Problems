class Solution {
    public int maxProfit(int k, int[] prices) {
          int n = prices.length;
      /*int[][][]dp = new int[n][2][k+1];
      
      for(int arr[][] : dp )
      {
        for(int[]a : arr)
          Arrays.fill(a,-1);
      }
      
      return count(prices,0,1,k,dp);
    */
      
      
      // Direct most optimised version :
       //iska space optimize 
      int[]ahead = new int [(2*k)+1];
            int[]cur = new int [(2*k)+1];

      for(int i=n-1;i>=0;i--)
      {
        for(int trans=(2*(k))-1; trans>=0;trans--)
        {
            int profit =0;
    
    if(trans%2==0)
    {
      profit = Math.max(-prices[i]+ahead[trans+1],ahead[trans]);
    }
    else
    {
      profit=Math.max(prices[i]+ahead[trans+1],ahead[trans]);
    }
     cur[trans]=profit;
        }
        ahead=cur;
      }
    return ahead[0];
      
    }
      
      
      
    /*int count(int[]prices,int i , int buy , int cap,int[][][]dp)
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