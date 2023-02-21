class Solution {
    public boolean exist(char[][] board, String word) {
  
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    if( check(board,word,0,i,j))
                    return true;
                }
            }
        }
return false;
      
    }
 
    static boolean check(char[][] b , String w,int s ,int r, int c)
    {
        if(s == w.length()) return true;
        
        if(r<0 || r>=b.length ||c<0 || c>=b[0].length || b[r][c]!=w.charAt(s)|| b[r][c]=='0' )
        {
            return false;
        } 
        
      
        
     
        
     
        b[r][c]='0';
        
       
        if(check(b,w,s+1,r+1,c))
        {
            return true;
        }

         if(check(b,w,s+1,r-1,c))
        {
            return true;
        }

         if(check(b,w,s+1,r,c-1))
        {
            return true;
        }

         if(check(b,w,s+1,r,c+1))
        {
            return true;
        }

        
        b[r][c]=w.charAt(s);
        
        return false;
        
    }
}