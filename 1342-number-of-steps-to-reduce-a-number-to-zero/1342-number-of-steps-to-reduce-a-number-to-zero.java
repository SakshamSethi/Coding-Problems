class Solution {
    public int numberOfSteps(int num) {
 
        return count(num);
}
    static int count(int n)
    {
        return help(n,0);
    }
 static int help(int n,int c)
      {
        if(n==0) return c;
        
        if(n%2==0)
        {
            return help(n/2,c+1);
        }
        else
        {
            return help(n-1,c+1);
        }
    }
    
}