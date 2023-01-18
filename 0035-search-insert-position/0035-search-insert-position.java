class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int s=0;
        int e=nums.length-1;
        int x=0;
        if(nums[0]>target) return 0;
        while(s<=e)
        {
            int m = s+(e-s)/2;
            
            if(nums[m]<=target)
            {
                
                if(nums[m]==target) return m;
               x=m;
               s=m+1;
            }
            else if(nums[m]>target)
            {
                e=m-1;
            }
            
        }
        return x+1;
    }
}