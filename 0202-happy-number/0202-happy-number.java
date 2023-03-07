class Solution {
    public int nextvalue(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    } 
    public boolean isHappy(int n) {
      
        int slow =n;
        int fast = nextvalue(n);
        while(fast!=1 && slow!=fast)
        {
            slow = nextvalue(slow);
            fast = nextvalue(nextvalue(fast));
            
        }
        return fast == 1;
    }
}