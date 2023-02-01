class Solution {
    public boolean isPalindrome(String s) {

  
       s= s.toLowerCase();
        System.out.println(s);
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            
         
            
            
            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)))
              {
             
               if(s.charAt(j)==s.charAt(i))
                  {
                  
                      i++;
                      j--;
                  }
                  
           else {
                return false;
            }
                   
           
        } 
       
            
         if(Character.isLetterOrDigit(s.charAt(i))==false)i++;
        
            if(Character.isLetterOrDigit(s.charAt(j))==false)j--;    
            
           
        }
        return true;
    }
}