class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
      int start = 0;
      int end = arr.length-1;
      int mid = 0;
      while(start!=end)
      {
        mid = start + (end-start)/2;
        
        if(arr[mid]<arr[mid+1]) // i am at the increasing part of the array
          start = mid+1;
        
        else if(arr[mid]>arr[mid+1]) // i am at the decreasing part of the array
          end = mid ;
        
      }
      return start ;
    }
}