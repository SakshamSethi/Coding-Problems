class Solution {
    public String removeDuplicates(String s) {
      Stack<Character> st = new Stack();
        
        for(char c : s.toCharArray())
        {
            if(!st.isEmpty() && c==st.peek())
            {
                st.pop();
                continue;
            }
            st.push(c);
        }
        StringBuffer ans = new StringBuffer();
        while(!st.isEmpty())
        {
            ans = ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}