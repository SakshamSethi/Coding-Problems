class Solution {
 public int count =0;
    public int findTargetSumWays(int[] nums, int target) {
       if(nums.length==1 )
       {if(nums[0]==target || nums[0]==target*-1) return 1;
        return 0;
       }
     
        check(nums,target,0,0);
        return count;
        
    }
public void check(int nums[],int target,int sum,int i)
{
   
    if(i == nums.length)
    {
        if(sum==target) {count++; return;}
        
        return;
        
    }
    
    check(nums,target,sum+nums[i],i+1);
    check(nums,target,sum-nums[i],i+1);
    return;
}
}