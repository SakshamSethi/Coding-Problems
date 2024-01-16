/*class Solution {
    
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
    
}*/

// KMP

class Solution
{
     public int strStr(String haystack, String needle) {
    
         if(needle.isBlank()) return 0;
         if(needle.length() > haystack.length())return -1 ;
         
         int lps[] = buildLpsArray(needle);
         
         int i=0 ;
         int j=0;
         
         while(i<haystack.length())
         {
             if(haystack.charAt(i)==needle.charAt(j))
             {
                 i++; j ++;
                    
             }
             else
             {
                 if(j!=0)
                 {
                     j = lps[j-1];
                     
                 }
                 else
                 {
                     i++;
                 }
             }
              if(j==needle.length()) return (i-j);
         }
         
        return -1; 
        
         
     }
    
    private int[] buildLpsArray(String pattern)
    {
        int[] lps = new int[pattern.length()];
        int j=0;
        int i=1;
        
        while(i<pattern.length())
        {
            if(pattern.charAt(i)==pattern.charAt(j))
            {
                lps[i] = j+1;
                j++;
                i++;
                    
            }
            else if(j!=0) j = lps[j-1];
            else {
                lps[i]=0;
                i++;
            }
        }
        return lps;
    }
    
    
    
}