class Solution {
    public void reverseString(char[] s) {
        
        int e = s.length-1;
    ans(s,0,e);
    }
    
    static void ans(char[] c ,int s ,int e)
    {
        if(s>=e) return;
        
        
            char temp = c[s];
            c[s]=c[e];
            c[e]=temp;
        
            ans(c,s+1,e-1);
        
       
    }
}