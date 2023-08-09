class Solution {
    public String longestCommonPrefix(String[] strs) {
      
   
      
  Arrays.sort(strs);
      
      StringBuilder str = new StringBuilder("");
      
      compare(str,strs[0],strs[strs.length-1]);
      
      return str.toString();
      
    }
  void compare(StringBuilder str , String s1 , String s2)
  {
    int i =0 ;
    int j=0;
    
    while(i<s1.length())
    {
      if(s1.charAt(i)==s2.charAt(j)){ str.append(s1.charAt(i));
                                    i++;j++;}
      else break ;
       
    }
    return;
  }
}