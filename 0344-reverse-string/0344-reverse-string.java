class Solution {
    public void reverseString(char[] s) {
      
      int end = s.length-1;
      
      reverse(s,0,end);
      
      
    }
  void reverse(char[]s , int start , int end)
  {
    if(start>end) return ;
    
    char temp = s[start];
    s[start]=s[end];
    s[end]=temp;
    
    reverse(s,start+1,end-1);
      
    
  }
}