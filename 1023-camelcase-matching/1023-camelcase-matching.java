class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
      
      List<Boolean> ans = new ArrayList<>();
      char[] patternArray = pattern.toCharArray();
      for(String query : queries)
      {
        boolean isMatch = match(query.toCharArray(),patternArray);
        ans.add(isMatch);
      }
      return ans;
      
    }
  boolean match(char[] query , char[] pattern)
  {
    int j=0;
    for(int i=0 ; i<query.length; i++)
    {
      
      if(j<pattern.length && query[i]==pattern[j]) j++;
      
    
      else if(query[i]>='A' && query[i]<='Z') return false;
      
      
    }
    return j==pattern.length;
  }
}