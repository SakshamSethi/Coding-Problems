class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][]dp = new int[m][n];
        for(int[]arr:dp) Arrays.fill(arr,-1);
        return solve(grid , 0,0,m-1,n-1 , dp);
        
        
    }
    int solve(int[][]grid , int i , int j , int m ,int n , int[][]dp)
    {
        if(i>m || j >n || grid[i][j]==1)return 0;
        if(i==m&&j==n)return 1;
        if(dp[i][j]!=-1)return dp[i][j];
        
        int down = solve(grid,i+1,j,m,n,dp);
        int right = solve(grid,i,j+1,m,n,dp);
        return dp[i][j]=down+right;
    }
}