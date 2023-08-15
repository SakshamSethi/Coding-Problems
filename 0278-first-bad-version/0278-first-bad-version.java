/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
      long start = 1;
      long end = n;
      long ans =0;
      while(start<=end)
      {
        long mid = start + (end-start)/2;
         
        boolean isBad = isBadVersion((int)mid);
        
        if(isBad) {
          ans = mid ;
          end = mid-1;
        }
        else
        {
          start=mid+1;
        }
        
        
      }
      
      return (int)ans;
    }
}