class Solution {
    public int lengthOfLIS(int[] nums) {
      
      int n=nums.length;
      
      int[][]dp = new int[n+1][n+1];
      
      for(int[]arr:dp)Arrays.fill(arr,-1);
      
      return count(nums,1,0,dp);
      
    }
  int count(int[]nums, int i , int prev,int[][]dp)
  {
    if(i==nums.length+1)return 0;
    
    if(dp[i][prev]!=-1)return dp[i][prev];
    
    int notTake = count(nums,i+1,prev,dp);
    
    int take =0;
    
    if(prev==0|| nums[i-1]>nums[prev-1])
    {
      take = 1+count(nums,i+1,i,dp);
    }
    return dp[i][prev] = Math.max(take,notTake);
  }
}