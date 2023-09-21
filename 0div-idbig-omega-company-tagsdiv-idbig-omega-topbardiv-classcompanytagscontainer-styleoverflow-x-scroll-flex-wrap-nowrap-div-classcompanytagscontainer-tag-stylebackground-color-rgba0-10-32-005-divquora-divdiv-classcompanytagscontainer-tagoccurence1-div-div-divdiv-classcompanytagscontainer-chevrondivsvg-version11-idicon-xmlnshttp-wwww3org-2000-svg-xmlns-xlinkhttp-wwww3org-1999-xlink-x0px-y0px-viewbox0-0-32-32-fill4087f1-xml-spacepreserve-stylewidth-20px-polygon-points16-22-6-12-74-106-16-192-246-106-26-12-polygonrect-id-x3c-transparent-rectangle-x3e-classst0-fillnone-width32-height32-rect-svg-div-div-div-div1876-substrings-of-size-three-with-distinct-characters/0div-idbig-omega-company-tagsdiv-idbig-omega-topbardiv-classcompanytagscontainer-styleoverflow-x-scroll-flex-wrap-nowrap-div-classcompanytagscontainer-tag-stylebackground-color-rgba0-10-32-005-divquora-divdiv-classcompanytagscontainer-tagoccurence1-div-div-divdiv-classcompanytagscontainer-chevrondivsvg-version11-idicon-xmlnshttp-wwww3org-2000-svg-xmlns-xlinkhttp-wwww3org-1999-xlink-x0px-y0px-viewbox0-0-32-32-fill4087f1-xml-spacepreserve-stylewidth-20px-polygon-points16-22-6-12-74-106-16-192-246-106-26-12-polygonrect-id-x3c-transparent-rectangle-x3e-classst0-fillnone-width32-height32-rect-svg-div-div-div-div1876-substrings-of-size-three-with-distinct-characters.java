class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
      
      for(int i=0 ; i<s.length()-2;i++)
      {
        Set<Character> st = new HashSet();
        for(int j=i;j<i+3;j++)
        {
          st.add(s.charAt(j));
        }
        if(st.size()==3) count++;
      }
      
      return count;
    }
}