class Solution {
    public boolean isPalindrome(String s) {

  
       s= s.toLowerCase();
        System.out.println(s);
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            char x = s.charAt(i);
            char y = s.charAt(j);
            if(Character.isLetterOrDigit(s.charAt(i))==false)i++;
        
            if(Character.isLetterOrDigit(s.charAt(j))==false)j--; 
            
            if(Character.isLetterOrDigit(x) && Character.isLetterOrDigit(y))
              {
                System.out.println(x+" "+y);
               if(x==y)
                  {
                   System.out.println("a");
                      i++;
                      j--;
                  }
                  
           else {
                return false;
            }
           
        } 
       
            
            
            
           
        }
        return true;
    }
}