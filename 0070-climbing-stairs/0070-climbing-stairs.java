class Solution {
    public int climbStairs(int n) {
        if(n<=2) 
        return n;
      else if ( n==0) return 0;
      
      int a[] = new int[n+1];
      a[0]=1;
      a[1]=1;
      for(int i=2 ; i<n+1;i++)
      {
          a[i] = a[i-1]+a[i-2];
      }
      return a[n];



    }
}