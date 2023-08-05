class Solution {
    public int[] runningSum(int[] nums) {
      
      int sum=0  ;
      int n =nums.length;
      int[] ansSum = new int[n];
      for(int i=0 ; i<n ; i++)
      {
        sum+=nums[i];
        ansSum[i] = sum;
      }
      return ansSum;
    }
}