class Solution {
    public int minimumLength(String s) {
        
      int i=0;
      int size=s.length();
      int j = size-1;
      
      
      while(i<j && s.charAt(i)==s.charAt(j))
      {
        
        char ch = s.charAt(i);
        
        while(i<=j && s.charAt(i)==ch)
        {i++;
        size--;
        }
        
        while(j>=i && s.charAt(j)==ch)
        {
          j--;
          size--;
        }
        
      }
      return size;
    }
}