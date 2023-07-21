class Solution {
    public int longestStrChain(String[] words) {
             Arrays.sort(words, Comparator.comparingInt(String::length));
      int n =words.length;
      int[]dp = new int[n];
Arrays.fill(dp,1);
      
      int max =0;
      
      for(int i=0 ; i<n;i++)
      {
        for(int prev = 0 ; prev < i ; prev++)
        {
          if(checkcompare(words[i],words[prev]) && dp[i]<dp[prev]+1)
          {
              dp[i]=dp[prev]+1;            
          }
          
        }
        max = Math.max(dp[i],max);
      }
      return max;
    }

  boolean checkcompare(String s1 , String s2)
  {
    if(s1.length()!=s2.length()+1) return false;
    
    int first =0 ;
    int second =0;
    
    while(first<s1.length())
    {
      if(second<s2.length() && s1.charAt(first)==s2.charAt(second))
      {
        first++;
        second++;
      }
      else
      {
        first++;
      }
    }
    if(first==s1.length() && second==s2.length()) return true;
    return false;
  }

}
