class Solution {
    public int findMin(int[] nums) {
        
        int s=0;
        int e = nums.length-1;
        int m=0;
      
        while(s<=e)
        {
            m = s+ (e-s)/2;
            if(m<e && nums[m]>nums[m+1])
            {
                return nums[m+1];
            }
            else if (m>s && nums[m]<nums[m-1])
            {
                return nums[m];
            }
            else if(nums[m]<nums[s])
            {
                e=m;
            }
            else
            {
                s=m+1;
            }                
        }

        return nums[0];
    }
}