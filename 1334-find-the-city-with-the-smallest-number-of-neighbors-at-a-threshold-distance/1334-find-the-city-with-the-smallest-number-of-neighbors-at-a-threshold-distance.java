class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        
      int[][]cost = new int[n][n];
      int m = edges.length;
      
      for(int[] arr : cost) Arrays.fill(arr,Integer.MAX_VALUE);
      
      for(int i=0 ; i<m; i++)
      {
        cost[edges[i][0]][edges[i][1]] = edges[i][2];
         cost[edges[i][1]][edges[i][0]] = edges[i][2];
      }
      
      for(int i=0 ; i<n ; i++)cost[i][i]=0;
      
      for(int k = 0 ; k < n ; k++)
      {
        for(int i=0 ; i< n ; i++)
        {
          for(int j =0 ; j<n ;j++)
          {
            if(cost[i][k] == Integer.MAX_VALUE || cost[k][j]==Integer.MAX_VALUE) continue ;
            
            cost[i][j]=Math.min(cost[i][j] , cost[i][k]+cost[k][j]);
          }
        }
      }
      
      int cityNo = -1;
      int cntMax = n ;
      
      for(int city =0 ; city<n ; city++)
      {
        int cnt=0;
        for(int adjCity =0 ; adjCity<n ; adjCity++)
        {
          if(cost[city][adjCity]<=distanceThreshold)
          {
            cnt++;
          }
        }
        if(cnt<=cntMax)
        {
          cntMax=cnt;
          cityNo = city;
        }
      }
      
      return cityNo;
    }
}