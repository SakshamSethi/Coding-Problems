class Solution {
    public int numSub(String s) {
      
      
      int prev =0;
      int cur =0;
      int mod = (int)1e9+7;
      for(int i=0 ; i<s.length();i++)
      {
        if(s.charAt(i)=='1')
        {
          cur++;
          prev = (prev%mod+cur%mod)%mod;
        }
        else
        {
          cur=0;
        }
      }
      return prev;
    }
}