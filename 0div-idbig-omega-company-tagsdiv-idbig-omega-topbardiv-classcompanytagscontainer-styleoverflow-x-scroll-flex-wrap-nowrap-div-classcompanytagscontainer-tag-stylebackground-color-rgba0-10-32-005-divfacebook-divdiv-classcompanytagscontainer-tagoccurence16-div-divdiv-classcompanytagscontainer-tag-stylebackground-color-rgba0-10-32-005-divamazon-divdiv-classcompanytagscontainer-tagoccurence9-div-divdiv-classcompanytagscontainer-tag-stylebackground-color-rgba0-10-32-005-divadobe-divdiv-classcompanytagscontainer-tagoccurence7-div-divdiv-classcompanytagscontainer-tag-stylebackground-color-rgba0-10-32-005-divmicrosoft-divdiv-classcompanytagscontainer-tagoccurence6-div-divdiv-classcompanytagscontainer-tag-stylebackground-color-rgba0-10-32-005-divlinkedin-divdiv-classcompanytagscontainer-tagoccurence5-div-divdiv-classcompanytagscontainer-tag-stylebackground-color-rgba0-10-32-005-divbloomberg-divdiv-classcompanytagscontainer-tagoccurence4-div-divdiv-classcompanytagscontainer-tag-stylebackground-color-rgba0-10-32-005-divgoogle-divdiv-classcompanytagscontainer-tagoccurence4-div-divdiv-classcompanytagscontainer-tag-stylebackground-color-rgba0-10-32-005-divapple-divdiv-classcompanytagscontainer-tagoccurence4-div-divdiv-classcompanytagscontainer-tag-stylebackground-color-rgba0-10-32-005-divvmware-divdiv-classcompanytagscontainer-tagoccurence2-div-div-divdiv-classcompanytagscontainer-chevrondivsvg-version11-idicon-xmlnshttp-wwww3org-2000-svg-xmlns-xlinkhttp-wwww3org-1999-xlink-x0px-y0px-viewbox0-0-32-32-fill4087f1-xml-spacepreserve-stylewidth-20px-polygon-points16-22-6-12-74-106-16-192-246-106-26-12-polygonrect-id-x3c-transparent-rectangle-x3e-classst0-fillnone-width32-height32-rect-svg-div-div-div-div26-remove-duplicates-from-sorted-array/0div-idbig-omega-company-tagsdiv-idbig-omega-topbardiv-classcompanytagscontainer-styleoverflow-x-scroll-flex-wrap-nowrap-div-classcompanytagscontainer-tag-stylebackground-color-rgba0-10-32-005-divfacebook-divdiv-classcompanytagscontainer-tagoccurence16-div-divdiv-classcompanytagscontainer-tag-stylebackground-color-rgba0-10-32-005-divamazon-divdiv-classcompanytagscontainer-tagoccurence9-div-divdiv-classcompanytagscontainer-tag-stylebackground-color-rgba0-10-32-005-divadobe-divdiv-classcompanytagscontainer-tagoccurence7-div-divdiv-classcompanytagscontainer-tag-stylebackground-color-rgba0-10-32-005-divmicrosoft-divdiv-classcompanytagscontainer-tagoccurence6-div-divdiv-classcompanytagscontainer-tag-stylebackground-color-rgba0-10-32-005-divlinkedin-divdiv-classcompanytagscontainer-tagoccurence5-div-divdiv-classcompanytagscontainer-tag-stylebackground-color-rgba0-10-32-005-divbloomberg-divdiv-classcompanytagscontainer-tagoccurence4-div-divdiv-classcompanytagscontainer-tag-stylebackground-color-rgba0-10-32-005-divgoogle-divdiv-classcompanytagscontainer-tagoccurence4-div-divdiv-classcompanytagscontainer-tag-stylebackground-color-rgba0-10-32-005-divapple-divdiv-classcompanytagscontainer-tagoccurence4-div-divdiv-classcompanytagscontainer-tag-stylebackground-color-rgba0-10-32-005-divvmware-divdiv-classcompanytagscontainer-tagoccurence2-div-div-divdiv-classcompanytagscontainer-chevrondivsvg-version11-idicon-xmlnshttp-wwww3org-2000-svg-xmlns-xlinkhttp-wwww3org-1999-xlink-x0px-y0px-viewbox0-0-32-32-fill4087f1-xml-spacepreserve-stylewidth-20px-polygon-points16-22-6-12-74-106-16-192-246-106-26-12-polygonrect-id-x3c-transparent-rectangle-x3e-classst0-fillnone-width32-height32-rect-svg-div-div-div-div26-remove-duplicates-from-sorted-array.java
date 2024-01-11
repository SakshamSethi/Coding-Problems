class Solution {
    public int removeDuplicates(int[] nums) {
        
       int a = 1;
         
        for(int i=1 ; i< nums.length;i++)
        {
            if(nums[i]==nums[i-1])continue;
            nums[a++]=nums[i];
        }
        return a;
    }
}