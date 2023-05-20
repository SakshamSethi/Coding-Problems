class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max =-1;
      int sum=0;
        int i=0;
while(i<nums.length)
{
    if(nums[i]==1) sum++;
    
    if(nums[i]==0)
    {
        max = Math.max(sum,max);
        sum=0;
    }
    i++;
}
        return Math.max(max,sum);
    }
}