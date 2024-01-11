class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int[][]ans = new int[r][c];
        int row = 0 ;
        int col=0 ;
        int m = mat.length;
        int n = mat[0].length;
        if((r>=m && c>=n)|| (r*c<m*n) ) 
            return mat;
        
        for(int i = 0 ; i<m;i++)
        {
            for(int j=0 ; j<n;j++)
            {
                if(col>=c)
                {
                    col=0;
                    row++;
                }
                ans[row][col++]=mat[i][j];

            }
        }
        return ans;
    }
}