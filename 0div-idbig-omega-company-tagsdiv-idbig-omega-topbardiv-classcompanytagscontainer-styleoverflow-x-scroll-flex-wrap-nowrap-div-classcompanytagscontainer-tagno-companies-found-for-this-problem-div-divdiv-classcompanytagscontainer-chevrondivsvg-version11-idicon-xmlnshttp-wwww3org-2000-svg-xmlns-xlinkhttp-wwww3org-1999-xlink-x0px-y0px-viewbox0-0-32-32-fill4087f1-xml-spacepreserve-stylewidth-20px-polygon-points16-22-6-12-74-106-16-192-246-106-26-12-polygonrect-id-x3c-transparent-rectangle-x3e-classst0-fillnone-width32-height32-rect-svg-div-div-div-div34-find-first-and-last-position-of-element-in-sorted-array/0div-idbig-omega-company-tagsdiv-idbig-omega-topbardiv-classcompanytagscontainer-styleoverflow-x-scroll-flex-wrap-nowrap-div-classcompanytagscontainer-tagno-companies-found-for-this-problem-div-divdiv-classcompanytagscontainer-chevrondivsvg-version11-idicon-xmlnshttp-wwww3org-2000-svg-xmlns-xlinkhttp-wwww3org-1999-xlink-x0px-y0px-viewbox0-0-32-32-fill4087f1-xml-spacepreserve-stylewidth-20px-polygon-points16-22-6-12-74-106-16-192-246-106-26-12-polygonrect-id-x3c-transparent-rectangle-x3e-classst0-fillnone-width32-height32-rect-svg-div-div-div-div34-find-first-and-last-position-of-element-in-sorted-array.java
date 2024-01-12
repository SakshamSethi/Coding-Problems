class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = new int[2];
        
        ans[0] = binarySearch(nums,target,0,nums.length-1,1);
        if(ans[0]==-1)
        {
            ans[1]=-1;
            return ans;
        }
        ans[1] = binarySearch(nums,target,ans[0],nums.length-1,0);
        return ans;
        
        
    }
    
    int binarySearch(int[]nums , int target , int s , int e , int first)
    {
        int indx = -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
        
                if(nums[mid]==target)
                {
                    indx = mid ;
                    if(first==1) e = mid-1;
                    else s = mid+1;
                }
            else if(nums[mid]>target)
            {
                e = mid-1;
            }
            else 
                s=mid+1;
            
        }
        return indx;
    }
}