class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
      
      for(int[] row : image)
      {
        reverseRow(row);
      }
      int n=image.length;
      for(int[] row : image)
      {
        for(int i=0 ; i<n ; i++)
        {
          if(row[i]==1)row[i]=0;
          else row[i]=1;
        }
      }
      
      return image;
    }
  void reverseRow(int[] arr)
  {
    int i=0;
    int j = arr.length-1 ;
    while(i<j)
    {
      int temp = arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
      
      
      
      i++;
      j--;
    }
  }
}