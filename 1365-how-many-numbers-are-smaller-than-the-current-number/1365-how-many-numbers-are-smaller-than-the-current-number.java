class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
      
      int n=nums.length;
      int[] ans = new int[n];
      
      for(int i=0 ; i< n ; i++)
      {
        ans[i] = countSmallers(nums[i],nums);
      }
    return ans;
    }
  int countSmallers(int n , int[] nums)
  {
    int count =0 ; 
    for(int ele : nums)
    {
      if(ele<n) count++;
    }
    return count;
  }
}