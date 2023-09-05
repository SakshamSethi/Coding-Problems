class Solution {
    public double myPow(double x, int n) {
        
      return myFunc(x , (long)n);
    }
  double myFunc(double x , long n)
  {
    if(n==0)return 1;
    if(n<0) return myFunc(1/x,-n);
    
    if(n%2==0) return myFunc(x*x , n/2);
    else return x*myFunc(x*x,n/2);
    
  }
}