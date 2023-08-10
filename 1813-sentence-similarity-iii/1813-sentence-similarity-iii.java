class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
      
      String[]word1 = sentence1.split(" ");
      String[]word2 = sentence2.split(" ");
     
      return word1.length<word2.length?matchPrefixAndSuffix(word1,word2):matchPrefixAndSuffix(word2,word1);
      
    }
  
  boolean matchPrefixAndSuffix(String[]word1 , String[]word2)
  {
    int i=0 ;
    
    int len1 = word1.length;
    int len2 = word2.length;
    
    int match =0;
    while(i<len1 && word1[i].equals(word2[i]))
    {
      i++;
      match++;
    }
     
    int n=len2-1;
    int end=len1-1;
    while(end>=i && word1[end].equals(word2[n]))
    {
      end--;
      n--;
      match++;
    }
      
   return match==len1;
  }
  
}