class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return count(nums,target,0,0);
        
    }
    int count (int[]nums, int target ,int i , int sum)
    {
        if(i==nums.length)
        {
            return sum==target?1:0;
        }
        int ele = nums[i];
        int pos = count(nums,target,i+1,sum+ele);
        int neg = count(nums,target,i+1,sum-ele);
        return pos+neg;
    }
}