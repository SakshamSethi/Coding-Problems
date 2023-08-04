class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length; int i; int reachable=0;
        for(i=0;i<n;i++)
        {
            if(i>reachable) return false;
            else
            {
                reachable = Integer.max(reachable,i+nums[i]);
            }
        }
        return true;
    }
}