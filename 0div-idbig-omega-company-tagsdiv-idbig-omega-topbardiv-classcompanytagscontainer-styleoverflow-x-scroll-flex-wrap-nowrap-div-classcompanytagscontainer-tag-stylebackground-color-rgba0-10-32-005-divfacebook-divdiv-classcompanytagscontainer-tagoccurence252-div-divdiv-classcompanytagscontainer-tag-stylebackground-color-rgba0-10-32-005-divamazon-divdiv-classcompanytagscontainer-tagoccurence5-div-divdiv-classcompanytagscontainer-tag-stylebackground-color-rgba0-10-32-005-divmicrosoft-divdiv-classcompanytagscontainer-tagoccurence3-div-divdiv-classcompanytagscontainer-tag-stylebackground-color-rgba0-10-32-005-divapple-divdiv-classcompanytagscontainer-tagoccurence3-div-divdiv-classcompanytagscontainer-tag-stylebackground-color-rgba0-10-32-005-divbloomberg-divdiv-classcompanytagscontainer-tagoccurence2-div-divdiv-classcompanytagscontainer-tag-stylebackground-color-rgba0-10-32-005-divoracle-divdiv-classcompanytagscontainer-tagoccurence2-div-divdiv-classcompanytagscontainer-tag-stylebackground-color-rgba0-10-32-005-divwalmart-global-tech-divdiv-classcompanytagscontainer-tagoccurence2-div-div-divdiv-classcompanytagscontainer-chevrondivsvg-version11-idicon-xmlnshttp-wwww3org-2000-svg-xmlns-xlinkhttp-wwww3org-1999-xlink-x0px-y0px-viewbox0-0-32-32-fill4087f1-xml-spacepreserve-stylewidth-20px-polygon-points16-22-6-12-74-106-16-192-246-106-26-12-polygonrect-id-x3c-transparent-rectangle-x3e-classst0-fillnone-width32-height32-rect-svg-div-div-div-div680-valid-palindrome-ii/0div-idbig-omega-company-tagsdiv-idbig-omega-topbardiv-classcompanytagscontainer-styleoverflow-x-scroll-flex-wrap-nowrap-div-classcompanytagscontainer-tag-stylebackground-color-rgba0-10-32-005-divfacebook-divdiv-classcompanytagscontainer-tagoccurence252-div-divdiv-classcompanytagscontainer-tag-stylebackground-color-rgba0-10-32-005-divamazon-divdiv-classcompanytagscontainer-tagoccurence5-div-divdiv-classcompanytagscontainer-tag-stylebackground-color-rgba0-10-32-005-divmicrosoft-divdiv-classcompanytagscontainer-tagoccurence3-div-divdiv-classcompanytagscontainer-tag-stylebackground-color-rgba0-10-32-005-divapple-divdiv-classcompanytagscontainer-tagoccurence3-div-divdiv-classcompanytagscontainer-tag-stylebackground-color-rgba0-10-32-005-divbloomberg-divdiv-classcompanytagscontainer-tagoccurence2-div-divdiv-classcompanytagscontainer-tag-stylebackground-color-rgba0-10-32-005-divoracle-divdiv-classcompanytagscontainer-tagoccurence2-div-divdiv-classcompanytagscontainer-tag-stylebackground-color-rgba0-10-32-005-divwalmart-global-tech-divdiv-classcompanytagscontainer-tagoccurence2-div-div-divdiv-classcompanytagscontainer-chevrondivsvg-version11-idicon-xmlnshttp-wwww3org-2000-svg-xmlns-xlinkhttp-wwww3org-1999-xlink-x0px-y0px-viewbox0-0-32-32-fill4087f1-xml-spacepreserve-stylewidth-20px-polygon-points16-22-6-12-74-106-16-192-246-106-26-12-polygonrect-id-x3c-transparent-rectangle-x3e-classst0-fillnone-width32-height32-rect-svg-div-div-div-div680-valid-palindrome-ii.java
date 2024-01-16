class Solution {
    public boolean validPalindrome(String s) {
        
        return isValid(s,0);
    }
    private boolean isValid(String s , int counter)
    {
        if(counter>1)return false;
        int i = 0; 
        int j= s.length()-1;
 
        while(i<j)
        {
            boolean isLeft=false , isRight=false;
            if(s.charAt(i)!=s.charAt(j))
            {
               return isValid(s.substring(0,i)+s.substring(i+1,s.length()),counter+1 ) ||
                      isValid(s.substring(0,j)+s.substring(j+1,s.length()),counter+1) ;  
            }
            i++;
            j--;
        }
        return true;
            
    }
}