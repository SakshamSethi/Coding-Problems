class Solution {
    public int minPathSum(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length;
        int[][]dp = new int[m][n];
        
        for(int[]arr:dp) Arrays.fill(arr,-1);
        
        return solve(grid , 0,0 , dp);
        
    }
    int solve(int[][]grid , int i , int j , int[][]dp)
    {
        if(i==grid.length-1 && j==grid[0].length-1) return grid[i][j];
        if(i>=grid.length || j>=grid[0].length)return 210;
        if(dp[i][j]!=-1)return dp[i][j];
         
        int down = 0 , right =0;
          down = grid[i][j] + solve(grid , i+1 , j , dp);
        
         right = grid[i][j] + solve(grid,i,j+1,dp);
        
        return dp[i][j]= Math.min(down,right);
        
    }
}