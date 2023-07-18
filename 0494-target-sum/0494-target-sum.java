class Solution {
    public int findTargetSumWays(int[] nums, int target) {

      int n = nums.length;
      int sum=0;
      for(int x:nums) sum+=x;
      
      
      int s2 = (sum-target);

      if(s2%2!=0 || s2<0) return 0;
      
      return count(nums,s2/2,n-1 );
    }
  int count(int[]nums , int target , int n  )
  {
    
  if(n==0)
			{
				if(nums[n]==0 && target==0) return 2;
				if(target==0 || target == nums[0]) return 1;
				 return 0;
			}
    
    int take = 0 ;
    if(target>=nums[n]) take = count(nums,target-nums[n],n-1);
    int notTake = count(nums,target,n-1);
return take+notTake;
  }
}