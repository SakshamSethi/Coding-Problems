class Solution {
    public int maxRepeating(String sequence, String word) {
      
      int wordLength = word.length();
      int seqLength = sequence.length();
      
      int maxTimes = seqLength/wordLength ;
      
  int k=0 ;
      String temp="";
      for(int i =0 ; i<maxTimes ; i++)
      {
         temp+= word ;
        
        if(sequence.contains(temp))
          k=i+1;               
      }
      
      return k;
    }
}