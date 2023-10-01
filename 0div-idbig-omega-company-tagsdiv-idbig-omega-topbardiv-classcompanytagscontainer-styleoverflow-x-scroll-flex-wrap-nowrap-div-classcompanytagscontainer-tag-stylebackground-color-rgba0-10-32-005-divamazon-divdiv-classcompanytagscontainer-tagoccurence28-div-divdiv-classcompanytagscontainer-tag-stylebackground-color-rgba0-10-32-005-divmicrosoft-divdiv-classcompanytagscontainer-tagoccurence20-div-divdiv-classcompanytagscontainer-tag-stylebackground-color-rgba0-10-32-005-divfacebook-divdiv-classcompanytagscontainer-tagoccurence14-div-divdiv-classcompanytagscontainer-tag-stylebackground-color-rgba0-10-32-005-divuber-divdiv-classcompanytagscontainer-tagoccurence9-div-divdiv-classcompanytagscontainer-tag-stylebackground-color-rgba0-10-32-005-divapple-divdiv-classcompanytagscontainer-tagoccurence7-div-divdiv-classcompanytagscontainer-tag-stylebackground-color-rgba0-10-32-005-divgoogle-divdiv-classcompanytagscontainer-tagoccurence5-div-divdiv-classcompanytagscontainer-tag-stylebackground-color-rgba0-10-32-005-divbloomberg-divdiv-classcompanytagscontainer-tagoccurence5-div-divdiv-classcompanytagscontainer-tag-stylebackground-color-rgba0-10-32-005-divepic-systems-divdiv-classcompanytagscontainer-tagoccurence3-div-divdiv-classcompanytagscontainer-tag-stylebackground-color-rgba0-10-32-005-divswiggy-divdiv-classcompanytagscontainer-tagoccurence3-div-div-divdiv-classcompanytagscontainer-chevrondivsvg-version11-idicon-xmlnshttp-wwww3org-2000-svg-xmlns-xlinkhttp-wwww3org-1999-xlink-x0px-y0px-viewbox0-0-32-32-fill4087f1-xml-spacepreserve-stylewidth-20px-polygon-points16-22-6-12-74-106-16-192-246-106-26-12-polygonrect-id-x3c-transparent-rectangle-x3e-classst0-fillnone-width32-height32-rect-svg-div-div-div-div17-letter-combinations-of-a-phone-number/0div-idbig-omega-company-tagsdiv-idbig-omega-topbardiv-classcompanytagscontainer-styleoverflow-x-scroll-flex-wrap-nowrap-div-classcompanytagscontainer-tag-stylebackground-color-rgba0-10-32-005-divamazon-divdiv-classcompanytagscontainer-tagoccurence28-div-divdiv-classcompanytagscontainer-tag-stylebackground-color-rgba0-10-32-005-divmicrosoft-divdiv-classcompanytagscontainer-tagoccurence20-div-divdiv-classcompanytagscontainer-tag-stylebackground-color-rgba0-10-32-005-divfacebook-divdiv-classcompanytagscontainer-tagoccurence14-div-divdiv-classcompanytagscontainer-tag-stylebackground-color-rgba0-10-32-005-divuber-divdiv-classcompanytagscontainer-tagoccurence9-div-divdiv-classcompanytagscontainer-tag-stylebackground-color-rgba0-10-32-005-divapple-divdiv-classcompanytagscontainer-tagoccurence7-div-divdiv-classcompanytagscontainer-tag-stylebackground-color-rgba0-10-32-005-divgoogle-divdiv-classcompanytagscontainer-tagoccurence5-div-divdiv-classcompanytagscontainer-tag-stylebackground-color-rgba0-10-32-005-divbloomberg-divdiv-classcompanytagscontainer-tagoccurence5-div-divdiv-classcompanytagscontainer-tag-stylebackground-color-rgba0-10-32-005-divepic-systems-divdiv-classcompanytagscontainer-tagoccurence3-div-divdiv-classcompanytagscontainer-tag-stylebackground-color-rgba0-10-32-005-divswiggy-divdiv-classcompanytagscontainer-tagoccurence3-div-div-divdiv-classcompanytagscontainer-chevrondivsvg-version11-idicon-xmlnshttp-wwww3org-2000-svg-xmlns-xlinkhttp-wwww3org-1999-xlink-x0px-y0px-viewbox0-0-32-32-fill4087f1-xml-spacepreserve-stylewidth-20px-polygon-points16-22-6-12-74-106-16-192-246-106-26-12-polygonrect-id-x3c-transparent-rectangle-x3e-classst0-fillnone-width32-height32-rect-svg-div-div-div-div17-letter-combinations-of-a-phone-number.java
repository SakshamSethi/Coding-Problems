class Solution {
    public List<String> letterCombinations(String digits) {
      
      if(digits=="" || digits.length()==0) return new ArrayList<String>();
      
      List<String> ans = new ArrayList<>();
      
      phonePad("",digits,ans);
      
      return ans;
    }
  
  void phonePad(String p , String up , List<String>ans)
  {
    if(up.length()==0)
    {
      ans.add(p);
      return;
    }
      
    int digit = up.charAt(0)-'0';
    if(digit<7)
    {
      for(int i= (digit-2)*3 ; i<(digit-1)*3;i++)
      {
        char ch =  (char)('a'+ i) ;
        
        phonePad(p+ch,up.substring(1),ans);
      }
    }
    else if(digit==7)
    {
      for(int i= (digit-2)*3 ; i<=(digit-1)*3;i++)
      {
         char ch =  (char)('a'+ i) ;
        
        phonePad(p+ch,up.substring(1),ans);
      }
    }
    else if(digit==8)
    {
      for(int i= ((digit-2)*3) +1 ; i<=(digit-1)*3;i++)
      {
        char ch =  (char)('a'+ i) ;
        
        phonePad(p+ch,up.substring(1),ans);
      }
    }
   if(digit==9)
    {
      for(int i= (digit-2)*3+1 ; i<=(digit-1)*3+1;i++)
      {
          char ch =  (char)('a'+ i) ;
        
        phonePad(p+ch,up.substring(1),ans);
      }
    }
    
  }
  
}