class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        for(int x : nums)
        {
            if(evenDigi(x))count++;
        }
        
        return count;
    }
    boolean evenDigi(int x)
    {
        int count = 0;
        int n = x;
        while(n>0)
        {
        
            count++;
            n=n/10;
        }
        
        return count%2==0;
    }
}