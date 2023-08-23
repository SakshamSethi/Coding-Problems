class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
     
      
      //  - Absolute difference array 
      // And total Absolute Sum 
      
      
      int n = nums1.length ;
      
      int[] diff = new int[n];
      long abSum = 0;
      
      
      for(int i=0 ; i<n ; i++)
      {
        diff[i] = Math.abs(nums1[i] - nums2[i]);
        abSum +=diff[i];
      }
      
      // We will now check for the ceil / floor of a diff in one array to find out where is the maximum difference and then we will  check for the ceil/floor of that number in the array 2 itself 
      
      long ansSum = abSum;
      Arrays.sort(nums1);
      long mod = (long)1e9 + 7;
      
      
      for(int i =0 ; i<n ; i++)
      {
 
        // reduce the total sum by the  difference of the ith element 
        
        abSum -=diff[i];
        
        // find out the value in nums1 such that the abs diff at that point in minimum 
        
        int newVal = findBestMatch(nums1,nums2[i]); 
        
        
        abSum +=newVal;
        
        
        // now check if this new sum is smaller than the prev sum or not (prevSum is stored at tempSum)
        
        
        if(abSum<ansSum)
        {
          ansSum = abSum ;
        }
        
        abSum -= newVal ;
        abSum +=diff[i];
        
      }
      
      
      return (int)(ansSum%mod);
      
      
    }
  
  int findBestMatch(int[]nums,int target)
  {
    
    int start =0;
    int end = nums.length-1;
    int mid = 0;
    
    int ceil = -1 , floor = -1;
    int ans = Integer.MAX_VALUE;
    
    
    while(start<=end)
    {
      mid = start + (end-start)/2;
      
      if(nums[mid]==target)
      {
        return 0 ;
      }
      else if(nums[mid]<target)
      {
        ceil = nums[mid];
        start = mid+1;
      }
      else
      {
        floor = nums[mid];
        end = mid-1;
      }
      
    }
    
     if(ceil!=-1)
     {
       ans = Math.abs(target-ceil);
     }
    if(floor!=-1)
    {
      ans = Math.min(ans , Math.abs(floor-target));
    }
    return ans;
    
    
  }
  
  
}