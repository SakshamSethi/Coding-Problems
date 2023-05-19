class Solution {
    public boolean check(int[] nums) {
        
        int i=1;
        
        int x=0;
        
        
        
        while(i<nums.length)
        {
            if(nums[i-1]>nums[i]) {x++;}
            
            i++;
            }
        if(x==1)
        {
            if(nums[0]<nums[nums.length-1])return false;
        }
        if(x>1) return false;
return true;
    }
}