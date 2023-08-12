class Solution {
    public String multiply(String num1, String num2) {
      
      /*
      we will be storing the multiplication inside an array and at the end we will
      be converting that array into a string  !
     
      1 2 3
      4 5 6
      ------
          
          
          
      */

      // firstly check all the edge cases like string is consiting leading 0 or is itself 0 or not
      
      
      int n = num1.length();
      int m = num2.length();
      
      if(n==0 || m==0 || num1.equals("0") || num2.equals("0")) return "0";
      
      // check if any one of them is a 1
      
      if(num1.equals("1")) return num2;
      if(num2.equals("1")) return num1;
      
      // Now store result int the result array :
      
      int[] result = new int[n+m] ;
        // maximum product could be of NxM as a unit digit can be of 9 at max --> 9 x 9 --> 18 (     n+m)-->(1+1)
        
        // we will traverse the strings from right to left 
        
        for(int i =n-1 ; i>=0 ; i--)
        {
          
          for(int j=m-1 ; j>=0 ; j--)
          {
            
            // find out the product of the last digit :
            
            int product = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                 
            product +=result[i+j+1]; // old carry mai add karna hai
            
            result[i+j+1] = product%10;
            result[i+j] += product/10;  // new carry add karna hai prev wale mai !!
            
          }
          
        }
      
        // just have to contert it into string :0
      
      StringBuilder str = new StringBuilder() ;
      
      for(int digit : result)
      {
        if(str.length()==0 && digit==0) continue ;
        
        str.append(digit);
      }
        
      return str.toString();
      
    }
}


