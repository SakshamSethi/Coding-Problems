class Solution {
    public List<String> printVertically(String st) {
      
      String arr[] = st.split(" ");
      
      int max = 0;
      
      for(String str : arr)
      {
        max = Math.max(str.length() , max);
      }
      List<String> ans = new ArrayList<>();
      for(int i=0 ; i<max ; i++)
      {
        StringBuilder s = new StringBuilder();
        for( String str : arr)
        {
            s.append(i<str.length()?str.charAt(i):" ");
        }
            
        while(s.charAt(s.length()-1)==' ')
          s.deleteCharAt(s.length()-1);
        
        
        ans.add(s.toString());
      }
      
      return ans;
    }
}