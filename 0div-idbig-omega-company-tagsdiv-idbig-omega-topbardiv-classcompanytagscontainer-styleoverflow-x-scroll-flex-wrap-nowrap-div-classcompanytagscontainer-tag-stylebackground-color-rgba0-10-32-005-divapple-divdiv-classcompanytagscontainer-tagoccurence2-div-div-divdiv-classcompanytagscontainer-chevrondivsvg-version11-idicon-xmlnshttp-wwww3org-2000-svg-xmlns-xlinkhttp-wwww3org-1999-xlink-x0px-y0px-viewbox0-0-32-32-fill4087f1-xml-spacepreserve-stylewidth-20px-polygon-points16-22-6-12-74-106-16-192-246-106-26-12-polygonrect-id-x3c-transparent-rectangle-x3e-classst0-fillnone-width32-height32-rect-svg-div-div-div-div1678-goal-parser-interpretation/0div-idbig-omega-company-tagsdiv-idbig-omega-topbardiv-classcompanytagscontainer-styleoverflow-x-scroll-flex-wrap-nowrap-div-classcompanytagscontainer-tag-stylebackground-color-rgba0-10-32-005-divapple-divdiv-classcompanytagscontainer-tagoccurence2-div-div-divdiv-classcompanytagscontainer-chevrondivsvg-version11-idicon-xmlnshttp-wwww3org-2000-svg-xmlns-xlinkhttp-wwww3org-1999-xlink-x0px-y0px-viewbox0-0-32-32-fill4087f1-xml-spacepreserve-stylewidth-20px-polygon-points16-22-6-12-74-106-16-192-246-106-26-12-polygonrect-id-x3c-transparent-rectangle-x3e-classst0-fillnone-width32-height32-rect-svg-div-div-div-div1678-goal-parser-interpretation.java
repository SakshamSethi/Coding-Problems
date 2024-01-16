class Solution {
    public String interpret(String command) {
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0 ; i<command.length();i++)
        {
            if(command.charAt(i)=='G')
                str.append('G');
            
            else if (command.charAt(i)=='(' && command.substring(i,i+2).equals("()"))
                str.append('o');
            else if(command.charAt(i)=='(' && command.substring(i,i+4).equals("(al)"))
                str.append("al");
            
        }
        return str.toString();
    }
}