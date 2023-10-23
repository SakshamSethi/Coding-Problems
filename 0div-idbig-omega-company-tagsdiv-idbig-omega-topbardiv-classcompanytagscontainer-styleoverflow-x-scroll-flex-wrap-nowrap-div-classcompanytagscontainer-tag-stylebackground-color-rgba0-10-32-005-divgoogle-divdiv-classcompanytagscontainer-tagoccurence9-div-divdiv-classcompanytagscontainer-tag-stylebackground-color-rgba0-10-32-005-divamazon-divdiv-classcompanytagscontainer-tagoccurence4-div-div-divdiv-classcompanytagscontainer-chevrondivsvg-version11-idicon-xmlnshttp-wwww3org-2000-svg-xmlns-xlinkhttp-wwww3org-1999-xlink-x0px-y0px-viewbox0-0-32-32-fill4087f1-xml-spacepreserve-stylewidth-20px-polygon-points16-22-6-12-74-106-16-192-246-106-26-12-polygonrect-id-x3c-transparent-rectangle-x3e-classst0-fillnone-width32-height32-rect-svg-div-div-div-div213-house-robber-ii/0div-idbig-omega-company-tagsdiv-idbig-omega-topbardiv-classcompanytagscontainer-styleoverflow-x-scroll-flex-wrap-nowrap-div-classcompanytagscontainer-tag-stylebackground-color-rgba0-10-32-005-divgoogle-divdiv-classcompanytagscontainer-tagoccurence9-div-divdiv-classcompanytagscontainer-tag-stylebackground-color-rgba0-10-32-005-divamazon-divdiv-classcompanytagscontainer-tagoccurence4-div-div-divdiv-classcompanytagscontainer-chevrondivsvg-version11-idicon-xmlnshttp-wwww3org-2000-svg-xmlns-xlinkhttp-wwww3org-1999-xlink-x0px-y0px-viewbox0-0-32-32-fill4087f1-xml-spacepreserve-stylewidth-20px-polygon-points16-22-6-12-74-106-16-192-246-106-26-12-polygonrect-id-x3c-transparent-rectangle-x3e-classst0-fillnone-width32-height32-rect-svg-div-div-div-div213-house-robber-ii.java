class Solution {
    public int rob(int[] arr) {
        
        
        
        int n = arr.length-1;
        if(n==0) return arr[0];
        if(n==1) return Math.max(arr[0] , arr[1]);
       
        int[]dp = new int[n+1];
        Arrays.fill(dp,-1);
        int First = solve(arr , 0,n-1 , dp);
         Arrays.fill(dp,-1);
        int Second = solve(arr,1,n,dp) ;
        return Math.max(First,Second);
    }
    int solve(int[]arr , int i , int n  , int[]dp)
    {
        if(i==n)return arr[i];
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        
        
        // taking an element
        int Take  = arr[i] + solve(arr,i+2 ,n, dp);
        
        //notTaking
        int notTake = solve(arr,i+1,n,dp);
        
        return dp[i] = Math.max(Take , notTake);
        
    }
    
}