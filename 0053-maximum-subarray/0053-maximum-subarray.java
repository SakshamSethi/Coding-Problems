class Solution {
    public int maxSubArray(int[] nums) {
        
      //kadane's algorithm
      
      int curSum =0 ;
      int maxSum =(-1)*(int)1e5+1 ;
      int n = nums.length;
      for(int i=0 ; i< n ; i++)
      {
        curSum +=nums[i];
        
        maxSum = Math.max(maxSum , curSum);
        
        if(curSum<0)curSum=0;
        
      }
      return maxSum ;
    }
}