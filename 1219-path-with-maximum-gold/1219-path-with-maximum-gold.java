class Solution {
    public int getMaximumGold(int[][] grid) {
        
        int MaxG=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                MaxG = Math.max(MaxG,calc(grid,i,j));
            }
        }
        return MaxG;
    }
 static int calc(int[][] grid,int r,int c )
 {
     
     
     if(r<0||r>=grid.length||c<0||c>=grid[0].length||grid[r][c]==0)
     {
         return 0;
     }
     int temp = grid[r][c];

     grid[r][c]=0;
     
     int mA = calc(grid,r+1,c);
     int mB = calc(grid,r,c+1);
     int mC = calc(grid,r,c-1);
     int mD = calc(grid,r-1,c);
    
     grid[r][c]=temp;
 return temp+Math.max(mA,Math.max(mB,Math.max(mC,mD)));
     
     
 }
}