class Solution {
    public boolean checkOnesSegment(String s) {
     int i=1; int n=s.length();
        
        while(i<n)
        {
            if(  s.charAt(i)=='1'&&s.charAt(i-1)=='0')
            {
                return false;
            }
            i++;
        }
        return true;
    }
}