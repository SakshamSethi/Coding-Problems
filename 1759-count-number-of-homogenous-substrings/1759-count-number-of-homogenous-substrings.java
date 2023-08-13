class Solution {
    public int countHomogenous(String s) {
    
      int prev =1;
      int cur=1;
      int mod = (int)1e9+7;
      
      for(int i=1 ; i<s.length();i++)
      {
        char prevChar = s.charAt(i-1);
        char curChar =s.charAt(i);
        
        if(prevChar!=curChar) cur=0;
        
        
          cur++;
        
       prev = (prev%mod + cur%mod)%mod;
        
      }
      
      return prev;
    }
 
}