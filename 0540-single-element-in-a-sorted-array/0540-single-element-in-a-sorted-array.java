class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int s=0;
        int e = nums.length-1;
        int m=0;
        
        if(e==0) return nums[0];
    if(nums[0]!= nums[1])return nums[0];
        if(nums[e]!=nums[e-1]) return nums[e];
    
        while(s<=e)
        {
            m= s +(e-s)/2;
            
            if(nums[m]!=nums[m-1]&&nums[m]!=nums[m+1])
            {
                return nums[m];
            }
        
            if(m%2==1)
            {
                if(nums[m]==nums[m-1])
                    s=m;
                else
                    e=m;
            }
            else
            {
                    if(nums[m]==nums[m+1])
                    s=m;
                else
                    e=m;
            }
            
            
        }
        return -1;
    }
}