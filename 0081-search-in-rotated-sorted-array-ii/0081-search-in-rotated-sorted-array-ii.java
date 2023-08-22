class Solution {
  
  // the normal Binary Search func
  
  boolean binarySearch(int[]nums,int start,int end , int target)
  {
    

    
    int mid =0;
    
    while(start<=end)
    {
      mid = start +(end-start)/2;
      
      if(nums[mid]==target) return true;
      
      else if (nums[mid]<target) start=mid+1;
      else end=mid-1;
    }
    
    return false;
  }
  
  
  
    public boolean search(int[] nums, int target) {
    if(nums.length==1) return nums[0]==target;
      // brute force 1 : using liner search 
      // how to apply binary search in this ?
      
      // using the previous approach we will try to skip the duplicates in the sense of finding out the pivot element 
      // how to de skip duplicates ?
      
      // you have to check 3 conditions !
      
    
      int pivot = findPivot(nums);
      
      
  return binarySearch(nums,0,pivot,target) ||binarySearch(nums,pivot+1,nums.length-1,target);
      
    
    
    }
  int findPivot(int[]nums)
  {
    int start = 0;
    int end = nums.length-1;
    int mid =0;
    
    while(start<=end)
    {
      
      mid = start+(end-start)/2;
      
      if(mid<end && nums[mid]>nums[mid+1]) return mid ;
      
      else if(mid>start && nums[mid]<nums[mid-1])return mid-1;
      
      else if(nums[mid]==nums[start] && nums[end]==nums[mid]) // case 1 where the                                 middle , start , end  --> all three elements are equal
      {
        
  
        
        if(start<nums.length-1 && nums[start]>nums[start+1]) 
          return start;//  
        
        start++;  
        
        
        if(end > 0 && nums[end]<nums[end-1])
          return end-1 ;// end-1 is pivot
        
        else end--;
        
        continue;
        
      }
      
 
      
      if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end]))
       start=mid+1;
       
      else end=mid-1;
      
      
      
    }
    return -1;
  }
  
}