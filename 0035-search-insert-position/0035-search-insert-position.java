class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int s =0,e=nums.length-1,m=0;
        int ans=0;
        while(s<=e)
        {
            m= s+(e-s)/2;
            
            if(nums[m]==target)
            {
                return m;
            }
            else if(nums[m]<=target)
            {
                ans=m+1;
                s=m+1;
            }
            else
            {
               e=m-1;
            }
            
        }
    return ans;
    }
}