class Solution {
    public int calculate(String s) {
     
      /*
      we will be using stack for storing the intermediate values , which in the end
      we will add up together to formulate out result :)
      
      */
       
      Stack<Integer> st = new Stack();
      int curNum =0 ;
      int n = s.length();
      char prevOperation ='+';
      for(int i=0 ; i<n ; i++)
      {
        char curChar = s.charAt(i);
         if(curChar==' ' && i!=n-1)continue;
        if(Character.isDigit(curChar))
        {
          curNum = curNum*10 + curChar-'0';
        }
        if(!Character.isDigit(curChar) || i==n-1)
        {
          if(prevOperation=='+')
          {
            st.push(curNum);
          }
           if(prevOperation=='-')
          {
            st.push(-curNum);
          }
           if(prevOperation=='*')
          {
            st.push(st.pop()*curNum);
          }
           if(prevOperation=='/')
          {
            st.push(st.pop()/curNum);
          }
          
          prevOperation = curChar;
          curNum=0;
        }
        
      }
    
      int result =0;
      
      while(!st.isEmpty()) result+=st.pop();
      
      return result ;
    }
}