class Solution {
    public boolean halvesAreAlike(String s) {
        
        s=s.toLowerCase();
        int n=s.length();
        return countVowels(s.substring(0,(n/2))) ==  countVowels(s.substring(n/2,n));
        
    }
    
    private int countVowels(String s)
    {
        int count=0;
        
        for(int i=0 ; i<s.length();i++)
        {
            char ch = s.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') count++;   
        }
        return count;
    }
}