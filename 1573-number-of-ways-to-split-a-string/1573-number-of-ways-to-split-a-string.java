class Solution {
  int mod = (int)(Math.pow(10,9)+7);
    public int numWays(String s) {
        
      long countOnes =0;
      long n =s.length()%mod;
      if(n<3)return 0;
      for(int i=0 ;i<n;i++)
      {
        if(s.charAt(i)=='1')countOnes++;
      }
        if(countOnes%3!=0)return 0;
      
      if(countOnes==0)
     return (int) ((n - 1) * (n - 2) / 2 % mod);
      
      // we have to maintain the number of splits we can do for s1 and s2  after providing equal ones in each
      
      
      long averageOnes = countOnes/3;
      
      long firstBlockSplits = 1;
      long secondBlockSplits =1;
      
      long prefixOnesCount=0;
      
      for(char len : s.toCharArray())
      {
        if(len=='1')prefixOnesCount++;
        else
        {
          if(prefixOnesCount==averageOnes) firstBlockSplits++;
          if(prefixOnesCount==2*averageOnes) secondBlockSplits++;
        }
      }
      
      return (int)(((firstBlockSplits%mod)*(secondBlockSplits%mod))%mod);
      
    }
}