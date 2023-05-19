class Solution {
    public void moveZeroes(int[] nums) {
        
        int a=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0) continue;
            nums[a++]=nums[i];
        }
        for(int i=a ;i<n;i++)
        {
            nums[a++]=0;
        }
    }
}