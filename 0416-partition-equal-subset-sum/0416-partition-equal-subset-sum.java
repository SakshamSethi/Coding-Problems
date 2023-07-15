class Solution {
    public boolean canPartition(int[] nums) {
      
      
      
      int sum =0;
      for(int i : nums) sum+=i;
if(sum%2==1) return false;
      
      int[][] dp = new int[nums.length][sum+1];
      
      for(int[] arr : dp)
      {
        
        
          Arrays.fill(arr,-1);
        
      }
      
      
   return check(nums,nums.length-1,sum/2,dp);  
      
    }
  
  boolean check(int[]nums,int n ,int target,int[][] dp) 
  {
    if(target==0) return true;
    
    if(n==0) return (target-nums[0]==0);
    
    if(dp[n][target]!=-1)return dp[n][target]==0?false:true;
    
    boolean take = false;
    
    if(target>=nums[n]) take = check(nums,n-1,target-nums[n],dp);
    
    boolean notTake = check(nums,n-1,target,dp);
  
    dp[n][target]=(take||notTake)?1:0;
    
    return (take || notTake);
  }
  
}