class Solution {
  int count;  
  public int findTargetSumWays(int[] nums, int target) {
      count=0;
    
    check(nums,target,0,0);
    return count;  
      
    }
  void check(int[]nums,int target,int i , int sum)
  {

    
    if(i==nums.length)
    {    if(target==sum)
    {
         count++;
     
    }
     return;
    }
      
    
    check(nums,target,i+1,sum-nums[i]);
    check(nums,target,i+1,sum+nums[i]);
    
  }
}