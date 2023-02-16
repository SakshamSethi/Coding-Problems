class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0) return new ArrayList<String>();
        return pad("",digits);
    }
    List<String> pad(String p , String up)
    {
        if(up.isEmpty())
        {
            List<String> str = new ArrayList<String>();
     if(p.isEmpty())
     {
         return str;
     }
            str.add(p);
            return str;
        }
        
        List<String> list = new ArrayList<>();
        
        
        int digit = up.charAt(0) -'0';
    
        if(digit==7)
        { 
            
            
            for(int i=(digit-3)*3 + 3;i<(digit-2)*3+4;i++)
            {
                char ch = (char)('a'+i);
                list.addAll(pad(p+ch,up.substring(1)));
            }
        }
        else if(digit==8)
        {
           for(int i=(digit-3)*3 +4;i<(digit-3)*3+7;i++)
            {
                char ch = (char)('a'+i);
                list.addAll(pad(p+ch,up.substring(1)));
            } 
        }
         else  if(digit==9)
        { 
            
            
            for(int i=22;i<26;i++)
            {
                char ch = (char)('a'+i);
                list.addAll(pad(p+ch,up.substring(1)));
            }
        }
        else
        {
            for(int i=(digit-2)*3;i<(digit-1)*3;i++)
            {
                char ch = (char)('a'+i);
                list.addAll(pad(p+ch,up.substring(1)));
            }
        }
        return list;
    }
}