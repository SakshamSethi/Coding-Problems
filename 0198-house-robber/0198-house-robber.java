class Solution {
    public int rob(int[] nums) {
        
      int[]dp = new int[nums.length];
      Arrays.fill(dp,-1);
      return robbing(nums,0,dp);
    }
  int robbing(int[]nums , int i , int[]dp)
  {
    if(i==nums.length-1) return nums[i];
    if(i>nums.length-1) return 0;
    
    if(dp[i]!=-1)return dp[i];
    
    int take = -1 ;
    
    if(i<nums.length-1) take =nums[i] + robbing(nums,i+2,dp);
  
    int notTake = robbing(nums,i+1,dp);
    
    return dp[i]=Math.max(take,notTake);
    
  }
}