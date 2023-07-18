class Solution {
    public int findTargetSumWays(int[] nums, int target) {

      int n = nums.length;
      int sum=0;
      for(int x:nums) sum+=x;
      
      
      int s2 = (sum-target);

      if(s2%2!=0 || s2<0) return 0;
      
      int[][]dp = new int[n][(s2/2)+1];
      
      for(int[] arr: dp) Arrays.fill(arr,Integer.MIN_VALUE);
      
      return count(nums,s2/2,n-1,dp );
    }
  int count(int[]nums , int target , int n , int[][]dp )
  {
    
  if(n==0)
			{
				if(nums[n]==0 && target==0) return 2;
				if(target==0 || target == nums[0]) return 1;
				 return 0;
			}
    if(dp[n][target]!=Integer.MIN_VALUE)return dp[n][target];
    
    int take = 0 ;
    if(target>=nums[n]) take = count(nums,target-nums[n],n-1,dp);
    int notTake = count(nums,target,n-1,dp);
return take+notTake;
  }
}