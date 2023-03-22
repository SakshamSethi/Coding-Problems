class Solution {
    public int minAddToMakeValid(String s) {
      
        Stack<Character> sq = new Stack();
        for(int i =0 ; i<s.length();i++)
        { 
        if( s.charAt(i)==')')
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