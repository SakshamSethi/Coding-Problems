class Solution {
    public int countNegatives(int[][] grid) {
        
      int count = 0;
      int n = grid[0].length;
      int m = grid.length;
      int startRow = 0;
      int endCol = n-1;
      
      while(startRow<m && endCol>=0)
      {
        if(grid[startRow][endCol]<0) 
        {
          count += (m-startRow);
          endCol--;
        }
        else
        {
          startRow++;
        }
      }
      
      return count;
    }
}