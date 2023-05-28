    
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
    
  int[] dp = new int[31];
    
    public int fib(int n)
    {
        if(n<=1)
            return n;
        
        else if(dp[n]!=0)
            return dp[n];
        
        else 
            return dp[n]= fib(n-1)+fib(n-2);
    }
}




