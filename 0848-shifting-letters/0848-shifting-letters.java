class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
      int len = s.length();
       
      char[] arr = s.toCharArray();
      int shiftNumber=0;
      for(int i=n-1 ; i>=0 ; i--)
      {
         shiftNumber = (shiftNumber+shifts[i])%26;
          arr[i] = (char) ((arr[i]-'a'+shiftNumber)%26+'a');
      }
      
      return new String(arr);
    }
}