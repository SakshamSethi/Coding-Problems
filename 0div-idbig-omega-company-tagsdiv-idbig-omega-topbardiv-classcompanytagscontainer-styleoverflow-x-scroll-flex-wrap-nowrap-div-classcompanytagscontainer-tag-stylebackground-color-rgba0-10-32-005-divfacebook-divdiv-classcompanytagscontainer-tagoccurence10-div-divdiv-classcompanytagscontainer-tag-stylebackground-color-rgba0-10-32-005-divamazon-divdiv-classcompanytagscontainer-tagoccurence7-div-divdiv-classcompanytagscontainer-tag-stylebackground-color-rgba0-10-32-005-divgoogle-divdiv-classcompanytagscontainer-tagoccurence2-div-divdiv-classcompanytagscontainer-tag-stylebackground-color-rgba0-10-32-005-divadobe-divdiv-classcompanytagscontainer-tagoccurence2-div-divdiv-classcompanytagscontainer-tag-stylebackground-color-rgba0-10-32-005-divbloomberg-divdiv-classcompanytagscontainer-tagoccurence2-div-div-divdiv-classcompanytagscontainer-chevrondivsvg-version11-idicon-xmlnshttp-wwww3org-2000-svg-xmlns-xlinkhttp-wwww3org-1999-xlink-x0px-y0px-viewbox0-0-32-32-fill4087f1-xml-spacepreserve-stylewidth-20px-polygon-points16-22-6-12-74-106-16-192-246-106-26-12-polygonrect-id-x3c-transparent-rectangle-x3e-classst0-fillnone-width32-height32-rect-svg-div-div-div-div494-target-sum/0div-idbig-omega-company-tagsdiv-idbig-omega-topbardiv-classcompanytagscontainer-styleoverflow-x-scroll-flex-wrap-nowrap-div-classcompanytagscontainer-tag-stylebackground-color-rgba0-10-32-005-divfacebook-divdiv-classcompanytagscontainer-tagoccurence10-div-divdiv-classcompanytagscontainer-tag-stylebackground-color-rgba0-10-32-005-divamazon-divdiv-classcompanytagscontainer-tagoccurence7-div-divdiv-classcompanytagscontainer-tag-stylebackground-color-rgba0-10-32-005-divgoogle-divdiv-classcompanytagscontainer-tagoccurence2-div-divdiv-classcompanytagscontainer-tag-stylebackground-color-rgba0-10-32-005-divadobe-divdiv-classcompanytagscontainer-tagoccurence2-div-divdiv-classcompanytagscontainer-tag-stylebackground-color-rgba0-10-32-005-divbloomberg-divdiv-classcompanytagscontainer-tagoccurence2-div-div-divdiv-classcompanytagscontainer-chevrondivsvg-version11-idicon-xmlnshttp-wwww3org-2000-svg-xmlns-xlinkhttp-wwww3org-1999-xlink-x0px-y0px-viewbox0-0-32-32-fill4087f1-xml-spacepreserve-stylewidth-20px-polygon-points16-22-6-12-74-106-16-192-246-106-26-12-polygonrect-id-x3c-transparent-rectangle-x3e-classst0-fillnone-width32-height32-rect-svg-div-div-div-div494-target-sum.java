class Solution {
    int total ;
    public int findTargetSumWays(int[] nums, int target) {
        
        total = Arrays.stream(nums).sum();
        
        int[][]dp = new int[nums.length][2*total+1];
        for(int[]arr:dp)Arrays.fill(arr,-1);
        
        return count(nums,target,0,0,dp);
        
    }
    int count (int[]nums, int target ,int i , int sum,int[][]dp)
    {
        if(i==nums.length)
        {
            return sum==target?1:0;
        }
        if(dp[i][sum+total]!=-1)return dp[i][sum+total];
        int ele = nums[i];
        int pos = count(nums,target,i+1,sum+ele,dp);
        int neg = count(nums,target,i+1,sum-ele,dp);
        return dp[i][sum+total]=pos+neg;
    }
}