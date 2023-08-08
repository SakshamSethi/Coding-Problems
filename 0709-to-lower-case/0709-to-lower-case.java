class Solution {
    public String toLowerCase(String s) {
        
      int n = s.length();
      StringBuilder str = new StringBuilder();
      
      for(int i=0 ; i< n ; i++)
      {
        if(s.charAt(i)>=65 && s.charAt(i)<=90)
        {
          str.append((char)(s.charAt(i)+32));
        }
        else 
          str.append(s.charAt(i));
      }
  return str.toString();
    }
  
}