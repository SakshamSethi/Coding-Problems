class Solution {
    public String removeOuterParentheses(String s) {
     
        StringBuffer ans = new StringBuffer();
        int counter=0;
        
        for(char ch : s.toCharArray())
        {
            if(ch=='(')
            {
                if(counter>0)
                {
                    ans=ans.append(ch);
                }
                
                counter++;
            }
            if(ch==')')
            {
                if(counter>1)
                {
                    ans=ans.append(ch);
                }
                counter--;
            }
        }
        return ans.toString();
        
    }
}