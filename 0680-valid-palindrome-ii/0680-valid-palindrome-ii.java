class Solution {
    public boolean validPalindrome(String s) {
        
        int i=0;
        int j=s.length()-1; int flag=1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            if(s.charAt(i)!=s.charAt(j))
            {
               return Pal(s,i+1,j) || Pal(s,i,j-1);
            }
            
        }
        return true;
        
    }
    boolean Pal(String s , int i, int j)
    {
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
                return false;
            
            i++; j--;
        }
        return true;
    }
    
}