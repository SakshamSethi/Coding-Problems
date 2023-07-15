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
      
      
   return check(nums,nums.length-1,0,sum,dp);  
      
    }
  
  boolean check(int[]nums,int n , int sum ,int target,int[][] dp) 
  {
    if(sum==target/2) return true;
    
    if(n==0) return (sum+nums[0]==target/2);
    
    if(dp[n][sum]!=-1)return dp[n][sum]==0?false:true;
    
    boolean take = check(nums,n-1,sum+nums[n],target,dp);
    boolean notTake = check(nums,n-1,sum,target,dp);
  
    dp[n][sum]=(take||notTake)?1:0;
    
    return (take || notTake);
  }
  
}