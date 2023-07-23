class Solution {
    public int maxCoins(int[] nums) {
      int n=nums.length;  
      int arr[] = new int[n+2];
      int[][]dp = new int[n+2][n+2];
      for(int[]a:dp)Arrays.fill(a,-1);
      for(int i=0;i<n;i++)
      {
        arr[i+1]=nums[i];
      }
      arr[0]=1;
      arr[n+1]=1;
      return f(arr , 1 , n,dp);
    }
  int f(int[]nums,int i , int j ,int[][]dp )
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
  }
}