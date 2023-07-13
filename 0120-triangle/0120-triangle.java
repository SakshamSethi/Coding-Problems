class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       
      int n = triangle.size();
      if(n==1) return triangle.get(0).get(0);
      int[][]dp = new int[n][n];
      for(int[]arr : dp) Arrays.fill(arr,-1);
      return count(triangle,0,0 ,n-1,dp );
      
    }
  int count(List<List<Integer>> triangle , int a, int b,int i, int[][]dp )
  {
    if(a==i) return triangle.get(a).get(b);
    
    if(dp[a][b]!=-1) return dp[a][b];
    
    int d = triangle.get(a).get(b) + count(triangle,a+1,b,i,dp);
    int dg = triangle.get(a).get(b) + count(triangle,a+1,b+1,i,dp);
    
    return dp[a][b] = Math.min(d,dg);
   
  }
}