class Solution {

    
public int maxIncreaseKeepingSkyline(int[][] grid) {
        
// For maintaining City SKyline we can increase a bilding's height 
// such that a Building should never cross the height of maximized building in its Row as well as Column 
        
        int r = grid.length;
        int c = r;
        int []MaxR = new int[r]; // to count max in each row
        int [] MaxC  = new int [c]; // to count max in each col
        
        for(int i=0 ; i<r ;i++)
        {
            for(int j =0 ;j<c ;j++)
            {
                if(MaxR[i]<grid[i][j])
                {
                    MaxR[i]=grid[i][j];
                }
            }
        }
         for(int i=0 ; i<r ;i++)
        {
            for(int j =0 ;j<c ;j++)
            {
                if(MaxC[i]<grid[j][i])
                {
                    MaxC[i]=grid[j][i];
                }
            }
        }
       
        int result =0;
         for(int i=0 ; i<r ;i++)
        {
            for(int j =0 ;j<c ;j++)
            {
               result +=  Math.min(MaxR[i],MaxC[j])-grid[i][j]; 
            }
        }
    return result ;}
    
}