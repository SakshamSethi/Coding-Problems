class Solution {
    public int[] sumZero(int n) {
        int[]ans = new int[n];
      int odd=0;
        if(n%2==1) odd=1;
      
      if(odd==0)
      {
          int half = n/2;
        int k=0;
        for(int i=0 ; i< half ; i++)
        {
          ans[k++]= i+1;
          ans[k++]= -(i+1);
        }
        
      }
      
      else
      {
        int half = (n+1)/2;
       
        int k=0;
        for(int i = 1 ; i<half;i++)
        {
          ans[k++]= i;
          ans[k++] =-i;
        }
      }
      return ans;
        
      
        
      
    }
}