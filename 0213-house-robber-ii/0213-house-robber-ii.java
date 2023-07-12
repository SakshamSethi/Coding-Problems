class Solution {
    public int rob(int[] nums) {
        
      int n = nums.length-1;
      
      if(n==0) return nums[0];
      if(n==1) return Math.max(nums[0],nums[1]);
      
      int includeFirst = calc(nums,0,n-1);
      int includeLast = calc(nums,1,n);
      
      return Math.max(includeFirst,includeLast);
      
    }
  
  int calc(int[] nums,int begin,int end)
  {
    int n = nums.length-1 ;
      
    int[] dp = new int[n+1];
    dp[begin] =nums[begin];
    
    for(int i=begin+1;i<=end;i++)
    {
      int take = nums[i];
      if(i>1) take+=dp[i-2];
      
      int nottake = dp[i-1];
      
      dp[i] = Math.max(take,nottake);
    }
    return dp[end];
  }
  
}