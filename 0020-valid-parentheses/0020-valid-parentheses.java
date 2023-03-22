class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> sq = new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='[' ||s.charAt(i)=='{'  )
            {
                sq.push(s.charAt(i));
            }
   else
   {
       if(s.charAt(i)==')')
       {
           if(sq.isEmpty() || sq.pop()!='('  )
           
               return false;
       }
       if(s.charAt(i)=='}')
       {
           if(sq.isEmpty() || sq.pop()!='{'  )
           
               return false;
       }
       if(s.charAt(i)==']')
       {
           if(sq.isEmpty() || sq.pop()!='['  )
           
               return false;
       }
         
   }
   
            
        }
        return sq.isEmpty();
    }
}