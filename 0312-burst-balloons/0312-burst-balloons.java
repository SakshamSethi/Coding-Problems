class Solution {
    public int maxCoins(int[] nums) {
      int n=nums.length;  
      int arr[] = new int[n+2];
      int[][]dp = new int[n+2][n+2];
      //for(int[]a:dp)Arrays.fill(a,-1);
      for(int i=0;i<n;i++)
      {
        arr[i+1]=nums[i];
      }
      arr[0]=1;
      arr[n+1]=1;
     // return f(arr , 1 , n,dp);
    
      //tabulation :
      
      for(int i = n ; i>=1 ;i--)
      {
        for(int j=1 ; j<=n ; j++)
        {
          if(i>j)continue;
          
        int maxi = Integer.MIN_VALUE;
    
    for(int k = i ; k<=j ; k++)
    {
      int cost = (arr[i- 1] * arr[k] * arr[j+ 1]) + dp[i][k-1] + dp[k+1][j];
       maxi = Math.max(maxi,cost);
    }
    dp[i][j]= maxi;
          
          
        }
      }
    return dp[1][n];
    }
  /*int f(int[]nums,int i , int j ,int[][]dp )
  {
    if(i>j)return 0;
    if(dp[i][j]!=-1)return dp[i][j];
    int maxi = Integer.MIN_VALUE;
    
    for(int k = i ; k<=j ; k++)
    {
      int cost = (nums[i- 1] * nums[k] * nums[j+ 1]) + f(nums,i,k-1,dp) +f(nums,k+1,j,dp);
       maxi = Math.max(maxi,cost);
    }
    return dp[i][j]= maxi;
  }*/
}