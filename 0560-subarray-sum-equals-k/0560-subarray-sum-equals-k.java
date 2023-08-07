class Solution {
    public int subarraySum(int[] nums, int k) {
      
      int n = nums.length;
      int count = 0 ;
      for(int i=0 ; i< n ; i++)
      {
        int sum=nums[i];
        if(sum == k)
        {
          count++;
        
        }
        for(int j=i+1 ; j<n ; j++)
        {
          sum+=nums[j];
          if(sum==k)
          {count++;
          
          }
        }
      }
       return count ; 
      
    }
}