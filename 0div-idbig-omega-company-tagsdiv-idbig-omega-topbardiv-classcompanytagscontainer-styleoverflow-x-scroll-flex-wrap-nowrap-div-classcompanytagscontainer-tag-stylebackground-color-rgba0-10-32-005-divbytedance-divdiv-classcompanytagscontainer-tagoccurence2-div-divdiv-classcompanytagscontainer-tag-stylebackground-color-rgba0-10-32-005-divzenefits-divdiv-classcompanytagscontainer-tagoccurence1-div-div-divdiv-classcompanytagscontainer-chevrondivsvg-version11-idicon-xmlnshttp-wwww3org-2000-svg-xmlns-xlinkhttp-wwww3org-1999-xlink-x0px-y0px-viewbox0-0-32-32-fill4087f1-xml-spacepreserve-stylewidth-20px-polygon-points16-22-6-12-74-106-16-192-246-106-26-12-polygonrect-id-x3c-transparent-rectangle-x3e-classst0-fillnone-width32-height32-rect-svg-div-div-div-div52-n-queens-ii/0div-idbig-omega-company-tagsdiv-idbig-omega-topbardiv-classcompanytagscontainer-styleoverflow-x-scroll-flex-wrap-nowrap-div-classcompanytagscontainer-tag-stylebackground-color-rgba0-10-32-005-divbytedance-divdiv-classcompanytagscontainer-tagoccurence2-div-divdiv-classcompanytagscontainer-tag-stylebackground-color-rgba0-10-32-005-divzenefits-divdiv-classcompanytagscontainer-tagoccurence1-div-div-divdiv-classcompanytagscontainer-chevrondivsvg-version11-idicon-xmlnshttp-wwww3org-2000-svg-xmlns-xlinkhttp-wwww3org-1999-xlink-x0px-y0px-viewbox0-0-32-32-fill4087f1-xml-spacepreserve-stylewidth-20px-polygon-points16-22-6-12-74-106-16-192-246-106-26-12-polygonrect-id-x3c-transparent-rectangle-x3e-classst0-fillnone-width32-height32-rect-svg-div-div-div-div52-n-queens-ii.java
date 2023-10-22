class Solution {
    public int totalNQueens(int n) {
       char[][] board = new char[n][n];
        
        Set<List<String>>ans = new HashSet<>();
        
        compute(board ,0, n , ans);
        
        return ans.size() ;
          
    }
     void compute(char[][]board , int i   , int n , Set<List<String>>ans)
    {
        if(i==n)
        {
            construct(board, ans);
        }
        
         
        for(int j=0 ; j<n ; j++)
        {
            if(isSafe(board,i,j,n))
            {
                board[i][j]='Q';
                compute(board,i+1,n,ans);
                board[i][j]='.';
            }
        }
        
    }
    boolean isSafe(char[][]board , int i , int j,int n)
    {
        // check same col 
        int row = i-1;
        int col = j;
        while(row>=0)
        {
            if(board[row][j]=='Q') return false;
            row--;
        }
        row= i-1;
        col=j-1;
        while(row>=0 && col>=0)
        {
            if(board[row][col]=='Q')return false;
            row--;
            col--;
        }
         row = i-1 ;
        col = j+1;
        while(row>=0 && col<n)
        {
            if(board[row][col]=='Q') return false;
            row--;
            col++;
        }
        
        return true;
    }
    
    void construct(char[][]board , Set<List<String>>ans)
    {
        List<String> temp = new ArrayList<>();
        
       
        
        for(char[] row : board)
        {
          StringBuilder str = new StringBuilder();
            
            for(char ch : row)
            {
                if(ch=='Q') str.append('Q');
                else str.append('.');
            }
            temp.add(str.toString());
        }
        ans.add(new ArrayList(temp));
    }
}