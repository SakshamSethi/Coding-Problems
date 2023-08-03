class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
      int count=0 ;
      Arrays.sort(g);
      Arrays.sort(s);
      int n = s.length;
      int i=0;
      for(int j=0 ; j<n && i<g.length ; j++)
      {
        if(s[j]>=g[i]) i++;
      }
      return i;
    }
}