class Solution {
    public int findNumberOfLIS(int[] nums) {
      
      int  n = nums.length;
      int maxi = 0;
      int count=0;
      int[]dp = new int[n];
      int[]cnt = new int[n];
      int max_ind=0;
      for(int i=0 ; i<n ;i++)
      {
        dp[i]=1; cnt[i]=1;
        for(int j =0 ;j<i ; j++)
        {
          if(nums[i]>nums[j] && dp[i]<dp[j]+1)
          {
            dp[i] =dp[j]+1;
            cnt[i] =cnt[j];
          }
          else if(nums[i]>nums[j] && dp[i]==dp[j]+1)
          {
            cnt[i]+=cnt[j];
          }
            
        }
        if(maxi<dp[i])
        {
          maxi = dp[i];
          max_ind= i;
        }
      }
    
int no=0;
      for(int i=0;i<n;i++)
      {
        if(dp[i]==maxi) no+=cnt[i];
      }
      return no;
    }
}