class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
      int start = 0;
      int n = arr.length;
      int end = n-1;
      int mid = 0;
      
      while(start<=end)
      {
        mid = start + (end-start)/2;
        System.out.println(mid);
        if((mid==0||arr[mid]>arr[mid-1])&&  (mid==n-1||arr[mid]>arr[mid+1])) return mid;
        
        else if(mid>0 && arr[mid]<arr[mid-1]) end=mid-1;
     
       else if(mid<n && arr[mid+1]>arr[mid])start =mid+1;
        
      }
      
      return -1; // dummy case
    }
}