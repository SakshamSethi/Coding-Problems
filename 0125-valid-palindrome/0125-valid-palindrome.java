class Solution {
    public boolean isPalindrome(String s) {
      
      if(s.trim().equals(""))return true;
        s=s.toLowerCase();
      StringBuilder str = new StringBuilder();
      
      int n = s.length();
      
      for(int i=0 ; i<n ; i++)
      {
        if(Character.isLetterOrDigit(s.charAt(i)))
        {
          str.append(s.charAt(i));
        }
    
      }
      
      return checkPalindrome(str);
      
    }
  
   boolean checkPalindrome(StringBuilder str)
   {
     int n= str.length();
     for(int i=0 ; i<n/2 ; i++)
     {
       if(str.charAt(i)!=str.charAt(n-1-i)) return false;
     }
     return true;
   }
}