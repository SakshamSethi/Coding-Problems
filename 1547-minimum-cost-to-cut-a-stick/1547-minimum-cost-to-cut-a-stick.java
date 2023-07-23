class Solution {
    public int minCost(int n, int[] cuts) {
  
      int len = cuts.length;
      int[]arr = new int[len+2];
      arr[0]=0;
      arr[len+1]=n;
      Arrays.sort(cuts);
      for(int i=0 ; i<len;i++)
      {
        arr[i+1]=cuts[i];
      }
  int[][]dp = new int[len+2][len+2];
   //   for(int[] ar : dp) Arrays.fill(ar,-1);
    //  return f(1,len,arr,dp);
    
      //Tabulation :
      
     
      
      for(int i=len ; i>=1;i--)
      {
        for(int j=1 ;j<=len;j++)
        { 
          if(i>j)continue;
          int mini = Integer.MAX_VALUE;
          for(int ind = i ; ind<=j;ind++)
          {
           
            int cost = (arr[j+1]-arr[i-1]) + dp[i][ind-1] + dp[ind+1][j];
            mini = Math.min(mini,cost);
          }
          dp[i][j]=mini;
        }
        
      }
       
      return dp[1][len];
      
    }
  /*int f(int i , int j , int[]arr,int[][]dp)
  {
    
    if(i>j)return 0;
    
    if(dp[i][j]!=-1)return dp[i][j];
    
    int mini = Integer.MAX_VALUE;
    
    for(int len = i ; len<=j;len++)
    {
      int cost = (arr[j+1]-arr[i-1]) + f(i,len-1,arr,dp) + f(len+1,j,arr,dp);
    mini = Math.min(mini,cost);
    }
    return dp[i][j]=mini;
  }*/
}