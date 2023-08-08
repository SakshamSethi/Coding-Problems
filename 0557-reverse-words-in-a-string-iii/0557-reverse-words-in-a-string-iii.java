class Solution {
    public String reverseWords(String s) {
        
    
      StringBuilder ans = new StringBuilder();
      
      String[] words = s.split(" ");
      
      for(String word : words)
      {
          StringBuilder str = new StringBuilder(word);
          ans.append(str.reverse().append(" "));
      }
      return ans.toString().trim();
    }
}