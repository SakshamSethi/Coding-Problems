class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
       
      int n = triangle.size();
      if(n==1) return triangle.get(0).get(0);
     // int[][]dp = new int[n][n];
     // for(int[]arr : dp) Arrays.fill(arr,-1);
     // return count(triangle,0,0 ,n-1,dp );
      
      //Tabulation
    /*  for(int i=0;i<n;i++)
      {
        dp[n-1][i] = triangle.get(n-1).get(i);
      }
      
      for(int i=n-2;i>=0;i--)
      {
        for(int j=i;j>=0;j--)
        {
          if(i==n-1&&j==n-1)continue;
          
          int d =  triangle.get(i).get(j)+ dp[i+1][j];
          int dg =  triangle.get(i).get(j) + dp[i+1][j+1];
          
          dp[i][j]=Math.min(d,dg);
        }
      }
      return dp[0][0];
  */
      // space optimized 
      
      int[] next = new int[n];
      
      for(int i=0;i<n;i++)
      {
        next[i] = triangle.get(n-1).get(i);
      }
      
      
      for(int i=n-2;i>=0;i--)
      {
        int[]cur = new int[i+1];
        for(int j=i;j>=0;j--)
        {
          
          
          int d =  triangle.get(i).get(j)+ next[j];
          int dg =  triangle.get(i).get(j) + next[j+1];
          
          cur[j]=Math.min(d,dg);
        }
        next=cur;
      }
      return next[0];
      
      
    }
  
  
  
 /* int count(List<List<Integer>> triangle , int a, int b,int i, int[][]dp )
  {
    if(a==i) return triangle.get(a).get(b);
    
    if(dp[a][b]!=-1) return dp[a][b];
    
    int d = triangle.get(a).get(b) + count(triangle,a+1,b,i,dp);
    int dg = triangle.get(a).get(b) + count(triangle,a+1,b+1,i,dp);
    
    return dp[a][b] = Math.min(d,dg);
   
  }*/
}