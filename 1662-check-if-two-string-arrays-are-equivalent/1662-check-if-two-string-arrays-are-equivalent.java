class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        
        for(String as : word1)
            a.append(as);
        
                for(String as : word2)
                    b.append(as);
        
        
        return (a.toString()).equals(b.toString());
    }
}