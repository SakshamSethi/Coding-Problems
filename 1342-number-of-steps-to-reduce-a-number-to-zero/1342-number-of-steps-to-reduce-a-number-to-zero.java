class Solution {
    public int numberOfSteps(int num) {
        
        return ans(num,0);
    }
    static int ans(int n,int count)
    {
        if(n==0) return count;
        if(n%2==0) return ans(n/2,++count);
        else return ans(n-1,++count);
    }
}