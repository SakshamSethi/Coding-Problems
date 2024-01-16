class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder ans = new StringBuilder();
      
         
        while(columnNumber!=0)
        {
              columnNumber--;
            int rem = columnNumber%26;
            ans.append((char)(rem+'A') );
            columnNumber /=26;
             
        }
        return ans.reverse().toString();
    }
}