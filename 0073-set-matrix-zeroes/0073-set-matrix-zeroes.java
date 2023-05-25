class Solution {
    public void setZeroes(int[][] matrix) {
        
        //Optimized Solution :)
        
        
        boolean row = false , col=false;
        int m  = matrix.length;
        int n = matrix[0].length;
        for(int i =0;i<m;i++)
        { if (matrix[i][0]==0)
            row = true;         
         }
         for(int i =0;i<n;i++)
        { if (matrix[0][i]==0)
            col = true;         
         }
        
        for(int i=1;i<m;i++)
        {
            for(int j =1;j<n;j++)
            {
                
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                        matrix[i][0]=0;
                }
            }
        }
        
        for(int i=1;i<m;i++)
        {
            if(matrix[i][0]==0)
            {
                for(int j=0;j<n;j++)
                {
                    matrix[i][j]=0;
                }
            }
        }
         for(int j=1;j<n;j++)
        {
            if(matrix[0][j]==0)
            {
                for(int i=0;i<m;i++)
                {
                    matrix[i][j]=0;
                }
            }
        }
        if(row==true)
        {
            for(int i=0;i<m;i++)
            {
                matrix[i][0]=0;
            }
        }
          if(col==true)
        {
            for(int i=0;i<n;i++)
            {
                matrix[0][i]=0;
            }
        }
    }
}