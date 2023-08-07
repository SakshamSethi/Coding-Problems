class Solution {
    public String interpret(String command) {
      
      String str = "";
      StringBuilder ans = new StringBuilder();
      for(int i=0 ; i<command.length();i++)
      {
        str=str+command.charAt(i);
        if(str.equals("G"))
        {
          ans = ans.append("G");
          str="";
        }
         if(str.equals("()"))
        {
          ans = ans.append("o");
          str="";
        }
        if(str.equals("(al)"))
        {
          ans=ans.append("al");
          str="";
        }
      }
   return   ans.toString();
    }
}