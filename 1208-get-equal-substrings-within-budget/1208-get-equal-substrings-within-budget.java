class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
      
      
      int maxLen=Integer.MIN_VALUE;
 
      int i=0; 
      int cost=0;
      int j=0;
      for( i=0 ; i< s.length();i++)
      {
       
         
        char sCh = s.charAt(i);
        char tCh = t.charAt(i);
        
         cost += (int)Math.abs ( (sCh-'a')-(tCh-'a') );
        
        if(i==0 && cost>maxCost)continue;
        
        while(cost>maxCost)
        {
          cost-=(int)Math.abs ( (s.charAt(j)-'a')-(t.charAt(j) -'a') );
           j++;
        }
  
      
        maxLen = Math.max(maxLen , i-j+1);
 
      }
      return maxLen;
    }
}