class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
      int count = 0;
      int n = items.size();
      
      int check = 0;
      
      if(ruleKey.equals("color")) check =1 ;
      if(ruleKey.equals("name")) check = 2;
      
    
      for(List<String> item : items)
      {
        if(item.get(check).equals(ruleValue)) count++;
      }
      return count ;
    }
}