class Solution {
    public boolean canPartition(int[] nums) {
      
        int sum = 0;
        
        for(int ele : nums)sum+=ele;
        
        if(sum%2==1)return false;
        

        
        int target = sum/2;
        int n= nums.length;
        int[][]dp = new int[n][target+1];
        for(int[]arr:dp)Arrays.fill(arr,-1);
        return process(nums,0,n,target,dp);
        
    }
    boolean process(int[]nums,int i ,int n , int target , int[][]dp)
    {
        if(target==0)return true;
        if(i==n-1) return nums[i]==target ;
        
        if(dp[i][target]!=-1) return dp[i][target]==1?true:false;
        
        int num = nums[i];
        boolean take = false;
        
        if(nums[i]<=target) take = process(nums,i+1,n,target-num,dp);
        
        boolean notTake = process(nums,i+1,n,target,dp);
        
        dp[i][target] = (take||notTake)==true?1:0;
        
        return take||notTake;
        
        
    }
}