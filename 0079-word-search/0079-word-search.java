class Solution {
    public boolean exist(char[][] board, String word) {
      
      char ch = word.charAt(0);
      
      // starting point 
    int[]row = {-1,0,1,0};
      int[]col ={0,-1,0,1};
      int n = board.length;
      int m = board[0].length;
      for(int i=0 ; i<n;i++)
      {
        for(int j=0 ; j<m;j++)
        {
          if(ch==board[i][j]){
            if(checkWord(board,word,0,i,j,row,col))
              return true;
          }
        }
      }
      return false;
      
    }
  
  boolean checkWord(char[][]board , String word , int idx , int i , int j,int[]row , int[]col)
  {
    if(idx==word.length()) return true;
    
    if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!=word.charAt(idx)||board[i][j]=='0') return false;
    
    char temp = board[i][j];
    board[i][j]='0';
    
    for(int r=0 ; r<4;r++)
    {
      
        int nextRow = i+row[r];
        int nextCol = j+col[r];
        
        if(checkWord(board,word,idx+1,nextRow,nextCol,row,col))
          return true;
        
      
    }
    

    board[i][j]=temp;
    return false;
    
  }
}