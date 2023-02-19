class Solution {
    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    board[i][j]='.';
                }
            }
        List<List<String>> ans = new ArrayList<>();
        queens(board,0,ans);
        return ans;
    }
    static void queens(char[][] board , int row , List<List<String>>res)
        {
            if(row==board.length)
            {
                construct(board,res);
                return ;
            }
        for(int col =0;col<board.length;col++)
        {
            
            if(safe(board,row,col))
            {
            board[row][col]='Q';
            queens(board,row+1,res);
                board[row][col]='.';
        }
            
        }
        return;
        }
    static boolean safe(char[][] board,int r,int c)
    {
        int i=0;
        // For Upper Rows
        for(i=0;i<r;i++)
        {
            if(board[i][c]=='Q')
                return false;
        }
        // For left Diagonal 
        int maxL = Math.min(r,c);
          for(i=0;i<=maxL;i++)
        {
            if(board[r-i][c-i]=='Q')
                return false;
        }
        int maxR = Math.min(r,(board.length-c-1));
          for(i=0;i<=maxR;i++)
        {
            if(board[r-i][c+i]=='Q')
                return false;
        }
        return true;
    }
    static void construct(char[][] board,List<List<String>> res)
    {
        List<String> str = new ArrayList<>();
        
for(int i=0;i<board.length;i++)
{
    StringBuilder s = new StringBuilder();
  
    
    for(int j=0;j<board.length;j++)
    {
        if(board[i][j]=='Q')
        { s=s.append("Q");
        }else
            s=s.append(".");
    }

        str.add(new String(s));
}
        
        res.add(new ArrayList<String>(str));
    }
}