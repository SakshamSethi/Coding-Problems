class Solution {
    public int minStartValue(int[] nums) {
        
        int sum =0;
        int minsum=0;
        for(int x: nums)
        {
            sum+=x;
            minsum = Math.min(minsum,sum);
            
        }
        return -1*minsum + 1;
        
    }
}