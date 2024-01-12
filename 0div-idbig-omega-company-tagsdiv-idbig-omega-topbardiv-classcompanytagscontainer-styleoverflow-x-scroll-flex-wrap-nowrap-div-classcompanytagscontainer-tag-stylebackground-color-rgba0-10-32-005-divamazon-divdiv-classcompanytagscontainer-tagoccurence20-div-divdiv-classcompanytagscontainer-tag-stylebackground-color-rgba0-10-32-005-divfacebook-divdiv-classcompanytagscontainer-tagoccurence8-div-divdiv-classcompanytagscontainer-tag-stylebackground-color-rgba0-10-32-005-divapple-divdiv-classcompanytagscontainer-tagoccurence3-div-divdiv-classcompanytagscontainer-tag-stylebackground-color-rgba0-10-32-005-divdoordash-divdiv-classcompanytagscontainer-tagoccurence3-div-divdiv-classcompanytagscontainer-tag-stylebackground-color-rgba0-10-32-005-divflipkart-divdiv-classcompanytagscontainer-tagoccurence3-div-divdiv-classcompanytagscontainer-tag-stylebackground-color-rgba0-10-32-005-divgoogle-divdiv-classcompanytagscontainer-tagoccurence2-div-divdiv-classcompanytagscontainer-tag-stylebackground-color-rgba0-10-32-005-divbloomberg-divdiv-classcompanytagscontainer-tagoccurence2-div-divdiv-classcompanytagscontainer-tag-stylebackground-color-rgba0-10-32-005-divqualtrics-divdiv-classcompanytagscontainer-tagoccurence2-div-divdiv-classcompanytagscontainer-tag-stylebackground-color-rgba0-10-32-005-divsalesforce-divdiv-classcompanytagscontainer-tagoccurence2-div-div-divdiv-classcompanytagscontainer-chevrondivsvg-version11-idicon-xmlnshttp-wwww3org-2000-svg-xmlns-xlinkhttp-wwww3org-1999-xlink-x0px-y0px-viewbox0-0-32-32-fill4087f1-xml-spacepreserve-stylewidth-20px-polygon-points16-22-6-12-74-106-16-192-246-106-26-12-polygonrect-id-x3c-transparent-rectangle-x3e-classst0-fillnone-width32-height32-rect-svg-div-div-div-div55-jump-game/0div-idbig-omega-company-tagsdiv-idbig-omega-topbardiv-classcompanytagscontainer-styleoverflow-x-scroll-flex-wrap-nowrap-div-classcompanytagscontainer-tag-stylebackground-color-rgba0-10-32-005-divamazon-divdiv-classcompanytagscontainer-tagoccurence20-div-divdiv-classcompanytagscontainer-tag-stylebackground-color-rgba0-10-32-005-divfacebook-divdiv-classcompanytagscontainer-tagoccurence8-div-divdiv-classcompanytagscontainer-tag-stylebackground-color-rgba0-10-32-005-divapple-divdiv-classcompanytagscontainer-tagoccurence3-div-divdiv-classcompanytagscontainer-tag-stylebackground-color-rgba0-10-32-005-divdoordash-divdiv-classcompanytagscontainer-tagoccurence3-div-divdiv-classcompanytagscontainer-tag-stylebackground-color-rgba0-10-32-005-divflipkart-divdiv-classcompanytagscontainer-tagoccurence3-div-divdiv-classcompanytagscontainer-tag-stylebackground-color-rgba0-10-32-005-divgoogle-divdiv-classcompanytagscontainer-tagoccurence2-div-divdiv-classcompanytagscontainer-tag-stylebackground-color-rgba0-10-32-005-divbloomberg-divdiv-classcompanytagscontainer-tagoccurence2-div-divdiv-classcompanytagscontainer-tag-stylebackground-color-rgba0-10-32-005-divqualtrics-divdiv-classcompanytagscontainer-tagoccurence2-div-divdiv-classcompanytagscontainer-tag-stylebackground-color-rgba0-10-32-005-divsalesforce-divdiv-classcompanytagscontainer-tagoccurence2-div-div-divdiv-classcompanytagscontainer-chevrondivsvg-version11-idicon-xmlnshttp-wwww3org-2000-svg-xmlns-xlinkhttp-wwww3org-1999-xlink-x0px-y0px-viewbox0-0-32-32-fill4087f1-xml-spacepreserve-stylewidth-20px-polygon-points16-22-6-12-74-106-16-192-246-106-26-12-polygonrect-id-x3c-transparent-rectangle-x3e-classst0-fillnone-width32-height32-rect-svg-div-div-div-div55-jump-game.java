class Solution {
    public boolean canJump(int[] nums) {
        
        int[]dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return jump(nums,0,nums.length-1,dp);
    }
    
    boolean jump(int[]nums,int i ,int n ,int[]dp)
    {
        if(i==n)
            return true;
        
        if(dp[i]!=-1)return dp[i]==1;
        
        int jumps = nums[i];
        
        for(int x = 1 ; x<=jumps ; x++)
        {
            if(jump(nums,i+x,n,dp))
            {
                dp[i]=1;
                return true;
            }
        }
        dp[i]=0;
        return false;
    }
}