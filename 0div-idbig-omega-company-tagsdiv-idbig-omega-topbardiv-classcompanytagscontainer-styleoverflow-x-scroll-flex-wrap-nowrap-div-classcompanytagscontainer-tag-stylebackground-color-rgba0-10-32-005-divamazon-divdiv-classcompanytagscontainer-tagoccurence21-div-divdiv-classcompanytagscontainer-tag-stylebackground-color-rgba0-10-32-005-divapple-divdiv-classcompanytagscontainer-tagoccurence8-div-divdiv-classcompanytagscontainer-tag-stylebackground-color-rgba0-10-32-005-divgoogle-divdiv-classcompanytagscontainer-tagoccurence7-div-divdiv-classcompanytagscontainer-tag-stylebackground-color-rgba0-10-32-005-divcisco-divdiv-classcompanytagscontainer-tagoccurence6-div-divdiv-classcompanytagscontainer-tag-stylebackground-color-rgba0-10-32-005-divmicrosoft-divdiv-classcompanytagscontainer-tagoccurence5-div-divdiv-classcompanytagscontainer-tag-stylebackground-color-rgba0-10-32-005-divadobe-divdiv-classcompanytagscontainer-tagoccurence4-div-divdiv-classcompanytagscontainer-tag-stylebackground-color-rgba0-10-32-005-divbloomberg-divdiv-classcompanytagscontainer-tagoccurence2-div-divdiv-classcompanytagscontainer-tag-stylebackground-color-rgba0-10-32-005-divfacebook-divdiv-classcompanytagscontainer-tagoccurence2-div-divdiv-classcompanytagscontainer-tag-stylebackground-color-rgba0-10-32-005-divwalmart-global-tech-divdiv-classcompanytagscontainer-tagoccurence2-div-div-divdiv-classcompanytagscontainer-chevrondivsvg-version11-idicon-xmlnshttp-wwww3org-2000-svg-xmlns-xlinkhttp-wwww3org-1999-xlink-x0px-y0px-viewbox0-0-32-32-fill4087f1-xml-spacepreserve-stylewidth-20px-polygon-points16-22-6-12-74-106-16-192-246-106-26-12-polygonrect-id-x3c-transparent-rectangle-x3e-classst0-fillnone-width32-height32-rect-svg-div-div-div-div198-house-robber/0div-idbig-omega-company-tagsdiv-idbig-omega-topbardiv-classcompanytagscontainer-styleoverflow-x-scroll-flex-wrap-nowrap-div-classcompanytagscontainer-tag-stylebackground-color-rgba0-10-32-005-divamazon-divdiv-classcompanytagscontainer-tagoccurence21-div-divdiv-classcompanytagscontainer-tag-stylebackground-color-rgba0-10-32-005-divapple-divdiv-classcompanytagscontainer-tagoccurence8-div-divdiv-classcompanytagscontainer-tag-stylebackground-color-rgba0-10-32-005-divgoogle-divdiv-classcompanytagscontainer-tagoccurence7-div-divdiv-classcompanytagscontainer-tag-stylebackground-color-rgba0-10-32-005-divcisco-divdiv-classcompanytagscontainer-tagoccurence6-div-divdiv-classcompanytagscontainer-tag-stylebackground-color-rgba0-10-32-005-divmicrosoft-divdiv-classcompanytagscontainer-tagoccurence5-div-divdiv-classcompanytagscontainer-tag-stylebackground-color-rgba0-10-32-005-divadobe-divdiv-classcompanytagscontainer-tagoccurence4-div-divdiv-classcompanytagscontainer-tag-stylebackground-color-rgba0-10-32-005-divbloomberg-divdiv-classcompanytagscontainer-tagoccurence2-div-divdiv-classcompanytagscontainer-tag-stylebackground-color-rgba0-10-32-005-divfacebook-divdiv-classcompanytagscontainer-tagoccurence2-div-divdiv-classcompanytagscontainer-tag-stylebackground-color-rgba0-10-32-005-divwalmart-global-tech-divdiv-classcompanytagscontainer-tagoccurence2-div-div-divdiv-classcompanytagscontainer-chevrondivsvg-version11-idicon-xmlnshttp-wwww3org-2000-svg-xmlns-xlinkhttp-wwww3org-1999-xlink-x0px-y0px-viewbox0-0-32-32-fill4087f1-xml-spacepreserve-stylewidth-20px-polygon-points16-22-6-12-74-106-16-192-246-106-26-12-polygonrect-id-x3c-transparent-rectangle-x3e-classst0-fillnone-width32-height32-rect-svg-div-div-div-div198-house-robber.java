class Solution {
    public int rob(int[] nums) {
        //int[]dp = new int[nums.length+1];
        
      //   return solve(nums,0,dp);
    
    // Memoization ---> TLE 
        
        // Tabulation 
        
      
     /*   int n= nums.length;
        int[]dp = new int[n+1];
        dp[n-1]=nums[n-1];
        dp[n]=0;
        
        for(int i=n-2 ; i>=0;i--)
        {
            int take = nums[i]+dp[i+2];
            int notTake = 0 + dp[i+1];
            
            dp[i] = Math.max(take,notTake);
            
        }
        
        return dp[0];
    */
        
        int n = nums.length;
        int third = 0;
        int second = nums[n-1];
        int first =0 ;
        
        for(int i=n-2 ; i>=0 ; i--)
        {
            int take = nums[i]+third;
            int notTake = second;
            
            first = Math.max(take , notTake);
            third = second;             
            second = first ;
        }
        return second;
    
    }
   /* int solve(int[]nums  , int i , int[]dp)
    {
        if(i==nums.length-1)return nums[i];
        if(i>=nums.length)return 0;
        
        if(dp[i]!=0)return dp[i];
        int take = nums[i] + solve(nums,i+2,dp);
        int notTake = solve(nums,i+1,dp);
        
        return dp[i] = Math.max(take,notTake);
        
    }*/
}