class Solution {
    public int maxFrequency(int[] nums, int k) {
        
      // sliding window + sorting 
      
      Arrays.sort(nums);
      
      
      int l = 0 , r = 0;
      int n = nums.length;
      
      long ans=0 , total=0 ;
      
      
      while(r<n)
      {
        
        total +=nums[r];
        
        while((nums[r]*(r-l+1)) > total+k)
        {
          total-=nums[l];
          l++;
        }
        
        ans=Math.max(ans,(r-l+1));
        r++;
        
      }
      
      
      
      
      return (int)ans;
      
    }
}