class Solution {
    public String removeDuplicates(String s, int k) {
      
        Stack<int[]> st = new Stack();
        
        for(char ch : s.toCharArray())
        {
            if(!st.isEmpty() && st.peek()[0]==ch)
            {
                st.peek()[1]++;
            }
            else
            {
                st.push(new int[]{ch,1});
            }
            
            if(st.peek()[1]==k)
                st.pop();
        }
        
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty())
        {
            while(st.peek()[1]>0)
            {
                str.append((char)st.peek()[0]);
                st.peek()[1]--;
            }
            st.pop();
        }
        return str.reverse().toString();
        
    }
}