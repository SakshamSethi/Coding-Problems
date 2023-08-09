class Solution {
    public int strStr(String haystack, String needle) {
    
      return haystack.indexOf(needle);
      
     /* int n = haystack.length();
      int m = needle.length();
    
       if(m>n)return -1; 
      
      for(int i=0 ; i<n-m+1;i++)
      {
        
        if(haystack.charAt(i)==needle.charAt(0))
        {
          if(haystack.substring(i,m+i).equals(needle))
            return i;
        }
        
        
      }
      return -1 ;
       */ 
    }
}