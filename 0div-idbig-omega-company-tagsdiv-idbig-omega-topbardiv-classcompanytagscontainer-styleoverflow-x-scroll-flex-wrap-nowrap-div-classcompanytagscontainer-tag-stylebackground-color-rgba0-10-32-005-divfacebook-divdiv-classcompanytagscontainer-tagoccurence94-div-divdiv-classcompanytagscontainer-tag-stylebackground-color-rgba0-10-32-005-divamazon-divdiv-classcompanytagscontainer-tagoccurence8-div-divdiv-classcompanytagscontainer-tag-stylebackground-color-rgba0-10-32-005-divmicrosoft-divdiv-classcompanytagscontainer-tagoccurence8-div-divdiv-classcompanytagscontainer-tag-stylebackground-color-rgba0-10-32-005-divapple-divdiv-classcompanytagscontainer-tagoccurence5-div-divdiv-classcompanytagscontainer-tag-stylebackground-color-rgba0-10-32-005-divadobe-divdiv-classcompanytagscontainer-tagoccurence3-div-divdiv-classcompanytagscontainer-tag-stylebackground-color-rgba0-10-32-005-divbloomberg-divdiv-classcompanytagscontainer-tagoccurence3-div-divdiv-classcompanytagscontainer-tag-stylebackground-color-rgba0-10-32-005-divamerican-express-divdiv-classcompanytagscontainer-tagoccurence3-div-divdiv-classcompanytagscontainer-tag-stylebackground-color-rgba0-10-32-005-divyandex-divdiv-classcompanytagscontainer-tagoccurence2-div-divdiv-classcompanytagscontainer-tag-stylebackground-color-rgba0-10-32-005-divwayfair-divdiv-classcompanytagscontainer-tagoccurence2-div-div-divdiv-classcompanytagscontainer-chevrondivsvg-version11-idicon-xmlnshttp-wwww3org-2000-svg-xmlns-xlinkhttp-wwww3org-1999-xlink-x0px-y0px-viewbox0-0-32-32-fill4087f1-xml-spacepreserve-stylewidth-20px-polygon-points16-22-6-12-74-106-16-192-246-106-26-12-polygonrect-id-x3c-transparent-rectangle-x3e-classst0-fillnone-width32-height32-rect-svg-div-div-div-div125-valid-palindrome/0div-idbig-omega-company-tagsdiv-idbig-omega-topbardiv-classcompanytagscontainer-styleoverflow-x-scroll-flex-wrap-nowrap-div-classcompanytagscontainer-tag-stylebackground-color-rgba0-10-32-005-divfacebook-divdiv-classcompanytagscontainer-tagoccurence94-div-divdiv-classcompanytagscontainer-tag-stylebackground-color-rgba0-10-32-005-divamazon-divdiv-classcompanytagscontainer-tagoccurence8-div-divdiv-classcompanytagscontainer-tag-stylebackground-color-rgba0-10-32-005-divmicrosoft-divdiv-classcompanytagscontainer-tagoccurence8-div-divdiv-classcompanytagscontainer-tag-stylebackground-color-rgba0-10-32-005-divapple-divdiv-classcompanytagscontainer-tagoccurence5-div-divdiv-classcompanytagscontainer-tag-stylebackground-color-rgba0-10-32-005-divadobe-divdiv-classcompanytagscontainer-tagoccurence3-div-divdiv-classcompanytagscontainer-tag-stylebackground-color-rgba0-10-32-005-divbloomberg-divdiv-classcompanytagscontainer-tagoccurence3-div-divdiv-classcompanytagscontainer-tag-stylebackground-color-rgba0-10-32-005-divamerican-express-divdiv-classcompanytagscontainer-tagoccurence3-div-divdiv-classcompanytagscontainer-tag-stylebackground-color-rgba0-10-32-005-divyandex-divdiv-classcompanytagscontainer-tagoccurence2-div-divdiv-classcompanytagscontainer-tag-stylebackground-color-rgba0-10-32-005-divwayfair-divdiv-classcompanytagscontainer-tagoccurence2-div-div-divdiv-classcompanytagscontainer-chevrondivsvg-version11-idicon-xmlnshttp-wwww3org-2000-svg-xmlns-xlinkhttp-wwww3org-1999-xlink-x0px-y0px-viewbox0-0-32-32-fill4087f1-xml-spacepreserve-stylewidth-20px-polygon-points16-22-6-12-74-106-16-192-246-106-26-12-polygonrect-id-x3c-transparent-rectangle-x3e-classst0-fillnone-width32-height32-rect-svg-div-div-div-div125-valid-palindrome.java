class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder str = new StringBuilder();
        s=s.toLowerCase();
        for(char ch : s.toCharArray())
        {
            if( (ch<='z' && ch>='a') || (ch<='9' && ch>='0') ) str.append(ch);
        }
        int i=0 ; 
        int j = str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}