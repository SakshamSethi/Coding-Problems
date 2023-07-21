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
      /*int[][][]dp = new int[n+1][2][3];
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
    */
      
      // space optimized :
     
      /* int[][]after = new int[2][3];
      int[][]cur= new int[2][3];

      
      for(int i=n-1;i>=0;i--)
      {
        for(int buy=0;buy<2;buy++)
        {
          for(int cap=1;cap<3;cap++)
          {
             int profit = 0;
           if(buy==1)
        {
      profit = Math.max(-prices[i]+after[0][cap], after[1][cap] );
      
    }
    else
    {
      profit= Math.max(prices[i]+after[1][cap-1] ,after[0][cap]);
    }
       cur[buy][cap]=profit;
          }
        }
        after=cur;
      }
      return after[1][2];
     */ 
    
    
    
    // n x 4 solution :
      
     // int[][]dp = new int[n][4];
    
      //for(int[]arr:dp)Arrays.fill(arr,-1);
      
      //return count2(prices,0,0,dp);
    // iska tabulation :
      
      /*int[][]dp = new int[n+1][5];
      for(int i=0;i<=n;i++)dp[i][4]=0;
      for(int i=0;i<5;i++) dp[0][i]=0;
      for(int i=n-1;i>=0;i--)
      {
        for(int trans=3; trans>=0;trans--)
        {
            int profit =0;
    
    if(trans%2==0)
    {
      profit = Math.max(-prices[i]+dp[i+1][trans+1],dp[i+1][trans]);
    }
    else
    {
      profit=Math.max(prices[i]+dp[i+1][trans+1],dp[i+1][trans]);
    }
     dp[i][trans]=profit;
        }
      } */
    //return dp[0][0];
      
      //iska space optimize 
      int[]ahead = new int [5];
            int[]cur = new int [5];

      for(int i=n-1;i>=0;i--)
      {
        for(int trans=3; trans>=0;trans--)
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
  /*int count2(int[]p , int i , int trans , int[][]dp)
  {
    if(i==p.length || trans==4 ) return 0;
    
    if(dp[i][trans]!=-1) return dp[i][trans];
    
    int profit =0;
    
    if(trans%2==0)
    {
      profit = Math.max(-p[i]+count2(p,i+1,trans+1,dp),count2(p,i+1,trans,dp));
    }
    else
    {
      profit=Math.max(p[i]+count2(p,i+1,trans+1,dp),count2(p,i+1,trans,dp));
    }
    return dp[i][trans]=profit;
  } */
  
  
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