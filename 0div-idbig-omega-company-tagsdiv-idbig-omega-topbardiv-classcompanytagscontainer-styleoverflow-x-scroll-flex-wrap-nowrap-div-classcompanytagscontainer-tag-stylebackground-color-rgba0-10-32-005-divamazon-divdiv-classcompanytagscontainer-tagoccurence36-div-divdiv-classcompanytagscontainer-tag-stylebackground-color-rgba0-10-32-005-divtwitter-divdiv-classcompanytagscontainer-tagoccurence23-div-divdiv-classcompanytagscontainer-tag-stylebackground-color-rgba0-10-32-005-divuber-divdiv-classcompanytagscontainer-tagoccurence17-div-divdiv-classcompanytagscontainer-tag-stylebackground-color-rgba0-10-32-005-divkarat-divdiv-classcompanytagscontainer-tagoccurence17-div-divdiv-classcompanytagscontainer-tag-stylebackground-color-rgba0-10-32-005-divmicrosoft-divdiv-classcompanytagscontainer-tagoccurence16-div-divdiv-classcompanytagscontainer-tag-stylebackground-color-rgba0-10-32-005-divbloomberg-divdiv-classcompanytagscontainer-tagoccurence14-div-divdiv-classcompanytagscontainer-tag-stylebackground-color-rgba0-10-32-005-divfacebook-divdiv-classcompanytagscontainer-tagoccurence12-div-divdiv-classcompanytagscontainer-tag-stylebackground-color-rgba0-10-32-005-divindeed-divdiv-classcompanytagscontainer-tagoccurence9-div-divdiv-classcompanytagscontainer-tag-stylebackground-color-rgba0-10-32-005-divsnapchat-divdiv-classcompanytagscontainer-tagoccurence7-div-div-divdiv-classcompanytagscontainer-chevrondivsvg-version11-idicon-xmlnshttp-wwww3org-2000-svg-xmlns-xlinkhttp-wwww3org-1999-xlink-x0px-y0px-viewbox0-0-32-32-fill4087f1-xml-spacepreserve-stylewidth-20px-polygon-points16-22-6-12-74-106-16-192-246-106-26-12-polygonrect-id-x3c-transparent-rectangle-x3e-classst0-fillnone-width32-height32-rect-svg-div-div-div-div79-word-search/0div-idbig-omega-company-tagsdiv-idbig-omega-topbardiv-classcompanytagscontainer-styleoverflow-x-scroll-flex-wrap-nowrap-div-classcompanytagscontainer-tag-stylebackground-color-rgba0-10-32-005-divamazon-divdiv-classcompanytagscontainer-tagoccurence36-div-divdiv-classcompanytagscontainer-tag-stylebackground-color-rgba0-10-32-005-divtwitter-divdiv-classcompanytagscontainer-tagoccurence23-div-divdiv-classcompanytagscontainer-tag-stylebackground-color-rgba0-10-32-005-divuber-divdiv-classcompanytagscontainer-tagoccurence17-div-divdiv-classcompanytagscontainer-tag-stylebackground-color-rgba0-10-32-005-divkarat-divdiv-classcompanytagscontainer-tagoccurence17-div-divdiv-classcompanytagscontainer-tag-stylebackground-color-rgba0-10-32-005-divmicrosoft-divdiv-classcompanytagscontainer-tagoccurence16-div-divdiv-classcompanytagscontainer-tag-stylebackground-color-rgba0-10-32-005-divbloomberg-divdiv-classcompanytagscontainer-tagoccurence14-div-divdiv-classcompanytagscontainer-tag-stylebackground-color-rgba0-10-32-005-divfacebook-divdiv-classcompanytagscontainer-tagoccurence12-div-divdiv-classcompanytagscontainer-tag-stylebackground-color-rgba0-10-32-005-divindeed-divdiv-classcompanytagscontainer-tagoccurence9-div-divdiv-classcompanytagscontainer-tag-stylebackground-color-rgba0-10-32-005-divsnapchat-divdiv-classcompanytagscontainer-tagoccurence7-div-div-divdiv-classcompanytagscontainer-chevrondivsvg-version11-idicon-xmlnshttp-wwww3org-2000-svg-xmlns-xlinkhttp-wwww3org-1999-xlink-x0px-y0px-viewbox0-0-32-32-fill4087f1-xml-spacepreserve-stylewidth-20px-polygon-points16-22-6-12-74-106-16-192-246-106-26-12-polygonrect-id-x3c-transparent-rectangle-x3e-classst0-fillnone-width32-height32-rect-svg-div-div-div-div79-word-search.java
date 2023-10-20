class Solution {
    public boolean exist(char[][] board, String word) {
     
        char ch = word.charAt(0);
        for(int i=0 ; i<board.length ; i++)
        {
            for(int j=0 ; j<board[0].length ; j++)
            {
                if(ch==board[i][j])
                {
                if( search(board,word,i,j,0) ) return true;    
                }
                
            }
           }
        return false;
    }
    
    boolean search(char[][]board , String word , int i , int j, int idx)
    {
        if(idx==word.length()) return true;
        
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || word.charAt(idx)!=board[i][j] || board[i][j]=='0') return false;
        
         
        char ch = board[i][j];
     board[i][j]='0';   
    boolean isTrue =  (search(board,word,i,j+1,idx+1)) ||  (search(board,word,i+1,j,idx+1)) ||  (search(board,word,i-1,j,idx+1)) ||  (search(board,word,i,j-1,idx+1)) ;
        board[i][j]=ch;
        return isTrue;
        
    }
    
}