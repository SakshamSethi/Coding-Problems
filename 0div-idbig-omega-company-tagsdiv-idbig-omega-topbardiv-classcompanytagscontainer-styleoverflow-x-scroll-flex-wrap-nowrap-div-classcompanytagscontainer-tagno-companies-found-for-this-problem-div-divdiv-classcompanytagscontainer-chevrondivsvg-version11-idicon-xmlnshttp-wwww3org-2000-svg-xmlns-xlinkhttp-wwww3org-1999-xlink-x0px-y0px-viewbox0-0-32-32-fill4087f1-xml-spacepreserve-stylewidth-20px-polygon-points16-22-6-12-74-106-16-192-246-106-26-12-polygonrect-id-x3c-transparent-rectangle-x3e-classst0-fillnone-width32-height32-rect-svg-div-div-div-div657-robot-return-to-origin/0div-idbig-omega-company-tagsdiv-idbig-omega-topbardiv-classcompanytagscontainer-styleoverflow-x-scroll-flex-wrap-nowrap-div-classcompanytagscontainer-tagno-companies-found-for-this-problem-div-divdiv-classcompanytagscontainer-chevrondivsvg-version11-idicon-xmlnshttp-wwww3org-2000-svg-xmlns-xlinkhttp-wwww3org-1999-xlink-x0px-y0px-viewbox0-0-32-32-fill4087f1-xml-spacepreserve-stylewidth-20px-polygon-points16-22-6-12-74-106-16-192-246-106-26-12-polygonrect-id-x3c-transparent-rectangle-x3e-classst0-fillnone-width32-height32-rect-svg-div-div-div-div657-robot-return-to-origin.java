class Solution {
    public boolean judgeCircle(String moves) {
        
        return move(moves,0,0,moves.length(),0);
        
    }
    private boolean move(String moves , int i , int j , int n , int index)
    {
        if(index==n)
        {
            return i==0&&j==0;
        }
        
        char ch = moves.charAt(index);
        
        if(ch=='L')
           return    move(moves,i,j-1,n,index+1);
    
    else if(ch=='R')
           return    move(moves,i,j+1,n,index+1);
    
   else if(ch=='U')
           return    move(moves,i-1,j,n,index+1);
        
        else
           return    move(moves,i+1,j,n,index+1);
    }
}