class Solution {
    public int maximumWealth(int[][] accounts) {
        
      int richest = 0 ;
      int m =accounts.length;
      int n=accounts[0].length;
      
      for(int i=0 ; i< m ; i++)
      {
        int sum = wealth(accounts[i]);
        
        richest = Math.max(richest , sum);
      }
      return richest ;
    }
  int wealth(int[] arr)
  {
    int sum=0 ;
    for(int var : arr)
      sum+=var;
    
    return sum;
  }
}