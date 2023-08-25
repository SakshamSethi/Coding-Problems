class Solution {
    public int[] findPeakGrid(int[][] mat) {
      
      // we will try to eliminate the columns 
      
      int startCol = 0;
      int endCol = mat[0].length-1;
      
      int maxRow=0;
      
      while(startCol<=endCol)
      {
        int midCol = startCol + (endCol-startCol)/2;
        
        // find out the max element in the midCol  and store its row value in maxRow
        
        // use a for loop for that row
        
        for(int i=0;i<mat.length;i++)
        {
          if(mat[i][midCol]>=mat[maxRow][midCol])
          {
            maxRow = i;
          }
        }
      
        boolean isLeftBig = (midCol>startCol && mat[maxRow][midCol]<= mat[maxRow][midCol-1])?true:false;
        boolean isRightBig = (midCol<endCol && mat[maxRow][midCol]<= mat[maxRow][midCol+1])?true:false;
        
      if(!isLeftBig && !isRightBig) return new int[]{maxRow,midCol};
      
      else if(isLeftBig) endCol = midCol-1;
        
      else if(isRightBig)startCol = midCol+1;
        
      }
      
      return new int[]{-1,-1};
    }
}