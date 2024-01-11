class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        if(check(mat,target)) return true;
        for(int i=0 ; i<3 ; i++)
        {
          mat =  rotate(mat);
           
            if(check(mat,target))return true;
            
        }
        return false;
    }
    
    int[][] rotate(int[][] mat)
    {
        int n = mat.length;
        int[][]temp = new int[n][n];
        for(int i=0 ; i< n ; i++)
        {
            for(int j=0 ; j< n ; j++)
            {
                temp[i][j] = mat[n-1-j][i];
            }
        }
        
      return temp;
        
    }
    boolean check(int[][]mat , int[][]target)
    {
        int n = mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0 ; j<n ; j++)
            {
                if(mat[i][j]!=target[i][j])return false;
            }
                
            }
    return true;
    }
    
}