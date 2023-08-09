class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack();
      for(char ch : s.toCharArray())
      {
        
        if(ch==')'||ch==']'||ch=='}')
        {
          if(!st.isEmpty())
          {
           
            if(ch==')' && st.peek()=='(') st.pop();

           
            else if(ch==']' && st.peek()=='[') st.pop();
             
           
            else if(ch=='}' && st.peek()=='{') st.pop();
              
            else return false;
          }
          
          else
          {
            return false;
          }
        }
        
        else st.push(ch);
      }
      
      return st.isEmpty();
      
    }
}