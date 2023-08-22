class Solution {
    public int findMin(int[] nums) {
        
      return findPivot(nums);
      
    }
  
  int findPivot(int[]nums)
  {
    int start = 0;
    int end = nums.length-1;
    int mid =0;
    
    while(start<=end)
    {
      mid = start + (end-start)/2;
      
      
      if(mid<end && nums[mid]>nums[mid+1]) return nums[mid+1] ;
      else if(mid>start && nums[mid]<nums[mid-1]) return nums[mid] ;
      
      else if(nums[start]<nums[mid])
      {
        start=mid+1;
      }
      else
      {
        end=mid-1;
      }
      
    }
     return nums[0];
  }
}