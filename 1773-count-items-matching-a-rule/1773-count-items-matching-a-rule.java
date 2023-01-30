class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int x = 0;
        int rind =0 ;
        if(ruleKey.equals("color")) rind=1;
        if(ruleKey.equals("name")) rind=2;
        
        int in = items.size() -1;
        
        while(in>=0)
        {
            if(((items.get(in)).get(rind)).equals(ruleValue) )
                x++;
            
            in--;
        }
                return x;

            
        
    }
}