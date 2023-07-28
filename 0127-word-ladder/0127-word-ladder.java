class Solution {
  class Pair
  {
String str ; int steps;
    Pair(String str , int steps)
    {
      this.str = str ;
      this.steps=steps;
    }
  }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        
     HashSet<String>set = new HashSet();
      
      for(int i=0 ; i <wordList.size();i++)
      {
        set.add(wordList.get(i));
      }
      
      Queue<Pair> q = new LinkedList<>();
      
      q.add(new Pair(beginWord , 1));
      set.remove(beginWord);
     
      while(!q.isEmpty())
      {
        String word = q.peek().str;
        int steps = q.peek().steps;
        q.remove();
        
        if(word.equals(endWord)) return steps;
        
        for(int i=0 ; i<word.length();i++)
        {
          
          for(char ch ='a' ; ch<='z';ch++)
          {
            char[] replacedCharArray = word.toCharArray();
            
            replacedCharArray[i]=ch;
            String newWord = new String(replacedCharArray);
            
            if(set.contains(newWord))
            {
              set.remove(newWord);
                q.add(new Pair(newWord,steps+1));
            }
          }
        }
        
      }
      return 0;
    }
}