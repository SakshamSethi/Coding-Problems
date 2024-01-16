class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        
        
        for(String w : word1)
            str1.append(w);
        
        for(String w : word2)
            str2.append(w);
        System.out.println(str1+" "+str2);
        return str1.toString().equals(str2.toString());
    }
}