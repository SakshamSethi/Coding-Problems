class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        
        int i=0;
        int totalLen = rows*cols ;
        
        int[][]matrix = new int[totalLen][2];
        
        matrix[i++] = new int[]{rStart,cStart};
        
        
        int len = 0;
        int d=0;
        int[]dir = new int[]{0,1,0,-1,0};
        
        while(i<totalLen)
        {
            if(d==0 || d==2) len++;
            
            for(int k =0 ; k<len ; k++)
            {
                rStart += dir[d];
                cStart +=dir[d+1];
                if(rStart<rows && rStart>=0 && cStart<cols && cStart>=0 )
                {
                    matrix[i++] = new int[]{rStart ,cStart};
                }
                
            }
            
            d= ++d%4;
            
        }
        return matrix;
        
    }
}