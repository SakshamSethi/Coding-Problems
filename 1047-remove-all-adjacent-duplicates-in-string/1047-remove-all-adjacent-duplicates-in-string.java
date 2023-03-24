class Solution {
    public String removeDuplicates(String s) {
   
        // Brute Force Using a separate Stack for calculation
        
        /*Stack<Character> st = new Stack();
        
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
    
 */   
    //Optimization : Use String Builder As a Stack It self;
    

StringBuilder sb = new StringBuilder();
for(char c : s.toCharArray())
{
    if(sb.length()>0 && sb.charAt(sb.length()-1)==c)
    {
        sb=sb.deleteCharAt(sb.length()-1);
    }
    else
    {
        sb=sb.append(c);
    }
}
        return sb.toString();
}
}