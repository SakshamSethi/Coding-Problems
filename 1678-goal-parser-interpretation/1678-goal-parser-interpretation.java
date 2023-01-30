class Solution {
    public String interpret(String command) {
        StringBuffer s = new StringBuffer();
        for(int i=0;i<command.length();i++)
        {
            if(command.charAt(i)=='('&&command.charAt(i+1)==')')
            {
                s.append('o'); i=i+1;
            }
             if(command.charAt(i)=='('&&command.charAt(i+1)=='a')
             {
                 s.append("al"); i+=3;
             }
            if(command.charAt(i)=='G')
            {
                s.append('G');
            }
        }
        return s.toString();
    }
}