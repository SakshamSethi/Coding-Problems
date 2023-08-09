class Solution {
    public boolean isLongPressedName(String name, String typed) {
      
      int i=0 ; 
      int j=0 ;
      
      int n = typed.length();
      int m = name.length();
      
      if(m>n)return false;
      
      if(n==m) return typed.equals(name);
      if(typed.charAt(0)!=name.charAt(0))return false;
      while(i<n && j<m)
      {
        
        if(name.charAt(j)==typed.charAt(i))
        {
          i++;
          j++;
        }
        else if(name.charAt(j)!=typed.charAt(i))
        {
          
          if(typed.charAt(i)!=typed.charAt(i-1)) return false;
          
          else i++;
          
        }
      }    
     if(j!=m)return false;
       while(i<n)
       {
         if(typed.charAt(i)!=name.charAt(m-1)) return false;
         i++;
       }
      return true;
    }
}