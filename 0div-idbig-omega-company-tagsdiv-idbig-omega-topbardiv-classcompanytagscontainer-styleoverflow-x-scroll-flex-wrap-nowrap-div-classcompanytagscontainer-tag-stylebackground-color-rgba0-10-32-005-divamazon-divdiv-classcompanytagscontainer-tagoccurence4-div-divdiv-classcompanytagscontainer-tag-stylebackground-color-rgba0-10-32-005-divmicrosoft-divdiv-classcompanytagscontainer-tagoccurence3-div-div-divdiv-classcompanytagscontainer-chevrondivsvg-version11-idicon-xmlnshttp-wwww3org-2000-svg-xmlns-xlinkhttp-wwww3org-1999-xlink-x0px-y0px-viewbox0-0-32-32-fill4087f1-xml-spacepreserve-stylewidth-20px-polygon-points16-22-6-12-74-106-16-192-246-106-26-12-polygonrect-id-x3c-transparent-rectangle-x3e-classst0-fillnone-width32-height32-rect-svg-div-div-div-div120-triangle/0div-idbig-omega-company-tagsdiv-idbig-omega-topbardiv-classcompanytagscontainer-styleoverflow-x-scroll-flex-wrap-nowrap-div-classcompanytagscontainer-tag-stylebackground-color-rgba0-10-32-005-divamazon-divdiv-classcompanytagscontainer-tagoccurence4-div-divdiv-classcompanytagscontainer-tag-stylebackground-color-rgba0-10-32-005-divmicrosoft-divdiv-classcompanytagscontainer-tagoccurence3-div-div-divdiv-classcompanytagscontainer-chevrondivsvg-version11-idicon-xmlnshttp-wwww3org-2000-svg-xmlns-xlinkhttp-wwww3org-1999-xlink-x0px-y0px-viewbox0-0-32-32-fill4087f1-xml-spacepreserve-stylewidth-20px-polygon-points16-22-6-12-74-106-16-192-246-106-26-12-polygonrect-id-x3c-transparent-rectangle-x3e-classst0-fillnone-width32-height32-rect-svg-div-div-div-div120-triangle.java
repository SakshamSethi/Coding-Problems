class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();
        int m = triangle.get(n-1).size();
        
        int[][] dp = new int[n][m];

        for(int[]arr:dp)
        Arrays.fill(arr,-1);
            
        return process(triangle , 0,0,dp );    
    }
    
    int process(List<List<Integer>> triangle,int i,int j,int[][]dp)
    {
         
        if(i>=triangle.size()||j>triangle.get(i).size()) return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        int down = triangle.get(i).get(j) + process(triangle,i+1,j,dp);
    int downRight = triangle.get(i).get(j) + process(triangle,i+1,j+1,dp);
    
    return dp[i][j] = Math.min(down,downRight);
    
    }
}