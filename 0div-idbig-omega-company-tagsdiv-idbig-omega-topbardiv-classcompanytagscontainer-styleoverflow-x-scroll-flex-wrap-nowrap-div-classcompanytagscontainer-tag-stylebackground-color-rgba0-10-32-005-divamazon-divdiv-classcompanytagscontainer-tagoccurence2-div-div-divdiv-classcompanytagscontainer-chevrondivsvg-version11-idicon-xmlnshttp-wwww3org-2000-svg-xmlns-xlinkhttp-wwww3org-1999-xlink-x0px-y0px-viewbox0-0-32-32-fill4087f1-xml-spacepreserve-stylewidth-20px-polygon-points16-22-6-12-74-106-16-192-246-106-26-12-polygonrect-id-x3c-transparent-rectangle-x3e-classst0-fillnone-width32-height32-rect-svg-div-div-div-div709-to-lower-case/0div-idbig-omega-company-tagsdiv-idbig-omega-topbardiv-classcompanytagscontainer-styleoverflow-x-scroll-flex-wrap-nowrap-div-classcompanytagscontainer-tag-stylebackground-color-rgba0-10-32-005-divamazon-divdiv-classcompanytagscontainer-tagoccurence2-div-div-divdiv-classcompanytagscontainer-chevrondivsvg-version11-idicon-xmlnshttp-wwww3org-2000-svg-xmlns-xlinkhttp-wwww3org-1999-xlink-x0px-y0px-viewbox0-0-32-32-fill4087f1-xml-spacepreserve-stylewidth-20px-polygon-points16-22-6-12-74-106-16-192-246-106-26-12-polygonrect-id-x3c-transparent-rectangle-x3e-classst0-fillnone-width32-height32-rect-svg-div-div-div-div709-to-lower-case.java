class Solution {
    public String toLowerCase(String s) {
     
        StringBuilder str = new StringBuilder();
        
        for(char ch : s.toCharArray())
        {
            if(Character.isUpperCase(ch))
                str.append(Character.toLowerCase(ch));
            else
                str.append(ch);
            
        }
        return str.toString();
    }
}