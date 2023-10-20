class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[]dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return compute(0,s,wordDict,dp);
    }
    
    boolean compute(int idx , String s , List<String>words ,int[]dp)
    {
        
        
        if(idx == s.length()) return true;
    
        if(dp[idx]!=-1) return dp[idx]==1?true:false;
        boolean isThere = false;
        for(int i=idx ; i<s.length();i++)
        {
            if(isPresent(s.substring(idx,i+1),words))
            {
              if(compute(i+1,s,words,dp)) 
              {
                  dp[idx]=1;
                  return true;
                 
              }
            }
        }
        dp[idx]=0;
    return false ;
    }
    boolean isPresent(String s , List<String> words)
    {
        for(String word : words)
            if(s.equals(word) ) return true;
        
        return false;
    }
}