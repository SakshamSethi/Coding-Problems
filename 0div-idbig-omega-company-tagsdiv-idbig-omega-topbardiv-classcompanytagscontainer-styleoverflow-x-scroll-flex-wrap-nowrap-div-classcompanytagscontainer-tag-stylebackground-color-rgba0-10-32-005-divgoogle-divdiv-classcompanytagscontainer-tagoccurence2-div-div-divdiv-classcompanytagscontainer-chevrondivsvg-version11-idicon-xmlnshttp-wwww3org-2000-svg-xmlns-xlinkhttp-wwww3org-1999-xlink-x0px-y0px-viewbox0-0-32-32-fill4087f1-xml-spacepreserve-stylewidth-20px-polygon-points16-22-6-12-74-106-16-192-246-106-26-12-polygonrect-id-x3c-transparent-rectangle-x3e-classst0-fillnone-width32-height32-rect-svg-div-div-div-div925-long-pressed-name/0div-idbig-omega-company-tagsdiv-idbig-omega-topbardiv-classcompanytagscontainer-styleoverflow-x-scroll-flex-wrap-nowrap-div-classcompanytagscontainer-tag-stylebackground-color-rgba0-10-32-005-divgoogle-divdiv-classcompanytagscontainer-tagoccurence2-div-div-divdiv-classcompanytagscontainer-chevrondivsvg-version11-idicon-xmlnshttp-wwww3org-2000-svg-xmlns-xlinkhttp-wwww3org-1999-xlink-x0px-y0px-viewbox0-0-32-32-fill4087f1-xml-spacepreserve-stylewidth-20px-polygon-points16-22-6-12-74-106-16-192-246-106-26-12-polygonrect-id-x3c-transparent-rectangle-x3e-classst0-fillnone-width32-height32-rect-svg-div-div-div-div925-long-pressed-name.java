class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        int i = 0;
        int j = 0;
        
        while(i<typed.length())
        {
            if(j<name.length() && name.charAt(j)==typed.charAt(i)) 
            {
                i++ ; j++;
            }
            else if(j==name.length() && name.charAt(j-1)!=typed.charAt(i))
            {
                break;
            }
            else if(j==name.length() && name.charAt(j-1)==typed.charAt(i))
            {
                i++;
            }
            else if(i>0 && name.charAt(j-1)==typed.charAt(i) &&                                         typed.charAt(i)==typed.charAt(i-1))
            {
                i++;
            }
            else
            {
                break;
            }
            
            
        }
      if(i!=typed.length())return false;
        return j==name.length() ;
    }
}