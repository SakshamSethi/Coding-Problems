class Solution {
    public int climbStairs(int n) {
        
        int[]dp = new int[n+1];
        
        return solve(n,dp);
    }
    int solve(int n,int[]dp)
    {
        if(n==0) return 1;
        if(n==1)return 1 ;
        if(dp[n]!=0)return dp[n] ;
        int oneStep = solve(n-1,dp);
        int twoSteps = solve(n-2,dp);
        
        return dp[n] = oneStep + twoSteps ;
        
        
    }
}