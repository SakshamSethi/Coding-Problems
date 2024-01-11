class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
     
        int count = 0 ;
        int rule =0;
        if(ruleKey.equals("color")) rule =1;
        if(ruleKey.equals("name")) rule =2;
    
         
        for(List<String> str : items)
        {
            if(str.get(rule).equals(ruleValue))count++;
        }
    return count;
    
    }
}