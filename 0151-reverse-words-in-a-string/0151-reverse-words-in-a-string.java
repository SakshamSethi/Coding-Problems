class Solution {
    public String reverseWords(String s) {
        
      String[] arr =s.trim().split(" +");
      
      StringBuilder str = new StringBuilder();
     
      for(int i=arr.length-1 ; i>0 ; i--)
      {
        str=str.append(arr[i]+' ');
      }
      str=str.append(arr[0]);
   
      return str.toString();
    }
}