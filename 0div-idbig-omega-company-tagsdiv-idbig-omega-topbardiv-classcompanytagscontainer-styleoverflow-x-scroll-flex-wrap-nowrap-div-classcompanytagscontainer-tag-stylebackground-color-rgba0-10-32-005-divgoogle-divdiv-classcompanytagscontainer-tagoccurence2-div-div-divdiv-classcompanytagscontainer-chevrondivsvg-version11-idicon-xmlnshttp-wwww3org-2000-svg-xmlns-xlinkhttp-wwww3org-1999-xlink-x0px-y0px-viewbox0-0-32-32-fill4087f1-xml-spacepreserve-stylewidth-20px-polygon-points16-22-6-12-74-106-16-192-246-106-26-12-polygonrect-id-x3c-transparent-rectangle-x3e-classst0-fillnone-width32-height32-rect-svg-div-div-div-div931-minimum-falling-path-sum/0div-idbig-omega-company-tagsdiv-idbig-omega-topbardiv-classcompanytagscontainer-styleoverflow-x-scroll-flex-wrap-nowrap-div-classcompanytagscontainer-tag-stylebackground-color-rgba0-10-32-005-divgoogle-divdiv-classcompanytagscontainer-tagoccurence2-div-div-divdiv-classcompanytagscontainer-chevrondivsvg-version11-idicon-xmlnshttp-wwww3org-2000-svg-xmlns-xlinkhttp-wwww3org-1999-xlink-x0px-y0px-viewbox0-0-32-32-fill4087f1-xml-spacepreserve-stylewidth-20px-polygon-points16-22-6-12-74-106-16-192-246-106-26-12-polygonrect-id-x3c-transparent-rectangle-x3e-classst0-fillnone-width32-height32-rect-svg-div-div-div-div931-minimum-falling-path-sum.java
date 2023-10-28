class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int minimumSum = Integer.MAX_VALUE;
        
        int n= matrix.length;
        int[][]dp = new int[n][n];
        
        for(int[] arr : dp) Arrays.fill(arr,-101);
        
        for(int i=0 ; i<n ; i++)
        {
            minimumSum = Math.min(minimumSum,process(matrix,0,i,dp));
        }
        return minimumSum;
        
    }
    int process(int[][]matrix , int i , int j ,int[][]dp)
    {
      
      
        if(j<0 || j>=matrix.length) return  (int)1e8 ;
        if(i==matrix.length-1) return matrix[i][j];
          if(i>=matrix.length)return 0;
        
        
        if(dp[i][j]!=-101)return dp[i][j];
        
        int leftDiagonal  = matrix[i][j] + process(matrix,i+1,j-1,dp);
        int rightDiagonal  = matrix[i][j] + process(matrix,i+1,j+1,dp);
        int down =  matrix[i][j] + process(matrix,i+1,j,dp);
        
        return dp[i][j]= Math.min(down , Math.min(leftDiagonal , rightDiagonal));
    }
}