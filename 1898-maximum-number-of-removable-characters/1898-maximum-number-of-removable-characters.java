class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
      
      int n = removable.length;
      
            
      
     char[] letters = s.toCharArray();
      
      int low=0;
      int end = n ;
      
      while(low<=end)
      {
        int mid = low +(end-low)/2;
        
         for(int i=0 ; i<mid ; i++) letters[removable[i]]='1';
        
          if(isSubsequence(letters , p)) low = mid+1;
          
          else 
          {
            for(int i=0 ; i<mid ; i++)
              letters[removable[i]] = s.charAt(removable[i]);
            end = mid-1;
          }
        
      }
      
  return end ;
  
    }
  
  boolean isSubsequence(char[] s , String p)
  {
     
    int slen = s.length;
    int plen = p.length();
    
    if(plen>slen)return false ;
    
    int j=0;
    int i=0;
    
    while(i<slen && j<plen)
    {
      if(s[i]!='1' && p.charAt(j)==s[i])
      {
      j++;
      }
      i++;
    }
    
    if(j==plen)return true;
    
    return false;
  }
  
}