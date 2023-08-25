class Solution {
    public int specialArray(int[] nums) {
      
      int start = 0;
      int end = nums.length;
      
      while(start<=end)
      {
        int mid = start+(end-start)/2;
        
        int currentCount = countGreater(nums,mid);
        
        if(currentCount==mid)return mid;
        
        else if(currentCount>mid) start=mid+1;
        else end=mid-1;
        
      }
      
      return -1;
      
    }
  int countGreater(int[]nums , int target)
  {
    int cnt =0;
    for(int ele:nums)
    {
      if(ele>=target) cnt++;
      
    }
    return cnt;
  }
}