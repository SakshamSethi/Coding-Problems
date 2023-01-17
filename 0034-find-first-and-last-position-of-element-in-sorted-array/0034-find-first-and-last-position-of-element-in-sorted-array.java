class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0]=ans[1]=-1;
int s = 0;
        int m =0;
        int e =  nums.length-1;
        while(s<=e)
        {
            m = s + (e-s)/2;
            if(target==nums[m])
            {
                ans[0]=m;
                e = m-1;
            }
            else if(target>nums[m])
            {
                s = m+1;
            }
            else
            {
                e = m-1;
            }
        }
         s=0;
        e=nums.length-1;
        
      while(s<=e)
        {
            m = s + (e-s)/2;
            if(target==nums[m])
            {
                ans[1]=m;
                s = m+1;
            }
            else if(target>nums[m])
            {
                s = m+1;
            }
            else
            {
                e = m-1;
            }
        }
        return ans;
    }
}