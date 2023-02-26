class Solution {
    public List<Integer> diffWaysToCompute(String e) {
     
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<e.length();i++)
        {
            if(e.charAt(i)=='+'|| e.charAt(i)=='*'||e.charAt(i)=='-')
            {
            List<Integer> left = diffWaysToCompute(e.substring(0,i));
            List<Integer> right = diffWaysToCompute(e.substring(i+1));
            int c=0;
                for(Integer a : left)
                {
                    for(Integer b : right)
                    {
                        switch(e.charAt(i))
                        {
                            case '+': c=a+b;
                                break;
                                case '-': c=a-b;
                                break;
                                case '*': c=a*b;
                                break;
                                
                                
                        }
                                ans.add(c);
                    }
                }
        
                
            }
            
          
        }
          if(ans.size()==0)
            {
                ans.add(Integer.parseInt(e));
            }
            return ans;
        
    }
}