class Solution {
    public int minAddToMakeValid(String s) {
      
        Stack<Character> sq = new Stack();
        for(char c : s.toCharArray())
        { 
        if( c ==')')
        {
            if(!sq.isEmpty() && sq.peek()=='(')
                
            {
                sq.pop();
            }
            else
            {
                sq.push(')');
            }
        }
            else
            {
                sq.push('(');
            }
        }
        return sq.size();
    }
}