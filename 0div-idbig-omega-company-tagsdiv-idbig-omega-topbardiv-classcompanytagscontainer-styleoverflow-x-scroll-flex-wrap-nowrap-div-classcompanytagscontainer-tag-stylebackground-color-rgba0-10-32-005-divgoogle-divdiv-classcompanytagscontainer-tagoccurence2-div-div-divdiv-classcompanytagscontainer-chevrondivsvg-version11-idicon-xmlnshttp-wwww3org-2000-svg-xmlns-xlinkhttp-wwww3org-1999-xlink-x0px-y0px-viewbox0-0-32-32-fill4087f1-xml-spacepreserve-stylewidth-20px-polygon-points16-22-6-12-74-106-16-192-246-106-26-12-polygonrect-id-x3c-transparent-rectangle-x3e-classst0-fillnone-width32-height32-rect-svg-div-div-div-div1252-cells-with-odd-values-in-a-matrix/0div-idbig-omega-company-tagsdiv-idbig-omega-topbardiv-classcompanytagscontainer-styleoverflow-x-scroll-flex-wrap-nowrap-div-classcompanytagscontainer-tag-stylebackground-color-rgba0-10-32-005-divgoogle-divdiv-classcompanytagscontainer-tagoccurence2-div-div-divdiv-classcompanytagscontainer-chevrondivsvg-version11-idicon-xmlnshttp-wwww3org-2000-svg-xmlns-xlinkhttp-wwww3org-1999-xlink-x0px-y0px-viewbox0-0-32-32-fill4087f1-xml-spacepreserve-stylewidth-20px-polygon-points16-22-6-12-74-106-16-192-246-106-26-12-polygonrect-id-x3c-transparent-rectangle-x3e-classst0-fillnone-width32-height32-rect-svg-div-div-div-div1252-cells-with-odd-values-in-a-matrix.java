class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        
        int[][]matrix = new int[m][n];
        
        for(int[] arr : indices)
        {
            int row = arr[0];
            int col = arr[1];
            
            incrementRow(matrix,row,n);
            incrementCol(matrix,col,m);
        }
        int count=0;
        for(int[] arr: matrix)
        {
            for(int x : arr)
            {
                if(x%2==1)count++;
            }
        }
        return count;
    }
    
 private void incrementRow(int[][]matrix , int row,int n)
 {
     for(int i=0 ; i<n ; i++)
     {
         matrix[row][i]++;
     }
 }
     private void incrementCol(int[][]matrix , int col,int m)
 {
     for(int i=0 ; i<m ; i++)
     {
         matrix[i][col]++;
     }
 }
}