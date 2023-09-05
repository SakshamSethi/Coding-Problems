class Solution {
  public long mod = 1000000007;
    public int countGoodNumbers(long n) {
  
    
      // observation : its kind of a permutation solution :
      // if we observe carefully then all we need to find is that how many places in that number is going to be even and odd postions;
      
// at even index we are having only even numbers from 0-9 we have 5 even digits (0,2,4,6,8)
// at each  even  indexe we can have 5 ways to build a number -> 5^(no of even indexes)
// similarly at odd indexes we have only 4 prime no.s to adjust (1,3,5,7)
      
      
    long even = (n+1)/2 ; // 0 based indexing
      long odd = n/2;
     
      long evenPart = myPow(5,even)%mod;
      long oddPart = myPow(4,odd)%mod;
      
      long ans = (evenPart*oddPart)%mod;
      return (int)ans;
      
    }
 public long myPow(long x, long n) {
        
        if(n==0) return 1;
        
        long temp = myPow(x,n/2);
        
        if(n%2==0){
            return (temp*temp)%mod;
        }
        else{
            return (x*temp*temp)%mod;
        }
    }
}