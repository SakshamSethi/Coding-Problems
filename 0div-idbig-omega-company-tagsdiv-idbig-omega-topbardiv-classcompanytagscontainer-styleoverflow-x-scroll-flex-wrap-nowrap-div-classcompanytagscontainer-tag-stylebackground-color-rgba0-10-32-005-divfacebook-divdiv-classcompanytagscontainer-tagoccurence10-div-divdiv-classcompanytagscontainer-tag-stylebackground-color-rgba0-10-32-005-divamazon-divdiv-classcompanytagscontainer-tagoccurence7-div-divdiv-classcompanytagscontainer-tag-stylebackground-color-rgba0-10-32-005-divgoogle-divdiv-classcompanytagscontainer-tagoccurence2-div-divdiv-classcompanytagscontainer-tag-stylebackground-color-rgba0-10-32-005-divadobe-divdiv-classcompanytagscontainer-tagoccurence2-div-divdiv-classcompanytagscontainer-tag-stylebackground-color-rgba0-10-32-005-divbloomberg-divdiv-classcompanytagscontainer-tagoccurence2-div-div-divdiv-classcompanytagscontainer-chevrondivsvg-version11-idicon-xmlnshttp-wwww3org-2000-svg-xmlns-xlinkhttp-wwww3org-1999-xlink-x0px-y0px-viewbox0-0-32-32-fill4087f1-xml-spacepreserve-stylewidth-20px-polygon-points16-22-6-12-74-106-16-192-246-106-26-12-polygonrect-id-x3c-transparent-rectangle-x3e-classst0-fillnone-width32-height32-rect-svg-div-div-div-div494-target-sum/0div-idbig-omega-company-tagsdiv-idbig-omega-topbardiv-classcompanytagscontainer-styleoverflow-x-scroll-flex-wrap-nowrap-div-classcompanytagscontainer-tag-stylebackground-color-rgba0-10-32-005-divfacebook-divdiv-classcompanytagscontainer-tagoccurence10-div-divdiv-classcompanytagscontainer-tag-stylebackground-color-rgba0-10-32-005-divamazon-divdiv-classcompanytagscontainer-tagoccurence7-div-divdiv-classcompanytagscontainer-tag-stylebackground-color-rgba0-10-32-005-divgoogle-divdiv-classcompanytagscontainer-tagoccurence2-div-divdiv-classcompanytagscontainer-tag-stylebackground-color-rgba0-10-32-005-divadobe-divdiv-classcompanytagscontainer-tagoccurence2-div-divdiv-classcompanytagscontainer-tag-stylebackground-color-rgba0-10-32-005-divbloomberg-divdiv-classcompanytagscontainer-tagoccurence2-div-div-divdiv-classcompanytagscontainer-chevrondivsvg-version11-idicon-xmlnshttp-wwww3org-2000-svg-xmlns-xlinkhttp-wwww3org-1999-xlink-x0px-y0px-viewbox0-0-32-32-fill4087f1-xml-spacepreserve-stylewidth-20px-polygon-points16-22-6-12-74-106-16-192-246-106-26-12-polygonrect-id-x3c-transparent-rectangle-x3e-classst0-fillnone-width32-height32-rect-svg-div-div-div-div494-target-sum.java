class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        
         return process(nums,0,target,0);
        
    }
    int process(int[]nums , int i , int target , int sum)
    {

        if(i==nums.length)
        {
            return target==sum?1:0 ;
        }
        int num = nums[i];
        
        int pos = process(nums,i+1,target,sum+num);
        
       
        int neg = process(nums,i+1,target,sum-num);
        
        
        return pos+neg;
        
    }
}