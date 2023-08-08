class Solution {
    public boolean judgeCircle(String moves) {
      
      int x=0 , y=0 ;
      int n = moves.length();
      for(int i=0 ; i< n ; i++)
      {
        switch(moves.charAt(i))
        {
          case 'U' : y--;
              break;
          case 'D' : y++;
            break;
          case 'L': x++;
            break;
          case 'R': x--;
            break;
        }
      }
      
      return x==0&&y==0 ;
    }
}