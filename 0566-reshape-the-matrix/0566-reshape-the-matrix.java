class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
      
      int n = mat.length;
      int m= mat[0].length;
      
      if((n*m)!=(r*c))return mat;      
      
      
      Queue<Integer> queue = new LinkedList<>();
      
      
      for(int[] row : mat)
      {
        for(int ele : row)
        {
          queue.offer(ele);
        }
      }
      
      int[][]reshaped = new int[r][c];
      
      for(int i=0 ; i< r ; i++)
      {
        for(int j=0 ; j<c ; j++)
        {
        if(!queue.isEmpty())  reshaped[i][j]=queue.poll();
        }
      }
      return reshaped;
      
    }
}