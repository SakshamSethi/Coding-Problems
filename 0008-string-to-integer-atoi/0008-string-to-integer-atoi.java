class Solution {
    public int myAtoi(String s) {
      return findNum(s.trim(),0,1,0);
    }
  int findNum(String s , int i , int sign , int result )
  {
     
    
    if(i>=s.length())
      return result;
    
    if(result == Integer.MAX_VALUE || result == Integer.MIN_VALUE) return result;
    
    
    Character ch = s.charAt(i);
    
    if(Character.isDigit(ch))
    {
      int digit = ch-'0';
      if(sign==1)
      {
       if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7))
          return Integer.MAX_VALUE;
     
         result = result*10 + digit ;
         return findNum(s,i+1,sign,result);
      
      }
      else
      {
         if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit > 8))
          return Integer.MIN_VALUE;
     
         result = result*10 - digit ;
         return findNum(s,i+1,sign,result);
      }
     
    }
    
   
    
    
    
    else if(ch=='+'&&i==0) return findNum(s,i+1,1,result);
    
    else if(ch=='-'&&i==0) return findNum(s,i+1,-1,result);
       
    else  return result;
    
  }
}