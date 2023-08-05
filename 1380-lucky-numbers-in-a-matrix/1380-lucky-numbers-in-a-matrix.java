class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       int m  = matrix.length;
      int n = matrix[0].length ;
      
      List<Integer> ans = new ArrayList<>();
      List<Integer> minRows = new ArrayList<>();
      for(int[]row :matrix)
      {
        int mini=(int)1e6;
        for(int ele : row)
        {
          mini = Math.min(mini , ele);
        }
        minRows.add(mini);
      }
      
      
      List<Integer>maxCols = new ArrayList<>();
      for(int i=0 ; i<n ; i++)
      {
        int maxi = -1;
        for(int j=0 ; j<m ; j++)
        {
          maxi = Math.max(maxi , matrix[j][i]);
        }
        maxCols.add(maxi);
      }
      System.out.println("row "+minRows+"cols"+maxCols);
      
      
      
      
      
      for(int[] row : matrix)
      {
          for(int ele : row)
          {
            if(minRows.contains(ele) && maxCols.contains(ele)) ans.add(ele);
            
          }
      }
      
      return ans;
      
    }
}