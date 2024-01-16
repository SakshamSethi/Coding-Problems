class Solution {
    
    private final int prime = 101 ;
    
    public int strStr(String haystack, String needle) {
        
        return  haystack.length()>=needle.length()?search(haystack,needle):-1;
    }
    
    private double calculateHash(String str)
    {
        double hash = 0 ;
        for(int i=0 ; i<str.length();i++)
        {
            hash+= str.charAt(i)*Math.pow(prime , i);
        }
        return hash;
    }
    private double updateHash(double prevHash , char prevChar ,char newChar , int patternLength)
    {
        double newHash = (prevHash-prevChar)/prime;
        newHash += newChar*Math.pow(prime,patternLength-1);
        return newHash;
    }
    
    private int search(String text , String pattern)
    {
        int patternLen = pattern.length();
        double patternHash = calculateHash(pattern);
        double textHash = calculateHash(text.substring(0,patternLen));
        
        for(int i=0 ; i<=text.length()-patternLen;i++)
        {
            if(patternHash==textHash)
            {
                if(text.substring(i,i+patternLen).equals(pattern))
                    return i;
            }
            if(i<text.length()-patternLen)
            {
                textHash = updateHash(textHash , text.charAt(i),text.charAt(i+patternLen),patternLen);
            }
        }
        
        return -1;
    }
    
}