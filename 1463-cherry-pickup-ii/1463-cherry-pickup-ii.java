class Solution {
    public int cherryPickup(int[][] grid) {
      
      int i = grid.length;
      int j1 = grid[0].length;
      int j2 = j1;
      
      int[][][]dp = new int[i][j1][j2];
      
      for(int[][] arr : dp)
      {
        for(int[] a : arr)
          Arrays.fill(a,-1);
      }
      
      return count(grid,0,0,j2-1,i-1,j1-1,dp);
      
    }
  int count(int[][] grid , int r,int c1,int c2,int i,int j,int[][][]dp)
  {
     if(c1<0 || c2<0 || c1>j || c2>j) return (int)-1e8;
    if(r==i)
    {
      if(c1==c2) return grid[r][c1];
      else return grid[r][c1]+grid[r][c2];
        
    }
   
    
    if(dp[r][c1][c2]!=-1) return dp[r][c1][c2];
    
    int maxi= (int)-1e8;
    for(int dj1 =-1 ;dj1<=1;dj1++)
    {
      for(int dj2=-1 ; dj2<=1;dj2++)
      {
        int sum =0;
        
        if(c1==c2) sum =  grid[r][c1] + count(grid,r+1,c1+dj1,c2+dj2,i,j,dp); 
        else sum = grid[r][c1]+ grid[r][c2] + count(grid,r+1,c1+dj1,c2+dj2,i,j,dp);
      
        
      maxi = Math.max(maxi,sum);
      }
    } 
    return dp[r][c1][c2] = maxi;
  }
}