class Solution {
    public int uniquePaths(int m, int n) {
        
        /*int[][]dp = new int[m][n];
         for(int[] arr : dp)Arrays.fill(arr,-1);
        return solve(0,0,m-1,n-1,dp);
        */
        
        //Tabulation :
        
        int[][]dp = new int[m][n];
        for(int i=0 ; i<m ; i++)
            dp[i][n-1]=1;
        
        for(int i=0 ; i<n ; i++)
            dp[m-1][i]=1;
        
        for(int i=m-2 ; i>=0 ; i--)
        {
            for(int j=n-2 ; j>=0 ; j--)
            {
                dp[i][j] = dp[i+1][j]+dp[i][j+1];
            }
        }
        return dp[0][0];
    
    }
   /* int solve(int  i , int j , int m , int n,int[][]dp)
    {
        if(i==m || j==n) return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        int down = solve(i+1,j,m,n,dp);
        int right = solve(i,j+1,m,n,dp);
        
        return dp[i][j] = down+right;
        
    }*/
}