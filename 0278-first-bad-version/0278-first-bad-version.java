/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int s=1;
      
        int m=0;
        int x=0;
        while(s<=n)
        {
            m = s+(n-s)/2;
            System.out.println(m);
            if(isBadVersion(m)==true)
            {
                x = m;
                n = m-1;
            }
            else
            {
                s=m+1;
            }
            
          
        }
        return x;
        
    }
}