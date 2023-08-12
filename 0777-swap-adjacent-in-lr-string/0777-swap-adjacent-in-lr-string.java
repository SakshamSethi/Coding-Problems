class Solution {
    public boolean canTransform(String start, String end) {
 // the key observation to this problem is that 
      /* if we are trying to transform the start string to the end the first point to be noted is
      
      that whenever we have to transform one string to another string the first and foremost thing 
      is to check wheather both the strings are equal or not after removing all the Xs from both the strings , why so ? because :  as we can transform the XL -> LX ,  means we have move L to its left 
      by one place in the start string and we can move R to its right once per move 
      
      so if there exists an X before an L we can move L leftwards and same for the right 
      
      
      */
      
      // First of all lets check if both the strings are equal or not 
      
      if(!start.replace("X","").equals(end.replace("X","")))
        return false ;
      
    // now we have to traverse both the strings using pointers and check 2 cases 
      
      // Lets say we are trying to transform  start to end --> so first we check wheather or not the character are non - X characters in both of the string 
      
      // then we check if there's an L appearing in start string (and accordingly there will be an L appearing in the end string as they both are equal without X character)
      // so we check that if the L appearing at some position in start , that position should pe greater or equal to the position of that L in the end string , why? , because if this is the case 
  // then we can surely make a move to place L leftwards in the start string  (can apply the sane logic to R characters , just that they should occur at the right or equal place)
      
      
      int i = start.length() ;
      int j = end.length() ;
      
      int p1 = 0 , p2 = 0 ;
      
      while(p1<i && p2<j)
      {
        // first we ignore the X characters in both the string !
        
        while(p1<i && start.charAt(p1)=='X')p1++;
        while(p2<j && end.charAt(p2)=='X')p2++;
        
        if(p1==i && p2==j)return true;
        if(start.charAt(p1)!=end.charAt(p2)) return false ;
        
        if(start.charAt(p1)=='L' && p2>p1) return false ;
        if(start.charAt(p1)=='R' && p1>p2) return false ;
        
        p1++;
        p2++;
      }
      
      return true;
      
    }
}