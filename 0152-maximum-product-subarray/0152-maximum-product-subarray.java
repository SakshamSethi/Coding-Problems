class Solution {
    public int maxProduct(int[] nums) {
        
      int maxSum =0 ;
      int prefixSum=1;
      int suffixSum=1;
      int n = nums.length;
      if(n==1)return nums[0];
      for(int i=0 ; i< n ; i++)
      {
        if(prefixSum==0)prefixSum=1;
        if(suffixSum==0)suffixSum=1;
        
        prefixSum = prefixSum*nums[i];
        suffixSum*=nums[n-i-1];
        maxSum=Math.max(maxSum , Math.max(prefixSum,suffixSum));
        
      }
      return maxSum;
    }
}