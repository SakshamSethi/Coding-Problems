class Solution {
  
/*  int findPivot(int[]nums)
  {
      int start = 0;
      int end = nums.length-1;
      int mid = 0;        

    while(start<=end)
    {
      
      mid = start +(end-start)/2;
      
      if(mid<end && nums[mid]>nums[mid+1] ) // to check the next element 
      return mid;
      
      else if(mid>start && nums[mid]<nums[mid-1])
        return mid-1;
      
      else if(nums[mid]<nums[start])
        end = mid-1;
      
      else if(nums[mid]>nums[start])
        start=mid+1;
      
      }
    return -1; // Dummy return ;
    
  }
  */
  
  
  public int search(int[] nums, int target) {

      
    /* int pivot = findPivot(nums);
    
    // Apply Binary Search in Both the halves :
    
    int res = binarySearch(nums,0,pivot,target);
    
    return res!=-1?res:binarySearch(nums,pivot+1,nums.length-1,target);
    
    */
    
    
    // without the pivot approach :
    
    
    // we need to thing about how can we reduce out search space 
    
    
    // there will be 2 sorted halves as the array is rotated --> we need to check that cuurently at which half are we and then we will check the range that if the target lies with in that part or not and we will eliminate the search space accordingly 
    
    
    int start =0;
    int end = nums.length-1;
    int mid =0;
    
    while(start<=end)
    {
      mid = start + (end-start)/2;
      
      if(nums[mid]==target) return mid ;
      
      // if we are at the left sorted part 
      
     else if(nums[start]<=nums[mid])
      {
        // check the range 
        
        if(nums[start]<= target && nums[mid]>target) // target lies with in this range 
          end = mid-1 ;
        
        else
          start=mid+1;
        
        
      }
      // we are at right sorted part 
      else
      {
        if(nums[end]>=target && target>nums[mid])
          start=mid+1;
        else 
          end=mid-1;
        
      }
      
    }
    
    return -1;
    
    }
  
  /*int binarySearch(int[]nums,int start , int end , int target)
  {
    int mid =0;
    
    while(start<=end)
    {
      mid = start +(end-start)/2;
      
      if(nums[mid]==target) return mid;
      
      else if(nums[mid]<target) start=mid+1;
      
      else end=mid-1;
    }
    
    return -1;
  }
  */
}