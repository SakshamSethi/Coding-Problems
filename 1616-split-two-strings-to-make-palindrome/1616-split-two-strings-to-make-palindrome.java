class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        
        int n = a.length();
        if(n==1) return true;
        int s=0;
        int e=b.length()-1;
        for(s=0;s<b.length();s++,e--)
        {
            if(b.charAt(s)!=a.charAt(e))
                break;
        }
        
        if(e==-1) return true;
        
        
        if(isPalindrome(a,s,e))return true;
        if(isPalindrome(b,s,e))return true;
        
           e=b.length()-1;
        for(s=0;s<b.length();s++,e--)
        {
            if(a.charAt(s)!=b.charAt(e))
                break;
        }
        
        if(e==-1) return true;
        
        
        if(isPalindrome(a,s,e))return true;
        if(isPalindrome(b,s,e))return true;
        
        

        
        return false;
    }
 boolean isPalindrome(String s,int st,int e)
 {
    
     
    while(st<=e)
    {
        if(s.charAt(st)!=s.charAt(e))
            return false;
    
        st++;
        e--;
    }
     return true;
 }
    
}