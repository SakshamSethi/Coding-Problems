class Solution {

    public int fib(int n) {
        
        if(n==0)return 0;
    //int[]dp = new int[n+1];
       // return solve(n,dp);
      
        //Tabulation
        /*
        int[]dp = new int[n+1];
        
        dp[0]=0;
        dp[1]=1;
        for(int i=2 ; i<=n ; i++)
        {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
        */
        
        // Space optimized solution :
        
        int prev2 =0 ;
        int prev1 = 1;
        int cur =0;
        
        for(int i=2 ; i<=n ; i++)
        {
            cur = prev1 + prev2;
            
            prev2 = prev1;
            prev1 = cur ;
            
        }
        return prev1;
        
    }
    /*int solve(int n , int[]dp)
    {
         if(n<=1) return n;
        if(dp[n]!=0)return dp[n];
        return dp[n]= fib(n-1)+fib(n-2);
    }*/
}