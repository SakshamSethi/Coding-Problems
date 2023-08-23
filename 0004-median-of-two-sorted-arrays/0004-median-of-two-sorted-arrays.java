class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
      
      int n1 = nums1.length;
      int n2 = nums2.length;
      
      
      if(n1>n2) return findMedianSortedArrays(nums2,nums1);
      // because we want to search in the smallar array :)
      
      int n = n1+n2;
      int low = 0;
      int high = n1;
      
      int left = (n1+n2+1)/2;
      
      while(low<=high)
      {
        int mid1 = low + (high-low)/2;
        
        int mid2 = left - mid1 ;
        
        int l1 = Integer.MIN_VALUE , l2 = Integer.MIN_VALUE;
        
        int r1 = Integer.MAX_VALUE , r2 = Integer.MAX_VALUE;
        
        // check for boundary cases 
        
        
        if(mid1>0) l1 = nums1[mid1-1];
        if(mid2>0) l2 = nums2[mid2-1];
        
        if(mid1<n1) r1 = nums1[mid1];
        if(mid2<n2) r2 = nums2[mid2];
        
        
        // check validity :
        
        if(l1<=r2 && l2<=r1) 
        {
          // check for odd and even 
          
          if(n%2==0)
          {
            return (double) (Math.max(l1,l2) + Math.min(r1,r2)) / 2.0 ; 
          }
          else
          {
            return (double)(Math.max(l1,l2));
          }
        }
        
        else if (l1>r2) high=mid1-1;
        
        else if(l2>r1) low = mid1+1;
        
      }
      
      return 0.0 ; // dummy return
    }
}