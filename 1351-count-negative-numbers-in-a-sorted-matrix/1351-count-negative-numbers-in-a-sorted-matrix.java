class Solution {
    public int countNegatives(int[][] grid) {
        int r =0; int n=grid.length;
        int c=grid[0].length-1;
        int count=0;
        while(r<n && c>=0)
        {
            if(grid[r][c]<=-1)
            {
                count+=n-r;
                c--;
            }
            else if (grid[r][c]>=0)
            {
                r++;
            }
            
        }
        return count;
        
    }
}