class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int len = nums.length/2;
        
        int[] pos = new int[len];
        int[] neg = new int[len];
        
        int i= 0 ; int j=0;
        
        for(int ele:nums)
        {
            if(ele>0) pos[i++]=ele;
            else neg[j++]=ele;
            
        }
        
        int x=0;
        for(int k=0 ; k<len;k++)
        {
            nums[x++]=pos[k];
            nums[x++]=neg[k];
        }
        return nums;
    }
}