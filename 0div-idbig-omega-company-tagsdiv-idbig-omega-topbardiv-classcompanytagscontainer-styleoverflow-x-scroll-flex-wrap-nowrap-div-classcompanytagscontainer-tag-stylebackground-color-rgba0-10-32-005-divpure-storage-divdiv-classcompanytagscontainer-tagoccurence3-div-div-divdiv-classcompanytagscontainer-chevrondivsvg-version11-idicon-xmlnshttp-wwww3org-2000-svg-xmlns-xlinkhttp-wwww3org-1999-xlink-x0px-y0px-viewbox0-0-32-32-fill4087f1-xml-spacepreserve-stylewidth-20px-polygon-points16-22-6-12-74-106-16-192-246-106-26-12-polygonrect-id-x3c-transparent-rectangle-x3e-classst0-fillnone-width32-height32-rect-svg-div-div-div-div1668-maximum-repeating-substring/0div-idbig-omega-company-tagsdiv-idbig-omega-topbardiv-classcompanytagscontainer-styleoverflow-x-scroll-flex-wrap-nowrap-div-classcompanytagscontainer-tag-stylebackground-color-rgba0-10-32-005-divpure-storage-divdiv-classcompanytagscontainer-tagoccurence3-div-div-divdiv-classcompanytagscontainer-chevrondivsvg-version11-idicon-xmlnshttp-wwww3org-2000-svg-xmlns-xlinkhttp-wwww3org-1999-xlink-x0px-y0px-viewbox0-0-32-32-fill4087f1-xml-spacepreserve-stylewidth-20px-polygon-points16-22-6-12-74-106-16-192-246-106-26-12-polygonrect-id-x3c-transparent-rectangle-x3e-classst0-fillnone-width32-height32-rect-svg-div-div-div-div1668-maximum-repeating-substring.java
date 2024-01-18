class Solution {
    public int maxRepeating(String sequence, String word) {
        
        int count = 0;
        StringBuilder w = new StringBuilder(word);
        
        while(w.length()<=sequence.length())
        {
           if(sequence.contains(w))
           {
               count++;
               
           }
            w=w.append(word);
                
        }
        return count;
        
    }
}