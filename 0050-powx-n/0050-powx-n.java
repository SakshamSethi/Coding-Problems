class Solution {
    public double myPow(double x, int n) {
        
        if(x==1)return 1;
        if(n==0)
         return 1;
        if(n==1)
        {
            return x;
        }
        if(n<0) return 1/x* myPow(1/x,(n+1)*-1);
        
        
        double temp =  myPow(x,n/2);
        
        if(n%2==1)
            return temp*temp*x;
        
        if(n%2==0)
            return temp*temp;
        
        return temp;
    }
}