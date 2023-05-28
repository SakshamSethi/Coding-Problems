    
    class Solution {
   
    /*public int fib(int n) {
        
        return f(n);
    }
    static int f(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        
        return f(n-1)+f(n-2);
    }*/
    
    
    // DP solution : MEMOIZATION : Top-Down Approach
    
  /*int[] dp = new int[31];
    
    public int fib(int n)
    {
        if(n<=1)
            return n;
        
        else if(dp[n]!=0)
            return dp[n];
        
        else 
            return dp[n]= fib(n-1)+fib(n-2);
    }
    */
    
        // Using Tabulation
        
 /*       public int fib(int n)
        {
            if(n==0)return 0;
            if(n==1)return 1;
            
            int[] dp = new int[n+1];
            
            
            Arrays.fill(dp,-1);
            dp[0]=0;
            dp[1]=1;
            
            for(int i=2; i<=n; i++)
            {
                dp[i]= dp[i-1]+dp[i-2];
            }
           
            return dp[n];
        }
      */  
        // const space 
        
   
            public int fib(int n)
        {
            if(n==0)return 0;
            if(n==1)return 1;
            
           int prev =1 ;
     int prev2 =0;
     int cur =0;
           
            for(int i=2; i<=n; i++)
            {
                cur = prev + prev2;
                prev2 = prev;
                prev=cur;
            }
           
            return prev;
        }
}




