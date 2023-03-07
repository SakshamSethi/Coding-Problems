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
        int fast =n;
        do
        {
            slow = nextvalue(slow);
            fast = nextvalue(nextvalue(fast));
            
        }while(fast!=1 && slow!=fast);
        return fast == 1;
    }
}