class Solution {
    public int[] searchRange(int[] nums, int target) {
        
      
      int i = binarySearchStart(nums,target);
     
        int j = binarySearch(nums,target,0);
      
      return new int[]{i,j};
    }
  
  int binarySearch(int[]nums,int target , int start)
  {
    int end = nums.length -1 ;
     int ans=-1;    
    while(start<=end)
    {
      int m = start + (end-start)/2;

      if(nums[m]== target)
      {
        ans = m ;
        start = m+1;
      }
      else if(nums[m]<target)
      {
        start=m+1;
      }
      else
      {
        end = m-1;
      }
    }
    return ans;
  }
  
  int binarySearchStart(int[]nums , int target)
  {
    int start = 0 ;
    int end = nums.length-1;
    int ans = -1;
    while(start<=end)
    {
      
      int m = start + (end-start)/2;
      
      if(nums[m]==target)
      {
        ans = m ; 
        end = m-1;
      }
      else if(nums[m]<target)
      {
        start=m+1;
      }
      else
      {
        end = m-1;
      }
    }
    return ans;
    
  }
  
  
  
}