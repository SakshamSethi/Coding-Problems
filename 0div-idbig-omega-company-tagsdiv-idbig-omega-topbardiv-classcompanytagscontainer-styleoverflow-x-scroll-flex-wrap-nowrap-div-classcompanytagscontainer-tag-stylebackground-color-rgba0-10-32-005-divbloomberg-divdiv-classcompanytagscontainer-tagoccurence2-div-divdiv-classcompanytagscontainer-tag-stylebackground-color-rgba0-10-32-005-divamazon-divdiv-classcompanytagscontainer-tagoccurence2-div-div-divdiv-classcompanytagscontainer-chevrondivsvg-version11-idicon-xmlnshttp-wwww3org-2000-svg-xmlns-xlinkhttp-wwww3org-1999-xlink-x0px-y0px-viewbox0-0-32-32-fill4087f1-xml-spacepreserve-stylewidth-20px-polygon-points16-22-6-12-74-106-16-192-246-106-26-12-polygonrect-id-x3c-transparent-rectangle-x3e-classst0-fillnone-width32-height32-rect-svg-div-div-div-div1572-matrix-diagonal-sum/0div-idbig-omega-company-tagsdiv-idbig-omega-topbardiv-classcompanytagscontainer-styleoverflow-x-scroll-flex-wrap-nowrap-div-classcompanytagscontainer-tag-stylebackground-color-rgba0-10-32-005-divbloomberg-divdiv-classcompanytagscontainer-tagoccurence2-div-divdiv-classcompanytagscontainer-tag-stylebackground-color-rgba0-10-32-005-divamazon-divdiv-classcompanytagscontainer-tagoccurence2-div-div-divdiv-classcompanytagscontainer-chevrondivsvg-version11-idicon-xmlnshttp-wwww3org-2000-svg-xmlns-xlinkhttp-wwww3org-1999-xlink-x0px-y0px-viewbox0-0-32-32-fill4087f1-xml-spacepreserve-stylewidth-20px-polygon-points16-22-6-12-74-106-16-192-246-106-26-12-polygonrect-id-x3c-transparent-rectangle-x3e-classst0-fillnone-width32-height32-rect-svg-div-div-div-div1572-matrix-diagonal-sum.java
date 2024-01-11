class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum=0;
        int n = mat.length;
        
        for(int i=0 ; i< n ; i++)
        {
            sum+=mat[i][i];
            if(n-i-1 != i) sum+=mat[i][n-i-1];
        }
        return sum;
    }
}