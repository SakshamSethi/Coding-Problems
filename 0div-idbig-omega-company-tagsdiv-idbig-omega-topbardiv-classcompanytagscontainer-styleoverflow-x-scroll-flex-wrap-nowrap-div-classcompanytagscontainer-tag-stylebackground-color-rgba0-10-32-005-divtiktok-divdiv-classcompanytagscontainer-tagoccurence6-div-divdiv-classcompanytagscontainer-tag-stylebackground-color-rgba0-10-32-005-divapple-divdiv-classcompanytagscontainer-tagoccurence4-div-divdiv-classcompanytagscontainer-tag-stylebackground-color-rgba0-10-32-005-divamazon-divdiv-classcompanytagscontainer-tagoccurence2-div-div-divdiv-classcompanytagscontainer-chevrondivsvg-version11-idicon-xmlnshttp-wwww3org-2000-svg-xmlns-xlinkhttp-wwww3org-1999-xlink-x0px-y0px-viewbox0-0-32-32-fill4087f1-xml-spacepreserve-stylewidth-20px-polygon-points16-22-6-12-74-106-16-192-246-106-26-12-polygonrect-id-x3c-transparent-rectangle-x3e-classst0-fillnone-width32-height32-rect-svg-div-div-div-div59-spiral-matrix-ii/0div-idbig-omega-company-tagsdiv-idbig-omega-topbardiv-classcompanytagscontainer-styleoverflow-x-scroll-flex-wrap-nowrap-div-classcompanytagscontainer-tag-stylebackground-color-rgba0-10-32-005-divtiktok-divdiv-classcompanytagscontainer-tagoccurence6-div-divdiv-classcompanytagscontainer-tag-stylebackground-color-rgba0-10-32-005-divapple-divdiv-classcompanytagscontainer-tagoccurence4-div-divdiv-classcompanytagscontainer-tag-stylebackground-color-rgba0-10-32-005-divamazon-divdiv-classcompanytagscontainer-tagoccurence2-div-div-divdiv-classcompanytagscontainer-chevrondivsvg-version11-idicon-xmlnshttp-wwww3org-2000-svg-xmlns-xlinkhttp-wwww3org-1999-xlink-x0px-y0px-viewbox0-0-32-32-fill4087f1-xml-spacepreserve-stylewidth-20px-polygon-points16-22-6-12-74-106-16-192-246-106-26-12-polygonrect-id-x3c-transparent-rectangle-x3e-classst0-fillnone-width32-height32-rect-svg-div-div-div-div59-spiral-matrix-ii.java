class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] matrix = new int[n][n];
        
        int num=1;
         
        
        int left = 0 , right = n-1 , top = 0 , bottom = n-1 ;
        
        while(left<=right && top<=bottom)
        {
            for(int i=left; i<=right ; i++) matrix[top][i]=num++;
            top++;
            
            if(top>bottom || left>right ) break;
            
            for(int i=top; i<=bottom ; i++) matrix[i][right]=num++;
            right--;
            
            if(top>bottom || left>right ) break;
            
            for(int i=right; i>=left ; i--) matrix[bottom][i]=num++;
            bottom--;
            
            if(top>bottom || left>right ) break;
            
            for(int i=bottom; i>=top ; i--) matrix[i][left]=num++;
            left++;
            
            if(top>bottom || left>right ) break;
        }
        
        
        
        return matrix;
        
    }
}