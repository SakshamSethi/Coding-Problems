class Solution {
    public int searchInsert(int[] nums, int target) {
     
      // floor + 1 !
      
      int start =0;
      int end = nums.length-1;
      int ans = 0;
      while(start<=end)
      {
        int mid = start + (end-start)/2;
        
        if(nums[mid]==target) return mid;
        
        else if(nums[mid]<target) 
        {
          ans = mid+1;
          start=mid+1;
        }
        else 
        {
          ans=mid;
          end=mid-1;
        }
      }
      return ans;
    }
}