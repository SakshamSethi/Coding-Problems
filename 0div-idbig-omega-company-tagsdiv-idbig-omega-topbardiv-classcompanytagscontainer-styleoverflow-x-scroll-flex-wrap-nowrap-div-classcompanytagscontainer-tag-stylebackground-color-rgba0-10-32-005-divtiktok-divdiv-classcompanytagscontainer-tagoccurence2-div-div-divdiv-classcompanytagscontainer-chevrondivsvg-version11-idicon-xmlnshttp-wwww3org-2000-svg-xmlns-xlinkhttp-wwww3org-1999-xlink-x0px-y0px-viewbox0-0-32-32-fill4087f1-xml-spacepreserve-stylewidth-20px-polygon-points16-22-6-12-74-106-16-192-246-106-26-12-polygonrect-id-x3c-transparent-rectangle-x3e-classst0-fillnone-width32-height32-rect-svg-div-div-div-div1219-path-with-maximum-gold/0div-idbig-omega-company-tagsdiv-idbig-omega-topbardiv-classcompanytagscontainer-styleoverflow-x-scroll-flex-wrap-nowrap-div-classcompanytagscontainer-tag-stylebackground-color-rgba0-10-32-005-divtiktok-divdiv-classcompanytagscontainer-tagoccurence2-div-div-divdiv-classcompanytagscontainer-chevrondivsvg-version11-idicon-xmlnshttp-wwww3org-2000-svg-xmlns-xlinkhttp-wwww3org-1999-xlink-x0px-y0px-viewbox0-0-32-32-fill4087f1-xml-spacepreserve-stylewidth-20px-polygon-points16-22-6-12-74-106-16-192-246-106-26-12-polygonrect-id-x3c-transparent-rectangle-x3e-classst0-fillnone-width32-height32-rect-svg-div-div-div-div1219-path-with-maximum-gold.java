class Solution {
    public int getMaximumGold(int[][] grid) {
        
        int maxGold = -1;
        for(int i=0; i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                maxGold = Math.max(maxGold , compute(grid,i,j));
                
            }
        }
        return maxGold;
    }
    int compute(int[][]grid , int i , int j )
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 )
            return 0;
        
        int val = grid[i][j];
        grid[i][j]=0;
        int left = val + compute(grid,i,j-1);
        
        int right = val + compute(grid,i,j+1);
        int up = val + compute(grid,i-1,j);
        int down = val + compute(grid,i+1,j);
            
        grid[i][j]=val;
        
        return Math.max(left,Math.max(right,Math.max(up,down)));
    }
}