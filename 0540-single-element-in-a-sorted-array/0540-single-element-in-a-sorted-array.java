class Solution {
    public int singleNonDuplicate(int[] nums) {
        
     //  int n = 0;
        // O n approach using Xor !
    //  for(int ele : nums) n=n^ele;
 //     return n;
    
      
      // Binary Search solution Logn approach !
      
      int start = 1;
      int n=nums.length;
      int end = n-2;
      
      //Boundary cases :)
      if(n==1) return nums[0];
      if(nums[0]!=nums[1])return nums[0];
      if(nums[n-1]!=nums[n-2])return nums[n-1];
      
      int mid=0;
      
      while(start<=end)
      {
        mid = start + (end-start)/2;
        
        
        if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
        
        else if(mid%2==1)
        {
          // if at odd index check if equals to previous even index --> yes : at left part 
          //                                                        --> no : at left part
        
          if(nums[mid]==nums[mid-1]) // at left part
          {
            start = mid+1;
          }
          else
          {
            end=mid-1;
          }
        
        }
         
        
         else if(mid%2==0)
        {
          // if at even index check , if equals to next  index --> yes : at left part 
          //                                                        --> no : at right part
        
          if(nums[mid]==nums[mid+1]) // at left part
          {
            start = mid+1;
          }
          else
          {
            end=mid-1;
          }
        
        }
        
      }
      
      return start ; // Dummy :)
      
    }
}