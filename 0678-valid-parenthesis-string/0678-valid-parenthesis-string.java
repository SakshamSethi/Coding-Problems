class Solution {
    public boolean checkValidString(String s) {
        int leftParen =0 ;
      int star =0 ;
      
      for(char c : s.toCharArray())
      {
        if(c=='(') leftParen++;
        
        else if(c==')')
        {
          if(leftParen>0) leftParen--;
          else if(star>0) star--;
          else return false ;
          
        }
        else
        {
          star++;
          if(leftParen>0)
          {
            leftParen--;
            star++;
          }
        }
        
      }
      return leftParen == 0;
    }
}