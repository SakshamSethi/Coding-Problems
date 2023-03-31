class Solution {
    public int longestValidParentheses(String s) {
       if(s.equals(""))return 0; 
        Stack<Character>ch = new Stack<>();
        Stack<Integer>idx = new Stack<>();
        idx.add(-1);
        int length=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                ch.push('(');
                idx.push(i);
                
            }
            else
            {
                if(!ch.isEmpty() && ch.peek()=='(')
                {
                    ch.pop();
                    idx.pop();
                    length = Math.max(length, i-idx.peek() );
                }
                else
                {
                    idx.push(i);
                }
            }
            
        }
        return length;
    }
}