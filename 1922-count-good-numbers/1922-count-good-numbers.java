class Solution {
    public long mod = 1000000007; 
    public int countGoodNumbers(long n) {
        
    
        long odd = n/2; 
        long even = (n+1)/2; 
        return (int)(pow(5, even)*pow(4, odd)%mod);
    }
    
 
    public long pow(long x, long n) {
        
        if(n==0) return 1;
        
        long temp = pow(x,n/2);
        
        if(n%2==0){
            return (temp*temp)%mod;
        }
        else{
            return (x*temp*temp)%mod;
        }
    }
}