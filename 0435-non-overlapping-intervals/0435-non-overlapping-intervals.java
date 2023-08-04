class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      
      Arrays.sort(intervals , (x,y)->(x[1]-y[1]));
      int count=1;
      int n= intervals.length;
      
      int end = intervals[0][1];
      
      for(int i=1 ; i<n ; i++)
      {
        if(intervals[i][0]>=end)
        {
          end = intervals[i][1];
          count++;
        }
      }
      
      return n-count;
      
    }
}