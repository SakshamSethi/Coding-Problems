class Solution {
    public boolean arrayStringsAreEqual(String[] words1, String[] words2) {
      
      StringBuilder s1 = new StringBuilder();
      
      for(String word : words1)
      {
        s1=s1.append(word);
      }
      
     StringBuilder s2 = new StringBuilder();
      
      for(String word : words2)
      {
        s2=s2.append(word);
      }
      System.out.print(s1+" "+s2);
     
      return s1.toString().equals(s2.toString());
    }
}