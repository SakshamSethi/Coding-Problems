class Solution {
    public int search(int[] nums, int target) {
        
        
        int e=nums.length-1;
return binarysearch(nums,target,0,e);
    }
    static int binarysearch(int[] nums,int t,int s,int e)
    {
        int m = s+(e-s)/2;
        
        if(nums[m] == t)
            return m;
        
        while(s<e){
        if(nums[m]>t)
        return binarysearch(nums,t,s,m-1);
        
      if(nums[m]<t)
    return binarysearch(nums,t,m+1,e);
    
        }
            return -1;
        
        
    }
}