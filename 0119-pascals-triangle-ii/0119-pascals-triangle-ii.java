class Solution {
    public List<Integer> getRow(int rowIndex) {
        
      long ele =1 ;
      List<Integer>ans = new ArrayList<>();
      ans.add((int)ele);
      
      for(int i=1 ; i<=rowIndex ; i++)
      {
        ele = ele*(rowIndex+1-i);
        ele = ele/i;
        ans.add((int)ele);
      }
      return ans;
      
    }
}