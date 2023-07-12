class Solution {
    public int rob(int[] nums) {
        
      return calc(nums);
    }
  
  int calc(int[] nums)
  {
    int n = nums.length -1 ;
      
    int[] dp = new int[n+1];
    dp[0] =nums[0];
    
    for(int i=1;i<=n;i++)
    {
      int take = nums[i];
      if(i>1) take+=dp[i-2];
      
      int nottake = dp[i-1];
      
      dp[i] = Math.max(take,nottake);
    } 
    return dp[n];
  }
  
}