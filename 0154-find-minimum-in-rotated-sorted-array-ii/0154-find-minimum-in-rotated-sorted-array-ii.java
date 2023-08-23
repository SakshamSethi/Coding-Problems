class Solution {
    public int findMin(int[] nums) {
     
      // brute force
      
      Arrays.sort(nums);
      return nums[0];
      
    }
}