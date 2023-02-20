class Solution {
    public void solveSudoku(char[][] board) {
        
    solve(board);
    }   
    public static boolean solve(char[][] board)
    {
       
        int row = -1;
        int col = -1;
        
        boolean emptyLeft = true;
        
        for(int i=0;i<9;i++)
        {
            for(int j =0;j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    row=i;
                    col=j;
                    emptyLeft =false;
                    break;
                }
            }
            if(emptyLeft==false) {break;}
            
            
        }
        if(emptyLeft==true) {return true;}
        
        for(char num='1';num<='9';num++)
        {
            
            if(isSafe(board,row,col,num))
            {
                board[row][col]=num;
                if(solve(board))
                {
                    return true;
                }
                else
                {
                    board[row][col]='.';
                
                }
            }
            
        }
        return false;
    }
    
    
    public static boolean isSafe(char[][] board , int row , int col , char num)
    {
        for(int i=0;i<9;i++)
        {
            if(board[row][i]==num) return false;
        }
        for(char[] nums : board)
        {
            if(nums[col]==num) return false;
        }
        int rstart = row - (row%3);
        int cstart = col - (col%3);
        
        for(int r=rstart ; r<(rstart+3);r++)
        {
            for(int c=cstart;c<(cstart+3);c++)
            {
                if(board[r][c]==num) return false;
                
            }
        }
   return true; 
    }
    
}