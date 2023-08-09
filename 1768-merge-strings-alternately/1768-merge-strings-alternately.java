class Solution {
    public String mergeAlternately(String word1, String word2) {
     
      int i=0;
      int j=0;
      int n = word1.length();
      int m = word2.length();
      
      StringBuilder str = new StringBuilder();
      
      while(i<n && j<m)
      {
        str.append(word1.charAt(i));
        str.append(word2.charAt(j));
        i++;
        j++;
      }
      while(i<n)
      {
        str.append(word1.charAt(i));
        i++;
      }
        while(j<m)
      {
        str.append(word2.charAt(j));
        j++;
      }
      return str.toString();
    }
}