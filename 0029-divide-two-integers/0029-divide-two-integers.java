class Solution {
    public int divide(int dividend, int divisor) {
        
        if(dividend == Integer.MIN_VALUE && divisor==-1)return Integer.MAX_VALUE;
        
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        
        int x=0;
        int res=0;
        
        while(a-b>=0)
        {
            x=0;
            while(a-(b<<1<<x)>=0)
            {
                x++;
            }
            res+=1<<x;
            a -= b<<x;
        }
        
        if((dividend>=0)==(divisor>=0)) return res;
        
        return -1*res;
        
    }
}