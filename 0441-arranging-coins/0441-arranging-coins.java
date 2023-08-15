class Solution {
    public int arrangeCoins(int n) {
     // Can use Binary Search as well using formula of 1+2+...+k = k(k+1)/2 <=N 
      
      long start = 1 , end = n , k = 0 , curr = 0;
      long ans = 0;
      while(start<=end)
      {
        k = start + (end - start)/2;
        
        // use the formulae to the the total sum of elements till K th row 
        // if the total sum of k elements equals the N then it means all rows have been filled or else                we check accordingly !
        
        // last row may remail incomplete , we will be using ceil value to return no of rows filled !
        
        curr = k*(k+1)/2;
        
        if(curr<=n)
        {
          ans = k ;
          start = k+1;
        }
        else
        {
          end=k-1;
        }
        
      }
      return (int)ans;
    }
}
