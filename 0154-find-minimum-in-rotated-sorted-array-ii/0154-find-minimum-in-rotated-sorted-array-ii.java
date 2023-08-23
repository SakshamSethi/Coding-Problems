class Solution {
    public int findMin(int[] nums) {
     
      // brute force
      
   //   Arrays.sort(nums);
    //  return nums[0];
      
      // simple -> find pivot in rotated sorted array 
      
      int pivot = findPivot(nums);
      
      return  pivot==nums.length-1?nums[0]:nums[pivot+1];
      
    }
  
  int findPivot(int[]nums)
  {
    int start = 0 ;
    int end = nums.length-1;
    
    int mid = 0;
    
    while(start<=end)
    {
      mid = start + (end-start)/2;
      
      if(mid<end && nums[mid]>nums[mid+1]) return mid ;
    else  if(mid>start && nums[mid]<nums[mid-1] ) return mid-1;
      
     else  if(nums[mid]==nums[start] && nums[mid]==nums[end])
      {
        // skip the duplicates
        
        if(start<nums.length-1 && nums[start]>nums[start+1]) return start ;
        
        else start ++ ;
        
        if(end>0 && nums[end]<nums[end-1])return end-1;
        else end--;
        
        continue ;
        
      }
      
   if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])) start=mid+1;
      
      else end = mid-1;
      
    }
      
  return -1;
  }

  
}