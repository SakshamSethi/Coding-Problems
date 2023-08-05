class Solution {
    public int largestAltitude(int[] gain) {
        
    int n = gain.length;
      int[] alt = new int[n+1];
      alt[0]=0;
      
      for(int i=0; i<n ; i++)
      {
        alt[i+1]=alt[i]+gain[i];
      }
      int maxi = Integer.MIN_VALUE;
       for(int ele : alt)
         maxi = Math.max(maxi ,ele);
      
      return maxi;
    }
}