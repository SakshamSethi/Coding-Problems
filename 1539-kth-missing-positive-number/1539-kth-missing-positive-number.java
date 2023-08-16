class Solution {
    public int findKthPositive(int[] arr, int k) {
      
      int countMissing =0;
      int n = arr.length ;
      countMissing = arr[n-1]-n;
      if(countMissing<k)
      {
        return arr[n-1]+(k-countMissing);
      }
          
      int start = 0 ;
      int end = n-1 ;
      
      while(start<=end)
      {
        int mid = start + (end-start)/2;
        
        countMissing = arr[mid]-(mid+1);
        
        if(countMissing<k)
          start = mid+1;
        
        else if(countMissing>=k)
          end = mid-1;
         
      }
      
      if(end<0) return k ;
      
      countMissing = arr[end]-(end+1);
      return arr[end]+(k-countMissing);
      
    }
}