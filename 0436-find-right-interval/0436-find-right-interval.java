class Solution {
    public int[] findRightInterval(int[][] intervals) {
      
      // what we can do is !!!!
      // we can store all the starting intervals in an separate array 
      // we can store these intervals along with thier orignal indexes in a map and then we can sort the array in which we have stored the starting index and then we can perform a binary search for each end interval to find out its floor int the array and can fetch its orignal index from the map to return the ans!
      
      
      
      int n = intervals.length;
      
      int[] arr = new int[n];
      
      int[] ans = new int[n];
      
      HashMap<Integer,Integer> hmap = new HashMap<>();
      
      for(int i = 0 ; i<n ; i++)
      {
        arr[i] = intervals[i][0] ; 
        
        hmap.put(arr[i] , i);
      }
      
      Arrays.sort(arr);
      
      for(int i=0 ; i<n;i++)
      {
        ans[i] = binarySearch(arr,intervals[i][1],i,hmap);
      }
      
      return ans;
        
    }
  
  int binarySearch(int[] arr , int target , int ind ,HashMap<Integer,Integer>hmap)
  {
    
    int index = -1 ;
    
    int start = 0;
    int end = arr.length-1;
    
    while(start<=end)
    {
      int mid = start + (end-start)/2;
 
      
      if(arr[mid]>=target)
      {
        index = mid;
        end = mid-1;
      }
      else
      {
        start = mid+1;
      }
      
    }
    
    return index==-1?-1:(int)hmap.get(arr[index]);
    
  }
  
}