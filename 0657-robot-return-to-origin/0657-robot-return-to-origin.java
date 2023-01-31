class Solution {
    public boolean judgeCircle(String moves) {
        
        int a=0,b=0;
        
        for(int i =0 ;i<moves.length();i++)
        {
            if(moves.charAt(i)=='R')
                a++;
            if(moves.charAt(i)=='L')
                a--;
            if(moves.charAt(i)=='U')
                b++;
            if(moves.charAt(i)=='D')
                b--;
        }
        if(a==0 && b==0) return true;
        return false;
    }
}