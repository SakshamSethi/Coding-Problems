class Solution {
    public int findPeakElement(int[] nums) {
        
        int s=0;
        int e =nums.length-1;
        
        while(s!=e)
        {
            int m = s + (e-s)/2;
            
            if(nums[m]>nums[m+1])
            {
                e=m;
            }
            else if(nums[m]<nums[m+1])
            {
                s=m+1;
            }
            
        }
        return s;
    }
}