class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      
      
      
      Arrays.sort(nums1);
      HashSet<Integer> hs = new HashSet();
      
      for(int ele : nums2)
      {
        if(binarySearch(nums1,ele)) hs.add(ele);
         
      }
      
      int[]ans = new int[hs.size()];
      
      int k=0;
      
      for(int ele : hs)
        ans[k++] = ele;
      
      return ans;
      
      
      
    }
  boolean binarySearch(int[]nums , int target)
  {
    int start = 0 ;
    int end = nums.length-1;
    
    int mid = 0;
    
    while(start<=end)
    {
      mid = start+(end-start)/2;
      
      if(nums[mid]==target) return true;
      
      else if (nums[mid]>target)end=mid-1;
      else start = mid+1;
    }
    return false;
  }
  
}