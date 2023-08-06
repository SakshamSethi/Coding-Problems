class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> list = new ArrayList<>();
      
      int m = matrix.length;
      int n = matrix[0].length;
      
      int left=0 , right =n-1 , top =0 , bottom =m-1 ;
      
      while(left<=right && top<=bottom)
      {
        for(int i = left ; i<= right ; i++)
        {
           list.add(matrix[top][i]);    
        }
        
        top++;
        
        if(left > right || top > bottom) break;
       
        
        for(int j = top ; j<= bottom ; j++)
        {
          list.add(matrix[j][right]);
          
        }
        right--;
       
        if(left > right || top > bottom) break;
        
        for(int i = right ; i>=left ; i--)
        {
          list.add(matrix[bottom][i]);
        }
        bottom--;
        
        if(left > right || top > bottom) break;
        
        for(int j = bottom ; j>=top;j--)
        {
          list.add(matrix[j][left]);
        }
        left++; 
        if(left > right || top > bottom) break;

   
      }
      return list;
      
        
    }
}