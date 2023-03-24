class Solution {
    public int smallestEvenMultiple(int n) {
        
        n = n<<(n&1);
        return n;
    }
}