class Solution {
    public List<Integer> diffWaysToCompute(String e) {
        
      List<Integer> ans = new ArrayList<>();
      
      for(int i=0 ; i<e.length();i++)
      {
        char ch = e.charAt(i);
        if(ch=='+'||ch=='-'||ch=='*')
        {
          List<Integer> left = diffWaysToCompute(e.substring(0,i));
          List<Integer> right = diffWaysToCompute(e.substring(i+1));
          
          for(int a : left)
          {
            for(int b: right)
            {
              switch(ch)
              {
                  case '+' : ans.add(a+b);
                  break;
                  case '-' : ans.add(a-b);
                  break; 
                 case '*' : ans.add(a*b);
                  break;
              }
            }
          }
          
        }
      }
      if(ans.size()==0) ans.add(Integer.parseInt(e));
      return ans;
    }
}