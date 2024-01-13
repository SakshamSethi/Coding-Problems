class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        int start = 0;
        int end =  0;
        int len = Integer.MAX_VALUE;;
        
        int curSum = 0; 
        int n = nums.length;
        
        while(end<n)
        {
            curSum+=nums[end];
            
            if(curSum>=target)
            {
                int curLen = end-start+1;
                len = Math.min(len , curLen);
                curSum=0;
                start+=1;
                end=start;
                continue;
            }
            end++;
        }
       
        if(len == Integer.MAX_VALUE) return 0;
        return len;
        
    }
}